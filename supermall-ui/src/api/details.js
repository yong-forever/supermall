import request from "@/utils/request";

// 获取 goods
export function getGoodDetail(id) {
  return request({
    url: '/api/goods/'+id,
    headers: {
      isToken: false
    },
    method: 'get',
    timeout: 20000
  })
}