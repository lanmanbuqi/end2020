<template>
    <div id="admin">
        <div class="top">
            <img src="@/assets/img/home/homepage.svg">
            <span>当前位置:数据管理</span>
        </div>

        <div class="main">
            <div class="top-bar">
                <div class="title">数据管理</div>
            </div>
            <div class="data">
                <input ref="year" class="year" type="number" placeholder="请输入年份">
                <select ref="province" class="sheng" >

                <option selected="selected" value="0">--省份--</option>
                <option value="beijing">北京</option>
                <option value="tianjing">天津</option>
                <option value="hebei">河北</option>
                <option value="shanxi1">山西</option>
                <option value="neimenggu">内蒙古</option>
                <option value="liaolin">辽宁</option>
                <option value="jilin">吉林</option>
                <option value="heilongjiang">黑龙江</option>
                <option value="shanghai">上海</option>
                <option value="jiangsu">江苏</option>
                <option value="zhejiang">浙江</option>
                <option value="anhui">安徽</option>
                <option value="fujian">福建</option>
                <option value="jiangxi">江西</option>
                <option value="shandong">山东</option>
                <option value="henan">河南</option>
                <option value="hubei">湖北</option>
                <option value="hunan">湖南</option>
                <option value="guangdong">广东</option>
                <option value="guangxi">广西</option>
                <option value="hainan">海南</option>
                <option value="chongqing">重庆</option>
                <option value="sichuan">四川</option>
                <option value="guizhou">贵州</option>
                <option value="yunnan">云南</option>
                <option value="xizang">西藏</option>
                <option value="sanxi2">陕西</option>
                <option value="gansu">甘肃</option>
                <option value="qinghai">青海</option>
                <option value="ningxia">宁夏</option>
                <option value="xinjiang">新疆</option>

            </select>
                <button @click="chaXun">确定</button>
                <div  >
                    <label ref="population">0</label>
                    <label> 万人</label>
                </div>
                <div>
                    <input ref="xiugai" class="xiugai1" type="number" placeholder="修改为:">
                    <button  class="xiugai2" @click="xiuGai">确定</button>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import {getPopulation,setPopulation} from "network/getU";
    export default {
        name: "Data",
        methods:{
            //某年某省的数据显示
            chaXun(){
                if(this.$refs.year.value !="" && this.$refs.province.value!=0 && this.$refs.year.value>1948 && this.$refs.year.value<2019){
                    const year=this.$refs.year.value
                    const province=this.$refs.province.value
                    getPopulation(year,province).then(res=>{
                        this.$refs.population.innerHTML= res[province]
                    })
                }else{
                    this.$toast.show('请输入1949~2018年的年份，或选择省份',1500)
                }
            },
            xiuGai(){
                if(this.$refs.xiugai.value !=""){
                    const year=this.$refs.year.value
                    const province=this.$refs.province.value
                    const gai=this.$refs.xiugai.value
                    setPopulation(year,province,gai).then(res=>{
                        this.$refs.population.innerHTML=gai
                        this.$toast.show('数据已修改',1500)
                    })
                }
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
    .top-bar{
        position: relative;
        background-color: #f2f2f2;
        height: 80px;
        border:1px solid grey;
    }
    .title{
        position: absolute;
        line-height: 80px;
        font-size: 30px;
        left: 45%;
        height: 80px;
    }
    .main{
        position: relative;
        top: 40px;

    }
    .data{
        position: relative;
        top: 20px;
        left: 0;
    }
    .year{
        line-height: 50px;
        width: 150px;
        height: 50px;
    }
    .sheng{
        line-height: 50px;
        margin-left: 50px;
        width: 120px;
        height: 50px;
    }
    .data button{
        border-radius: 10px;
        background-color: grey;
        line-height: 50px;
        margin-left: 50px;
        width: 80px;
        height: 50px;
    }
    .data div{
        margin-top:  20px;
    }
    .xiugai1{
        line-height: 50px;
        width: 150px;
        height: 50px;
    }
</style>