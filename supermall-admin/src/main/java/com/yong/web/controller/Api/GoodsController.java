package com.yong.web.controller.Api;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yong.common.core.domain.AjaxResult;
import com.yong.common.core.domain.entity.Goods;
import com.yong.common.core.domain.vo.GoodsVo;
import com.yong.system.service.IGoodsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(tags = "商品")
@RestController
@RequestMapping("/api")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    @GetMapping("/goods")
    public AjaxResult goods(@RequestParam int pageNum,@RequestParam(defaultValue = "10") int pageSize){
        AjaxResult result=AjaxResult.success();
        Page<Goods> page=new Page(pageNum,pageSize);
        IPage<Goods> goods = goodsService.page(page, null);
        result.put("data",goods);
        return result;
    }

    @GetMapping("/goods/{id}")
    public AjaxResult getGoodById(@PathVariable int id){
        AjaxResult result=AjaxResult.success();
        GoodsVo goods = goodsService.getGoodById(id);
        result.put("data",goods);
        System.out.println(goods);
        return result;
    }


}
