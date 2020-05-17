import Vue from 'vue'
import VueRouter from 'vue-router'
const Home= () => import ('views/home/Home.vue')
const Admin=() => import('views/admin/Admin.vue')
const User=() => import('views/user/User.vue')
const Management =() => import('views/admin/children/UserManagement.vue')
const Data =() => import('views/admin/children/Data.vue')
const Information =() => import('views/admin/children/Information.vue')




Vue.use(VueRouter)

  const routes = [
    {
      path:'',
      redirect:'/home'
    },
    {
      path:'/home',
      component:Home
    },
    {
      path:'/admin',
      component:Admin,
      children:[
        {
          path:'',
          redirect:'Management'
        },
        {
          path:'management',
          component:Management
        },
        {
          path:'data',
          component:Data
        },
        {
          path:'information',
          component:Information
        }
      ]
    },
    {
      path:'/user',
      component:User
    }

]

const router = new VueRouter({
  mode: 'history',
  routes
})

export default router
