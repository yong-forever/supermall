import Vue from 'vue'
import Vuex from 'vuex'
import settings from "@/store/settings";

Vue.use(Vuex)

const store = new Vuex.Store({
  modules: {
    settings
  },
})

export default store
