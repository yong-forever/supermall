<template>
  <el-scrollbar style="height: 100%;">
    <div class="content">
      <slot></slot>
    </div>
  </el-scrollbar>
</template>


<script>
export default {
  name: "ElScroll",
  data() {
    return {
      count: 10,
      loading: false
    }
  },
  computed: {
    noMore() {
      return this.count >= 20
    },
    disabled() {
      return this.loading || this.noMore
    }
  },
  methods: {
    load() {
      this.loading = true
      setTimeout(() => {
        this.count += 2
        this.loading = false
      }, 2000)
    }
  }
}
</script>

<style scoped>

</style>