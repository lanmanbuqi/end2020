<template>
    <div class="main">
        <nav-bar class="home-nav">
            <div slot="right">用户：   请登录</div>
        </nav-bar>
        <div class="title"><span>地理国情管理系统</span></div>
        <div class="inner">
            <table class="table">
                <caption> <h1 class="text">登录  注册</h1> </caption>
                <tr height="30px">
                    <td class="text"><b>账&nbsp;&nbsp;号</b></td>
                    <td><input class="TEXT" type="text" name="username" ref="name"/> </td>
                </tr>
                <tr height="30px">
                    <td class="text"><b>密&nbsp;&nbsp;码</b></td>
                    <td><input class="TEXT" type="password" name="password"  ref="pwd"/> </td>
                </tr>
                <tr height="30px">
                    <td colspan="2" align="right">
                        <input class="TEXT2" type='button' @click="check"  value="登陆系统"/>
                        <input class="TEXT2" type='button' @click="register"  value="注册"/>
                    </td>



                </tr>
            </table>
        </div>
    </div>

</template>

<script>
import NavBar from "components/common/navbar/NavBar";
import {getUserInfo,registerUser} from 'network/getU.js'
export default {
        name: "Home",
        components:{
        NavBar
        },
        data(){
            return{
                name:'',
                pwd:''
            }
        },

        methods:{
            check(){
                this.name=this.$refs.name.value;
                this.pwd=this.$refs.pwd.value;
                this.getUser(this.name,this.pwd)

            },
            register(){
                this.name=this.$refs.name.value;
                this.pwd=this.$refs.pwd.value;
                registerUser(this.name,this.pwd).then(res=>{
                    if(res==true){
                        this.$toast.show('注册成功，请登录',1500)
                        this.$refs.name.value="";
                        this.$refs.pwd.value="";
                        location.reload()
                    }else{
                        this.$toast.show('账号已重复，请重新输入',1500)
                        this.$refs.name.value="";
                        this.$refs.pwd.value="";
                    }
                })

            },
            getUser(name,pwd){
                getUserInfo(name,pwd).then(res=>{
                    if(res.lel==0){
                        this.$store.commit('addUser',res)
                        this.$router.push('/admin')
                    }else if(res.lel==1){
                        this.$store.commit('addUser',res)
                        this.$router.push('/user')
                    }else{
                        this.$toast.show('账户或密码错误请重新输入',1500)
                        this.$refs.name.value=''
                        this.$refs.pwd.value=''
                    }
                })

            },

        },


    }
</script>

<style scoped>
    *all{
        margin: 0;
        padding: 0;
    }
    div.inner,table{
        position:absolute;
    }
    .main{
        height: 100vh;
        width: 100%;
        background:url("~assets/img/home/timg.jpg") no-repeat;
        background-size:100% 100%;
    }
     .text{
         color: black;
     }

    .inner{
        border: 5px solid rgba(255,255,255,1);
        border-radius: 20px;
        width: 370px;
        height: 340px;
        top: 60%;
        left: 70%;
        transform: translate(-50%,-50%);
        box-shadow:11px 11px 11px rgba(50,50,50,1);
    }
    .table{
        top: 7%;
        left: 12%;
        width: 260px;
        height: 190px;
        border-spacing:7px;
    }
    .title span{
        color: white;
        font-size: 70px;
        align-content: center;
        top: 80px;


    }
    .title{
        position: relative;
        top: 100px;
        display: table;
        margin:  0 auto ;
    }
    .TEXT{
        height:72%;
        width: 200px;
    }
    .TEXT2{
        height:72%;
        width: 100px;
        margin-right: 10px;
        margin-left: 10px;
    }
    a {text-decoration: none}
    .home-nav{
        background-color: var(--color-tint);
        color:white;

    }
</style>
