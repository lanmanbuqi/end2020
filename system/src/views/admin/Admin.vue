<template>
    <div>
    <nav-bar class="home-nav">
        <div slot="right">用户： 你好，{{user}} <span  class="esc" @click="escClick"> 退出 </span></div>
    </nav-bar>
        <LeftContext @isClick="itemClick"/>
        <div class="main">
            <router-view></router-view>
        </div>

    </div>
</template>

<script>
    import NavBar from "components/common/navbar/NavBar";
    import {getUserAll} from "network/getU";
    import LeftContext from "components/common/leftcontext/LeftContext";
    import UserManagement from "./children/UserManagement";
    export default {
        name: "admin",
        components:{
            NavBar,
            getUserAll,
            LeftContext,
            UserManagement
        },
        data(){
            return{
                user:''
            }
        },
        methods:{
            itemClick(index){
                if(index==0){
                    this.$router.push('/admin/management')
                }else if(index==1){
                    this.$router.push('/admin/data')
                }else if(index==2){
                    this.$router.push('/admin/information')
                }
            },
            escClick(){
                this.$router.push('/home')
            }
        },
        activated() {
            this.user=this.$store.state.user.name
        },
        mounted() {
            getUserAll().then(res=>{
                this.$store.commit('management',res)

            })
        }
    }

</script>

<style scoped>
    .home-nav{
        background-color: var(--color-tint);
        color:white;


    }

    .main{
        position: relative;
        top: 20px;
        left: 170px;
    }
</style>