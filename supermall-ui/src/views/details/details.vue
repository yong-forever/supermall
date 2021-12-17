<template>
  <div class="">
    {{id}}
  </div>
</template>

<script>
import {getGoodDetail} from "@/api/details";
export default {
  name: "details",
  data() {
    return{
      id: -1,//路径传入的商品id
    }
  },
  created() {
    this.id = this.$route.params.id
    console.log("details")
    this.getGoodDetail()
  },
  methods: {
    getGoodDetail(){
      getGoodDetail(this.id).then(res =>{
        console.log(res)
      })
    }
  }
}
</script>

<style scoped>

</style>