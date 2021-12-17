import Vue from 'vue'
import VueRouter from 'vue-router'

// 1.安装插件
Vue.use(VueRouter)

// 2.创建router
const routes = [
  {
    path: '',
    redirect: '/home'
  },
  {
    path: '/home',
    component: (resolve) => require(['@/views/index/index'], resolve)
  },
  {
    path: '/details/:id',
    component: (resolve) => require(['@/views/details/details'], resolve)
  },
  {
    path: '/cart',
    component: (resolve) => require(['@/views/cart/index'], resolve)
  },
  {
    path: '/user',
    component: (resolve) => require(['@/views/user/index'], resolve)
  }
]
const router = new VueRouter({
  routes,
  mode: 'history'
})


export default router
