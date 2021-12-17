<template>
  <el-scrollbar style="height: 100%" wrap-style="overflow-x: hidden">
    <el-row type="flex" :gutter="20" justify="center"
            :infinite-scroll-disabled="disabled"
            infinite-scroll-immediate="false"
            infinite-scroll-distance="10"
            v-infinite-scroll="load">
      <el-col :span="3" v-for="(key,index) in Object.keys(this.goods)" :style="getColCenterStyle(index)">
        <good-lists :goods="goods[key]"></good-lists>
      </el-col>
      <el-col :span="9" class="col-merge-wrap" ref="mergeWrap">
        <el-swiper :slides="slides" @elCarouselFinish="elCarouselFinish"></el-swiper>
      </el-col>
    </el-row>
    <el-divider v-if="loading" content-position="center">加载中...</el-divider>
    <el-divider v-if="noMore" content-position="center">没有更多了</el-divider>
  </el-scrollbar>
</template>

<script>
import {getGoods, getSlides} from "@/api/home";
import ElSwiper from "@/components/common/swiper/ElSwiper";
import GoodLists from "@/components/content/goods/GoodsList";


export default {
  name: "indexMain",
  components: {GoodLists, ElSwiper},
  data() {
    return {
      goods: {
        col1: [],
        col2: [],
        col3: [],//center
        col4: [],//center
        col5: [],//center
        col6: [],
        col7: [],
      },
      slidesHeight: 0,//
      loading: false,//是否加载中
      currentPageNum: 1,//每次请求的页码
      pageSize: 30,//每次请求的数量
      pages: 10,//请求的总页数
      isShowBackTop: false,
      slides: [],
      lastScrollY: 0,
      currentType: "general",
      isMounted: false,
      tabItems: [
        {index: "1", title: "综合"},
        {index: "2", title: "新款"},
        {index: "3", title: "流行"}
      ]
    }
  },
  created() {
    this.getGoods({pageNum: this.currentPageNum, pageSize: this.pageSize})
    this.getSlides()
  },
  mounted() {
    this.isMounted = true
  },
  computed: {
    noMore() {
      return this.currentPageNum > this.pages //请求页码大于时 不在加载
      // return this.currentPageNum > 2//请求页码大于时 不在加载
    },
    disabled() {
      return this.loading || this.noMore
    }
  },
  methods: {
    load() {
      this.getGoods({pageNum: this.currentPageNum, pageSize: this.pageSize})
    },
    getGoods(params) {
      this.loading = true
      getGoods(params).then(res => {
        console.log(res)
        let goodsData = res.data.records
        let goodsNum = goodsData.length
        let colNum = Object.keys(this.goods).length
        for (let key of Object.keys(this.goods)) {
          this.goods[key].push(...goodsData.splice(0, goodsNum / colNum))
        }
        this.currentPageNum = res.data.current + 1
        this.pages = res.data.pages
        this.loading = false
        if (this.noMore) {
          this.$message({
            showClose: true,
            message: '没有更多数据了',
            type: 'warning'
          });
        }
      })
    },
    getSlides() {
      getSlides().then(res => {
        this.slides = res.slides
      })
    },
    getColCenterStyle(index) {
      // center 2 - 4
      if (this.isMounted) {
        if (index >= 2 && index <= 4) {
          return {
            marginTop: this.slidesHeight
          }
        }
      }
    },
    elCarouselFinish() {
      this.slidesHeight = (this.$refs.mergeWrap.$el.offsetHeight + 20) + 'px'
    }
  }
}
</script>

<style scoped>
.el-col {
  border-radius: 4px;
}

.col-merge-wrap {
  position: absolute;
}
</style>