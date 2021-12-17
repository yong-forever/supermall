function scrollFunc(){
  $("#container").scroll(function(){
    var $this =$(this),
        viewH =$(this).height(),//可见高度
        contentH =$(this).get(0).scrollHeight,//内容高度
        scrollTop =$(this).scrollTop();//滚动高度
    if(contentH = viewH + scrollTop) { //当滚动到底部时，

    }
    if(contentH - viewH - scrollTop <= 100) { //当滚动到距离底部100px时,

    }
    if(scrollTop/(contentH -viewH) >= 0.95){ //当滚动到距离底部5%时
      // 这里加载数据..
    }
  });
}