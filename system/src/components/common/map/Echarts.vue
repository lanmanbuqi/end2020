<template>

    <div class="chinaMap">
        <div ref="MapMountNode" class="MapMountNode"></div>
    </div>
</template>

<script>
    export default {
        name: "echarts",
        data() {
            return {
                opt:{},
                yData:[],
                data:[]
            }
        },
        props:{
            dataAll:{
                type:Array,
                default() {
                    return [];

                }
            }
        },
        computed:{
            options(){

            }
        },
        methods: {
            resize() {
                this.MapMountNode.resize();
            }
        },
        mounted() {
                this.data =this.dataAll;

                const yData = this.yData;

                this.data.sort(function(o1, o2) {
                    if (isNaN(o1.value) || o1.value == null) return -1;
                    if (isNaN(o2.value) || o2.value == null) return 1;
                    return o1.value - o2.value;
                });
                for (let i = 0; i < this.data.length; i++) {
                    yData.push(data[i].name );
                }

                let option = {
                    title: {
                        text: "中国人口分布",
                        textStyle: {
                            fontSize: 26
                        },
                        x: "center"
                    },
                    tooltip: {
                        show: true,
                        formatter: function(params) {
                            return params.name + "：" + params.data["value"];
                        }
                    },
                    visualMap: {
                        type: "continuous",
                        text: ["", ""],
                        showLabel: true,
                        seriesIndex: [0],
                        min: 0,
                        max: 5000,
                        inRange: {
                            color: ["#edfbfb", "#b7d6f3", "#40a9ed", "#3598c1", "#215096"]
                        },
                        textStyle: {
                            color: "#000"
                        },
                        bottom: 30,
                        left: "left"
                    },
                    grid: {
                        right: 10,
                        top: 80,
                        bottom: 30,
                        width: "20%"
                    },
                    xAxis: {
                        type: "value",
                        scale: true,
                        position: "top",
                        splitNumber: 1,
                        boundaryGap: false,
                        splitLine: {
                            show: false
                        },
                        axisLine: {
                            show: false
                        },
                        axisTick: {
                            show: false
                        },
                        axisLabel: {
                            margin: 2,
                            textStyle: {
                                color: "#aaa"
                            }
                        }
                    },
                    yAxis: {
                        type: "category",
                        nameGap: 16,
                        axisLine: {
                            show: false,
                            lineStyle: {
                                color: "#ddd"
                            }
                        },
                        axisTick: {
                            show: false,
                            lineStyle: {
                                color: "#ddd"
                            }
                        },
                        axisLabel: {
                            interval: 0,
                            textStyle: {
                                color: "#999"
                            }
                        },
                        data: this.yData
                    },
                    geo: {
                        roam: true,
                        map: "china",
                        left: "left",
                        right: "300",
                        layoutSize: "80%",
                        label: {
                            emphasis: {
                                show: false
                            }
                        },
                        itemStyle: {
                            emphasis: {
                                areaColor: "#fff464"
                            }
                        },
                        regions: [
                            {
                                name: "南海诸岛",
                                value: 0,
                                itemStyle: {
                                    normal: {
                                        opacity: 0,
                                        label: {
                                            show: false
                                        }
                                    }
                                }
                            }
                        ]
                    },
                    series: [
                        {
                            name: "mapSer",
                            type: "map",
                            roam: false,
                            zoom: 0.5,
                            geoIndex: 0,
                            label: {
                                show: false
                            },
                            data: this.data
                        },
                        {
                            name: "barSer",
                            type: "bar",
                            roam: false,
                            visualMap: false,
                            zlevel: 2,
                            zoom:1.2,
                            barMaxWidth: 20,
                            itemStyle: {
                                normal: {
                                    color: "#40a9ed"
                                },
                                emphasis: {
                                    color: "#3596c0"
                                }
                            },
                            label: {
                                normal: {
                                    show: false,
                                    position: "right",
                                    offset: [0, 10]
                                },
                                emphasis: {
                                    show: true,
                                    position: "right",
                                    offset: [10, 0]
                                }
                            },
                            data: this.data
                        }
                    ]
                };
                this.opt={}
                this.opt=option

                this.MapMountNode = this.$echarts.init(
                    this.$refs.MapMountNode
                );
                //this.MapMountNode.clear();
                //this.MapMountNode.setOption(this.opt,true);
                // on(window, 'resize', this.resize)

        },
        watch:{
            dataAll:function(){
                this.MapMountNode = this.$echarts.init(
                    this.$refs.MapMountNode
                );
                this.MapMountNode.clear();
                this.MapMountNode.setOption(this.opt,true);

            }
        },
        beforeDestroy() {
            this.off(window, "resize", this.resize);
        }
    }

</script>

<style scoped>
    .MapMountNode{
        width: 80%;
        height: 800px;
        margin: auto;
    }

</style>