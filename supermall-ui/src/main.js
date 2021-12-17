import Vue from 'vue'
import ElementUI from 'element-ui';
import "@/assets/css/element-variables.scss"
import 'element-ui/lib/theme-chalk/display.css';
import App from './App.vue'
import store from "@/store";
import router from "@/router";

Vue.config.productionTip = false

Vue.use(ElementUI)

new Vue({
  render: h => h(App),
  store,
  router
}).$mount('#app')

