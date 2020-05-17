<template>
    <div id="admin">
        <div class="top">
            <img src="@/assets/img/home/homepage.svg">
            <span>当前位置:信息查询</span>
        </div>
        <div class="main">
            <div class="top-bar">
                <div class="title">信息查询</div>
            </div>
            <div>
                <label>请输入年份：</label><input ref="year" @change="getAll" type="number" value="1949">
            </div>
            <div>
                <Echarts :dataAll="dataAll"></Echarts>
            </div>

        </div>
    </div>
</template>

<script>
    import {getDataAll} from "network/getU";
    import Echarts from "components/common/map/Echarts";
    export default {
        name: "Information",
        components:{
            Echarts
        },
        data(){
            return{
                dataAll:[],
                resize(){
                    this.MapMountNode.resize();
                }
            }


        },
        methods:{
           getAll(){
               this.dataAll=[]
               const year=this.$refs.year.value
               if(year>=1949 && year<2019){
                   getDataAll(year).then(res=>{

                       // const a= JSON.parse(JSON.stringify(res).replace(/beijing/g,"北京"));
                      Object.keys(res).forEach(item=>{

                          if(item=='beijing') this.dataAll.push({name:'北京',value:res.beijing})
                          if(item=='tianjing') this.dataAll.push({name:'天津',value:res.tianjing})
                          if(item=='hebei') this.dataAll.push({name:'河北',value:res.hebei})
                          if(item=='shanxi1') this.dataAll.push({name:'山西',value:res.shanxi1})

                           if(item=='neimenggu') this.dataAll.push({name:'内蒙古',value:res.neimenggu})
                           if(item=='liaolin') this.dataAll.push({name:'辽宁',value:res.liaolin})
                          if(item=='jilin') this.dataAll.push({name:'吉林',value:res.jilin})
                          if(item=='heilongjiang') this.dataAll.push({name:'黑龙江',value:res.heilongjiang})
                          if(item=='shanghai') this.dataAll.push({name:'上海',value:res.shanghai})
                          if(item=='jiangsu') this.dataAll.push({name:'江苏',value:res.jiangsu})
                          if(item=='zhejiang') this.dataAll.push({name:'浙江',value:res.zhejiang})
                          if(item=='anhui') this.dataAll.push({name:'安徽',value:res.anhui})
                          if(item=='fujian') this.dataAll.push({name:'福建',value:res.fujian})
                          if(item=='jiangxi') this.dataAll.push({name:'江西',value:res.jiangxi})

                          if(item=='shandong') this.dataAll.push({name:'山东',value:res.shandong})
                          if(item=='henan') this.dataAll.push({name:'河南',value:res.henan})
                          if(item=='hubei') this.dataAll.push({name:'湖北',value:res.hubei})
                          if(item=='hunan') this.dataAll.push({name:'湖南',value:res.hunan})
                          if(item=='guangdong') this.dataAll.push({name:'广东',value:res.guangdong})
                          if(item=='guangxi') this.dataAll.push({name:'广西',value:res.guangxi})
                          if(item=='hainan') this.dataAll.push({name:'海南',value:res.hainan})
                          if(item=='chongqign') this.dataAll.push({name:'重庆',value:res.chongqign})
                          if(item=='sichuan') this.dataAll.push({name:'四川',value:res.sichuan})

                          if(item=='guizhou') this.dataAll.push({name:'贵州',value:res.guizhou})
                          if(item=='yunnan') this.dataAll.push({name:'云南',value:res.yunnan})
                          if(item=='xizang') this.dataAll.push({name:'西藏',value:res.xizang})
                          if(item=='sanxi2') this.dataAll.push({name:'陕西',value:res.sanxi2})
                          if(item=='gansu') this.dataAll.push({name:'甘肃',value:res.gansu})
                          if(item=='qinghai') this.dataAll.push({name:'青海',value:res.qinghai})
                          if(item=='ningxia') this.dataAll.push({name:'宁夏',value:res.ningxia})
                          if(item=='xinjiang') this.dataAll.push({name:'新疆',value:res.xinjiang})
                      })

                   })
                   this.$store.commit('yearDataAll',this.dataAll)

               }else{

               }
           },

        },
        mounted() {
            getDataAll(1950).then(res=>{
                // const a= JSON.parse(JSON.stringify(res).replace(/beijing/g,"北京"));
                Object.keys(res).forEach(item=>{

                    if(item=='beijing') this.dataAll.push({name:'北京',value:res.beijing})
                    if(item=='tianjing') this.dataAll.push({name:'天津',value:res.tianjing})
                    if(item=='hebei') this.dataAll.push({name:'河北',value:res.hebei})
                    if(item=='shanxi1') this.dataAll.push({name:'山西',value:res.shanxi1})

                    if(item=='neimenggu') this.dataAll.push({name:'内蒙古',value:res.neimenggu})
                    if(item=='liaolin') this.dataAll.push({name:'辽宁',value:res.liaolin})
                    if(item=='jilin') this.dataAll.push({name:'吉林',value:res.jilin})
                    if(item=='heilongjiang') this.dataAll.push({name:'黑龙江',value:res.heilongjiang})
                    if(item=='shanghai') this.dataAll.push({name:'上海',value:res.shanghai})
                    if(item=='jiangsu') this.dataAll.push({name:'江苏',value:res.jiangsu})
                    if(item=='zhejiang') this.dataAll.push({name:'浙江',value:res.zhejiang})
                    if(item=='anhui') this.dataAll.push({name:'安徽',value:res.anhui})
                    if(item=='fujian') this.dataAll.push({name:'福建',value:res.fujian})
                    if(item=='jiangxi') this.dataAll.push({name:'江西',value:res.jiangxi})

                    if(item=='shandong') this.dataAll.push({name:'山东',value:res.shandong})
                    if(item=='henan') this.dataAll.push({name:'河南',value:res.henan})
                    if(item=='hubei') this.dataAll.push({name:'湖北',value:res.hubei})
                    if(item=='hunan') this.dataAll.push({name:'湖南',value:res.hunan})
                    if(item=='guangdong') this.dataAll.push({name:'广东',value:res.guangdong})
                    if(item=='guangxi') this.dataAll.push({name:'广西',value:res.guangxi})
                    if(item=='hainan') this.dataAll.push({name:'海南',value:res.hainan})
                    if(item=='chongqign') this.dataAll.push({name:'重庆',value:res.chongqign})
                    if(item=='sichuan') this.dataAll.push({name:'四川',value:res.sichuan})

                    if(item=='guizhou') this.dataAll.push({name:'贵州',value:res.guizhou})
                    if(item=='yunnan') this.dataAll.push({name:'云南',value:res.yunnan})
                    if(item=='xizang') this.dataAll.push({name:'西藏',value:res.xizang})
                    if(item=='sanxi2') this.dataAll.push({name:'陕西',value:res.sanxi2})
                    if(item=='gansu') this.dataAll.push({name:'甘肃',value:res.gansu})
                    if(item=='qinghai') this.dataAll.push({name:'青海',value:res.qinghai})
                    if(item=='ningxia') this.dataAll.push({name:'宁夏',value:res.ningxia})
                    if(item=='xinjiang') this.dataAll.push({name:'新疆',value:res.xinjiang})
                })

            })
            this.$store.commit('yearDataAll',this.dataAll)

        },

    }
</script>

<style scoped>
    #admin{
        position: relative;
        width: 90%;
        height: 100vh;
    }
    .main{
        position: relative;
        top: 40px;
        border:1px solid grey;
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
        border-right:1px solid grey;

    }
    .title{
        position: absolute;
        line-height: 80px;
        font-size: 30px;
        left: 45%;
        height: 80px;
    }

</style>