package com.yong.web.controller.tool;

import com.yong.common.utils.StringUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * swagger 接口
 * 
 * @author ruoyi
 */
@Controller
@RequestMapping("/tool/swagger")
public class SwaggerController
{
    @GetMapping()
    public String index()
    {
        return StringUtils.format("redirect:{}", "/swagger-ui/index.html");
    }
}
