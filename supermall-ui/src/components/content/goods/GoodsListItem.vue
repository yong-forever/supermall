<template>
  <el-link :underline="false" style="padding: 10px" :href="'/details/'+good.id">
    <el-card class="good-item" @click="itemClick" shadow="hover"
             :body-style="{ padding: '0px',height: '100%',display: 'flex',flexDirection: 'column',justifyContent: 'space-between'}">
      <img :src="formatImgSrc(good.img)" alt="" @load="imageLoad"/>
      <div class="good-text" ref="goodText">
        <span class="title">{{ good.title }}</span>
        <div class="good-info">
          <p class="price">￥<span class="f16">{{ (good.price + "").split('.')[0] }}</span><span
              v-if="good.price.toString().includes('.')">.</span><span>{{
              (good.price + "").split('.')[1]
            }}</span>
          </p>
          <span class="sales">销量{{ good.sales }}</span>
        </div>
      </div>
    </el-card>
  </el-link>
</template>

<script>

export default {
  name: "GoodListItem",
  props: {
    good: {
      type: Object,
      default() {
        return {}
      }
    }
  },
  computed: {
    showImage() {
      return this.goodsItem.image || this.goodsItem.show.img
    }
  },
  methods: {
    imageLoad() {
      //bus事件总线
      // this.$bus.$emit('itemImageLoad')
    },
    itemClick() {
      console.log(this.good.id)
    },
    formatImgSrc(src) {
      return src + "_400x9999.v1c7E.81.webp";
    }
  }
}
</script>

<style lang="scss" scoped>
.good-item {
  background: #ffffff;
  border-radius: 10px;
  height: 100%;


  img {
    width: 100%;
    height: 100%;
  }
}

.good-item:hover{
  border: #ff4466 solid 1px;
}

.good-card {
  border-radius: 10px;
  margin: 5px;
}

.good-text {
  padding: 10px;

  .title {
    display: -webkit-box;
    -webkit-box-orient: vertical;
    -webkit-line-clamp: 2;
    text-overflow: ellipsis;
    overflow: hidden;
    font-size: 14px;
    margin-bottom: 10px;
  }

  .good-info {
    display: -webkit-flex;
    display: flex;
    -webkit-justify-content: space-between;
    justify-content: space-between;

    .price {
      color: #FF4466;
      font-size: 13px;
    }

    .sales {
      font-size: 13px;
      line-height: 1;
      background: #ffecef;
      border-radius: 12px;
      color: #f46;
    }
  }
}
</style>
