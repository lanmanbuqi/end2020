import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import toast from "components/common/toast/index";
Vue.config.productionTip = false

//解决路由重复跳转的错误
import Router from 'vue-router'
Vue.use(Router)
const originalPush = Router.prototype.push
Router.prototype.push = function push(location) {
  return originalPush.call(this, location).catch(err => err)
}


//放入原型
Vue.use(toast)

//引入图表
import echarts from 'echarts'
import 'echarts/map/js/china'
Vue.prototype.$echarts = echarts

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
