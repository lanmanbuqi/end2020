<template>
    <div class="bar">
        <div class="box">
            <div v-for="(item,index) in mes"
                 :class="{'sh':a==index}" @click="abClick(index)">{{item}}
            </div>

        </div>
    </div>
</template>

<script>
    export default {
        name: "LeftContext",
        data(){
            return{
                mes:['用户管理','数据管理','信息查询'],
                a:0
            }
        },
        methods:{
            abClick(index){
                this.a=index
                this.$emit('isClick',index)
            }
        }
    }
</script>

<style scoped>
    .bar{
        position: fixed;
        left: 0;
        top: 60px;
        bottom: 0;
        width: 150px;
        background-color: black;

    }
    .box{
        position: relative;
        width: 100%;
        text-align:center;
        top:60px;
    }
    .box div{
        margin-top: 0px;
        line-height: 50px;
        color: white;
        font-size: 20px;
    }
     .sh{
        background-color: #222222;
    }
</style>