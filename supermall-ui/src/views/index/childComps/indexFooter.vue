<template>
  <el-footer :style="{height: '150px',background: this.$store.state.settings.theme}">
    <el-row type="flex" justify="center" align="middle" style="height: 100%">
      <el-col :span="6">
        <div class="kFmqyc">
          <a href="" target="_blank" rel="noopener noreferrer">规则中心</a>
          <a href="" target="_blank" rel="noopener noreferrer">隐私政策</a>
          <a href="">营业执照</a>
          <a href="" target="_blank" rel="noopener noreferrer">加入我们</a>
          <a href="" target="_blank" rel="noopener noreferrer">在线客服</a>
          <a href="" target="_blank" rel="noopener noreferrer">廉正举报</a>
          <a href="" target="_blank" rel="noopener noreferrer">上海工商行政管理</a></div>
      </el-col>
      <el-col :span="6">
        <ul class="syKsX" style="margin: auto;">
          <li data-spm-anchor-id="a2f95.17632747.0.i4.501a32bd9cKmbu">公安备案号
            <a href="" target="_blank" rel="noopener noreferrer"
               data-spm-anchor-id="a2f95.17632747.0.0">54242245254</a>
          </li>
          <li data-spm-anchor-id="a2f95.17632747.0.i1.501a32bd9cKmbu">互联网药品信息服务资格证书:<span>(沪)-经营性-5422-5224</span>
          </li>
          <li>增值电信业务许可证:
            <a href="" target="_blank">沪B2-5242442</a>
            <a href="" target="_blank" rel="noopener noreferrer">沪ICP备 54245-1</a></li>
          <li data-spm-anchor-id="a2f95.17632747.0.i2.501a32bd9cKmbu">违法和不良信息举报电话:<span>54582452-选消费者-选0</span></li>
        </ul>
        <span class="Cop">Copyright ©2018-2021 www.yong-forever@aliyun.com, All Rights Reserved.</span>
      </el-col>
      <el-col :span="6" class="hmqpxx" style="text-align: center">
        <a href="http://www.shjbzx.cn/?spm=a2f95.17632747.0.0.501a32bd9cKmbu" target="_blank"
           rel="noopener noreferrer" data-spm-anchor-id="a2f95.17632747.0.0">
          <img src="//cube.elemecdn.com/d/bd/89f16fa4a346910a896efc7c033afpng.png" alt="举报中心"
               data-spm-anchor-id="a2f95.17632747.0.i9.501a32bd9cKmbu" style="border: 1px solid rgb(190, 190, 190);">
        </a>
        <a href="https://www.12377.cn/?spm=a2f95.17632747.0.0.501a32bd9cKmbu" target="_blank"
           rel="noopener noreferrer" data-spm-anchor-id="a2f95.17632747.0.0">
          <img
              src="//cube.elemecdn.com/2/1e/565aa5e8227995e1d625d1de969fbpng.png?x-oss-process=image/resize,h_80,m_fixed"
              alt="违法和不良信息举报中心" data-spm-anchor-id="a2f95.17632747.0.i7.501a32bd9cKmbu">
        </a>
        <a href="http://diaocha.caict.ac.cn/t/7JNr?spm=a2f95.17632747.0.0.501a32bd9cKmbu" target="_blank"
           rel="noopener noreferrer" data-spm-anchor-id="a2f95.17632747.0.0">
          <img src="//img.alicdn.com/imgextra/i1/O1CN01rILxZo1P6K0UgKpS5_!!6000000001791-0-tps-238-120.jpg"
               alt="饿了么公司服务质量用户满意指数测评问卷" data-spm-anchor-id="a2f95.17632747.0.i10.501a32bd9cKmbu">
        </a>
      </el-col>
    </el-row>
  </el-footer>
</template>

<script>

export default {
  name: "indexFooter",
}
</script>

<style scoped>

.kFmqyc {
  max-width: 300px;
  font-size: 12px;
  line-height: 1.5;
}

.kFmqyc a {
  margin-right: 12px;
}

.hmqpxx a img {
  max-height: 32px;
}

.syKsX {
  font-size: 12px;
  line-height: 1.5;
}

.Cop {
  font-size: 12px;
  line-height: 1.5;
}
</style>