import request from "@/utils/request";

// 获取首页数据
export function getIndex(params) {
  return request({
    url: '/api/index',
    headers: {
      isToken: false
    },
    params:params,
    method: 'get',
    timeout: 20000
  })
}

// 获取 slides
export function getSlides() {
  return request({
    url: '/api/slides',
    headers: {
      isToken: false
    },
    method: 'get',
    timeout: 20000
  })
}

// 获取 goods
export function getGoods(params) {
  return request({
    url: '/api/goods',
    headers: {
      isToken: false
    },
    params:params,
    method: 'get',
    timeout: 20000
  })
}