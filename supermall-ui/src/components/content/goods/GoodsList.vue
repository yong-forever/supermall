<template>
  <div>
    <goods-list-item v-for="good in goods" :good="good"></goods-list-item>
  </div>
</template>

<script>
import GoodsListItem from "./GoodsListItem";

export default {
  name: "GoodLists",
  components: {
    GoodsListItem
  },
  props: {
    goods: {
      type: Array,
      default() {
        return new Array()
      }
    }
  },
  data() {
    return {
      loading: true
    }
  },
  computed: {
    noMore() {
      return false
    },
    disabled() {
      return this.loading || this.noMore
    }
  },
  methods: {
  }
}
</script>

<style scoped>
</style>
