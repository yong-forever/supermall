<template>
  <el-header style="height: auto">
    <el-row class="header-nav" type="flex" justify="center">
      <el-col :span="20" class="header-nav-content">
        <div class="r">
          <el-link class="item" :underline="false" icon="el-icon-s-home">首页</el-link>
          <el-link class="item" :underline="false" icon="el-icon-s-shop">商城</el-link>
          <el-link class="item" :underline="false" icon="el-icon-s-order">我的订单</el-link>
          <el-link class="item" :underline="false" icon="el-icon-s-promotion">关于我们</el-link>
        </div>
      </el-col>
    </el-row>
    <el-row class="header-wrap" type="flex" justify="center" align="middle" style="width: 90%;margin: 0px auto">
      <el-col class="header-wrap-col" :xs="8" :sm="4" :md="2" :lg="2">
        <a href="/">
          <img src="@/assets/logo.png" alt="" style="height:80%;vertical-align: middle">
        </a>
      </el-col>
      <el-col class="header-wrap-col" :xs="0" :sm="4" :md="4" :lg="5">
        <el-popover
            placement="top"
            trigger="hover">
          <div class="header-content-category">
            <div class="category-item header-category-market1">
              <div class="header-category-flex">
                <div class="header-category-title">主题市场</div>
              </div>
              <ul>
                <li class="header-category-item">
                  <el-link :underline="false">上衣</el-link>
                </li>
                <li class="header-category-item">
                  <el-link :underline="false">裤子</el-link>
                </li>
                <li class="header-category-item">
                  <el-link :underline="false">裙装</el-link>
                </li>
                <li class="header-category-item">
                  <el-link :underline="false">内衣</el-link>
                </li>
                <li class="header-category-item">
                  <el-link :underline="false">鞋子</el-link>
                </li>
              </ul>
            </div>
            <div class="category-item header-category-market2">
              <div class="header-category-flex">
                <div class="header-category-title">热门品牌</div>
              </div>
              <ul>
                <li class="header-category-item" v-for="index in 7">
                  <el-link :underline="false">remenpinpai{{ index }}</el-link>
                </li>
              </ul>
            </div>
            <div class="category-item header-category-market3">
              <div class="header-category-flex">
                <div class="header-category-title">流行话题</div>
              </div>
              <ul>
                <li class="header-category-item" v-for="index in 7">
                  <el-link :underline="false">#流行话题{{ index }}#</el-link>
                </li>
              </ul>
            </div>
          </div>
          <el-link :underline="false" slot="reference" icon="el-icon-s-grid" class="f16">目录</el-link>
        </el-popover>
      </el-col>
      <el-col class="header-wrap-col" :xs="16" :sm="12" :md="12" :lg="10">
        <div class="top-nav-search">
          <el-input placeholder="请输入内容" v-model="inputSearch" class="input-with-select">
            <el-button slot="append" icon="el-icon-search"></el-button>
          </el-input>
        </div>
      </el-col>
      <el-col class="header-wrap-col hidden-sm-and-down" :md="4" :lg="5">
        <el-row class="header-nav-list" type="flex" justify="space-around" align="middle" style="height: 100%">
          <div class="nav-list-item">
            <i class="el-icon-message nav-list-item-icon" @click="iconMessage"></i>
            <span>消息</span>
          </div>

          <div class="nav-list-item">
            <i class="el-icon-star-off nav-list-item-icon" @click="iconMessage"></i>
            <span>收藏</span>
          </div>

          <div class="nav-list-item">
            <i class="el-icon-shopping-cart-1 nav-list-item-icon" @click="iconMessage"></i>
            <span>购物车</span>
          </div>

          <div class="nav-list-item">
            <i class="el-icon-mobile-phone nav-list-item-icon" @click="iconMessage"></i>
            <span>下载APP</span>
          </div>
        </el-row>
      </el-col>
      <el-col class="header-wrap-col hidden-xs-and-down" :sm="4" :md="2" :lg="2" style="text-align: center;">
        <el-avatar class="nav-list-item-icon" icon="el-icon-user-solid" style="vertical-align: middle"></el-avatar>
        <span class="f14 ml5">登录</span>
      </el-col>
    </el-row>
  </el-header>
</template>

<script>
import {el} from "@/common/mixin"

export default {
  name: "indexHeader",
  data() {
    return {
      inputSearch: ""
    }
  },
  mixins: [el],
  created() {
    console.log(this.$store.state.settings.theme)
  },
  methods: {
    iconMessage() {
      console.log('message')
    }
  }
}
</script>

<style lang="scss" scoped>
@import "src/assets/css/var";

.nav-list-item {
  display: flex;
  flex-direction: column;
  line-height: initial;
  text-align: center;
}

.nav-list-item span {
  font-size: 14px;
}

.nav-list-item-icon {
  font-size: 150%;
}

.nav-list-item-icon:hover {
  cursor: pointer;
  color: $--color-primary;
}

.top-nav-search {
}

.header-category-item {
  display: inline-block;
  font-size: 12px;
  color: #666;
  margin-right: 30px;
  line-height: 36px;
}

.header-wrap-col {
  height: 100%;
}

.header-content-category .header-category-title {
  font-size: 16px;
  color: #333;
}

.header-content-category {
  display: flex;
  width: 1200px;
  height: 200px;
}

.category-item {
  flex: 1;
  height: 100%;
  padding: 30px 0px 30px 20px;
}

.header-content-category .category-item:not(:first-child) {
  border-left: 1px solid #EEEEEE;
}


.header-nav {
  line-height: 33px;
  height: 33px;
  background: #fff;
  border-bottom: 1px solid #F0F0F0;
}

.header-nav-content .item:not(:first-child):before {
  content: "|";
  margin: 0 20px;
  font-weight: 300;
  color: #999999;
}

.header-wrap {
  line-height: 100px;
  height: 100px;
  background: #fff;
}

.header-wrap-content {
  height: 100px;
}

</style>