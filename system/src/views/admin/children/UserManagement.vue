<template>
    <div id="admin">
        <div class="top">
            <img src="@/assets/img/home/homepage.svg">
            <span>当前位置:用户管理</span>
        </div>
        <div class="main">
            <div class="top-bar">
                <div class="title">账号管理</div>
            </div>
            <div class="list-title">
                <div><span>ID</span></div>
                <div><span>用户名</span></div>
                <div><span>角色信息</span></div>
                <div><span>操作管理</span></div>
            </div>
            <div class="list" v-for="(item,index) in user">
                <div><span>{{item.id}}</span></div>
                <div><span>{{item.name}}</span></div>
                <div><span>{{item.lel}}</span></div>
                <div><span class="del" @click="del(index)">删除</span></div>
            </div>
        </div>
    </div>
</template>

<script>
    import {dele} from "network/getU";

    export default {
        name: "UserManagement",
        data(){
            return{
            }

        },
        computed:{
            user(){
                return this.$store.state.manage

            }
        },
        methods:{
            del(index){
                dele(this.$store.state.manage[index].name).then(res=>{
                    console.log(res);
                })
                this.$store.commit("del",index)

            }
        }


    }
</script>

<style scoped>
    #admin{
        position: relative;
        width: 90%;
    }
    .top{
        position: relative;
        width: 100%;
        height: 35px;
        line-height: 35px;
        border-bottom: 1px solid grey;
    }
    .top img{
        width: 30px;
        height: 30px;
    }
    .top span{
        height: 30px;
        line-height: 30px;
        font-size: 20px;
    }
    .main{
        position: relative;
        top: 40px;
        border:1px solid grey;
    }
    .top-bar{
        position: relative;
        background-color: #f2f2f2;
        height: 80px;
        border-bottom:1px solid grey;
        border-right:1px solid grey;
    }
    .title{
        position: absolute;
        line-height: 80px;
        font-size: 30px;
        left: 45%;
        height: 80px;
    }

    .list-title div {
        font-weight: bold;
        font-size: 20px;
        color: black;
        display: inline-block;
        width: 25%;
        line-height: 30px;
        text-align:center;
    }
    .list div {
        font-size: 20px;
        color: black;
        display: inline-block;
        width: 25%;
        line-height: 30px;
        text-align:center;
    }
    .del{
        padding:  3px;
        border-radius: 5px;
        background-color: red;
    }


</style>