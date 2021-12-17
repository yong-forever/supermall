<template>
  <!--ref / children ref引用防止重名 -->
  <div class="wrapper" ref="wrapper">
    <div class="content">
      <slot></slot>
    </div>
  </div>
</template>

<script>
  import BScroll from 'better-scroll'

  export default {
    name: "Scroll",
    props: {
      probeType: {
        type: Number,
        default: 0
      },
      pullUpLoad: {
        type: Boolean,
        default: false
      }
    },
    data() {
      return {
        _scroll: null
      }
    },
    mounted() {
      this._scroll = new BScroll(this.$refs.wrapper, {
        probeType: this.probeType,//动态
        click: true, //使该组件内的点击事件可以使用
        pullUpLoad: this.pullUpLoad //动态启用 上拉事件
      })

      // 监听滑动事件
      if (this.probeType === 2 || this.probeType === 3) {
        this._scroll.on('scroll', (position) => {
          this.$emit('scroll', position)//发出去，谁想用就调用
        })
      }

      // 监听上拉事件
      if(this.pullUpLoad){
        this._scroll.on('pullingUp', () => {
          this.$emit('pullingUp')//发出去，谁想用就调用
        })
      }
    },
    methods: {
      // this._scroll 在mounted后创建 其他调用方法可能为空
      // this._scroll &&  判断是否为空
      scrollTo(x, y, time = 500) {
        this._scroll && this._scroll.scrollTo(x, y, time)
      },
      finishPullUp() {
        this._scroll && this._scroll.finishPullUp()
      },
      refresh() {
        this._scroll && this._scroll.refresh()
      },
      getY() {
        return this._scroll ? this._scroll.y : 0
      }
    }
  }
</script>

<style scoped>

</style>
