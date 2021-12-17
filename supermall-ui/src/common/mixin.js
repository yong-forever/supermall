import {debounce} from "@/common/utils";

export const itemListenerMixin = {
  data(){
    return {
      itemImgListener: null,
      newRefresh: null
    }
  },
  mounted(){
    this.newRefresh = debounce(this.$refs.scroll.refresh(), 100)
    // this.scroll 在mounted后创建 其他调用方法可能为空
    // this.scroll &&  判断是否为空

    // 保存监听事件
    this.itemImgListener=() => {
      //this.scroll && this.$refs.scroll.refresh()
      this.newRefresh()
    }

    // 3.监听item图片加载完成
    this.$bus.$on('itemImageLoad', this.itemImgListener)
  }
}

export const el = {
  methods: {
    getThemeColor(){
      return this.$store.state.settings.theme
    }
  }
}