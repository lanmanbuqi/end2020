<template>
	<div class="toast">

		<div class="toast" v-show="isShow" :class="{show:isShow}">
			<div>{{message}}</div>
			<div class="top">  </div>
		</div>

	</div>

</template>

<script>
    export default {
			name: "toast",
			// props:{
			// 	message{
			// 		type:String,
			// 		default:''
			// 	},
			// 	show:{
			// 		type:Boolean,
			// 		default:false
			// 	}
			// }
			data(){
				return{
					message:'',
					isShow:false
				}
			},
			methods:{
				show(message,duration=2000){
					this.isShow=true
					this.message=message
					setTimeout(()=>{
						this.isShow=false;
						this.message=''
					},duration)
				}
			}
    }
</script>

<style scoped>
	.toast{
		position: fixed;
		white-space: nowrap;
		font-size: 20px;
		top: 50%;
		left: 50%;
		transform: translate(-50%,-50%);
		color: white;
		background-color: rgba(207, 16, 254, 0.8);
		border-radius: 10px 10px;
		z-index: 90;
		box-shadow: 10px 10px 5px #250725;

	}
	.top{
		position: absolute;
		top: 0;
		left: 0;
		height: 40px;
		width: 100%;
		background-color: rgba(0, 32, 198, 0.9);
		border-radius: 10px 10px 0px 0px;
		z-index: 999;
	}
	.show{
		size: 20px;
		padding: 80px 60px;
	}
</style>
