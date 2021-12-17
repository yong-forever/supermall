package com.yong.web.controller.Api;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yong.common.core.controller.BaseController;
import com.yong.common.core.domain.AjaxResult;
import com.yong.common.core.domain.entity.Goods;
import com.yong.common.core.domain.entity.Slides;
import com.yong.system.service.IGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.yong.system.service.ISlidesService;

import java.util.List;


@Api(tags = "首页数据")
@RestController
@RequestMapping("/api")
public class IndexController extends BaseController {

    @Autowired
    private ISlidesService slidesService;

    @Autowired
    private IGoodsService goodsService;

    /**
     * 首次请求首页数据
     * @return
     */
    @ApiOperation("首次请求首页数据")
    @GetMapping("/indexMobile")
    public AjaxResult index(@RequestParam int pageNum,@RequestParam(defaultValue = "10") int pageSize){
        AjaxResult result=AjaxResult.success();
        /**
         * 获取轮播图
         */
        LambdaQueryWrapper<Slides> slidesWrapper=new LambdaQueryWrapper<>();
        slidesWrapper.eq(Slides::getStatus,1);
        List<Slides> slides = slidesService.list(slidesWrapper);
        result.put("slides",slides);
        /**
         * 获取综合商品
         */
        LambdaQueryWrapper<Goods> goodsWrapper0=new LambdaQueryWrapper<>();
        goodsWrapper0.eq(Goods::getSale_type,1);
        IPage<Goods> general = goodsService.page(new Page<Goods>(pageNum,pageSize), goodsWrapper0);
        result.put("general",general);
        /**
         * 获取新款商品
         */
        LambdaQueryWrapper<Goods> goodsWrapper1=new LambdaQueryWrapper<>();
        goodsWrapper1.eq(Goods::getSale_type,2);
        IPage<Goods> news = goodsService.page(new Page<Goods>(pageNum,pageSize), goodsWrapper1);
        result.put("news",news);
        /**
         * 获取流行商品
         */
        LambdaQueryWrapper<Goods> goodsWrapper2=new LambdaQueryWrapper<>();
        goodsWrapper2.eq(Goods::getSale_type,3);
        IPage<Goods> fashion = goodsService.page(new Page<Goods>(pageNum,pageSize), goodsWrapper2);
        result.put("fashion",fashion);
        return result;
    }

    /**
     * 获取轮播图
     * @return
     * http://localhost:8088/api/index?pageNum=1&pageSize=10
     */
    @ApiOperation("获取轮播图")
    @GetMapping("/slides")
    public AjaxResult slides(){
        AjaxResult result=AjaxResult.success();
        /**
         * 获取轮播图
         */
        LambdaQueryWrapper<Slides> slidesWrapper=new LambdaQueryWrapper<>();
        slidesWrapper.eq(Slides::getStatus,1);
        List<Slides> slides = slidesService.list(slidesWrapper);
        result.put("slides",slides);
        return result;
    }
}
