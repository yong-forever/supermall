<template>
    <el-carousel trigger="click" indicator-position="none" height="auto">
      <el-carousel-item v-for="item in slides" >
        <a :href="item.url"  style="height: 100%">
          <img ref="slideImg" :src="item.img" :alt="item.title" style="width: 100%;height: 100%" >
        </a>
      </el-carousel-item>
      <img :src="slides.length==0?null:this.slides[0].img" class="toolImg" @load="elCarouselFinish">
    </el-carousel>
</template>
<script>
export default {
  name: "ElSwiper",
  props: {
    slides:{
      type: Array,
      default(){
        return []
      }
    }
  },
  created() {
  },
  methods: {
    elCarouselFinish(){
      this.$emit('elCarouselFinish')
    }
  }
}
</script>
<style scoped>
.toolImg{
  opacity: 0;
  width: 100%;
}
</style>