<template>
  <div id="app">
    <el-container class="is-vertical" style="height: 100%">
      <index-header></index-header>

      <el-main>
        <keep-alive exclude="details">
          <router-view></router-view>
        </keep-alive>
      </el-main>

      <index-footer v-show="isShowFooter"></index-footer>
    </el-container>
  </div>
</template>

<script>
import indexHeader from "@/views/index/childComps/indexHeader";
import indexFooter from "@/views/index/childComps/indexFooter";

export default {
  name: 'App',
  components: {indexHeader, indexFooter},
  data() {
    return {
      isShowFooter: false
    }
  },
  methods: {
    load() {
      console.log('hdsah')
    }
  }
}
</script>

<style>
@import "assets/css/base.css";

html, body, #app {
  height: 100%;
}

/*去掉横向滚动条*/
.el-scrollbar__wrap {
  overflow-x: hidden;
}
</style>
