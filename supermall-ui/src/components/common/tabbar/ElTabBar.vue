<template>
  <el-menu
      :default-active="path"
      class="el-tab-bar"
      mode="horizontal"
      :router="isRouter"
      @select="tabClick">
    <el-menu-item v-for="(item) in tabItems"
                  :index="item.index"
                  :style="{height:tabHeight,lineHeight:tabHeight}"
    >{{ item.title }}
    </el-menu-item>
    <!--    <el-menu-item index="/home">首页</el-menu-item>-->
    <!--    <el-menu-item index="/category">分类</el-menu-item>-->
    <!--    <el-menu-item index="/cart">购物车</el-menu-item>-->
    <!--    <el-menu-item index="/user">我的</el-menu-item>-->
  </el-menu>
</template>

<script>
export default {
  name: "ElTabBar",
  props: {
    tabItems: {
      type: Array,
      default() {
        return new Array()
      }
    },
    isRouter: {
      type: Boolean,
      default(){
        return false
      }
    },
    tabHeight: {
      type: String,
      default(){
        return '60px'
      }
    }
  },
  data() {
    return {
      path: this.tabItems[0].index
    }
  },
  computed: {},
  methods: {
    tabClick(key, keyPath) {
      this.$emit('tabClick', key)
    },
  }
}
</script>

<style lang="scss" scoped>
.el-tab-bar {
  width: 100%;
  border: none;
  position: fixed;
  bottom: 0;
  display: flex;
}

.el-menu-item {
  flex: 1;
  transition: none;
  text-align: center;
}

.el-menu--horizontal > .el-menu-item.is-active {
  color: #FF4466;
  border: none;
}


</style>