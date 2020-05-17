import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    user :[],
    manage:[],
    data:[]
  },
  mutations: {
    addUser(state,payload){
      state.user=payload
    },
    management(state,payload){
      state.manage=payload
    },
    yearDataAll(state,payload){
      state.data=payload
      },
    del(state,index){
      state.manage.splice(index,1)
    }
  },
  actions: {
  },
  modules: {
  }
})
