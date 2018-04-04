package com.barclay.ribbon.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author YIYAO
 * @Date 2018/3/30 16:02
 * @Version V1.0
 * @Copyright: www.weilian.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@RestController
@RequestMapping("feignProvider")
public class FeignProvider{
    @GetMapping("test")
    public String test() {
        return "feignProvider";
    }
}
