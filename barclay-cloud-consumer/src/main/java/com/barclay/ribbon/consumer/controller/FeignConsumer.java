package com.barclay.ribbon.consumer.controller;

import com.barclay.ribbon.consumer.service.FeignTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author YIYAO
 * @Date 2018/3/30 10:39
 * @Version V1.0
 * @Copyright: www.weilian.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@RestController
@RequestMapping("feign")
public class FeignConsumer {
    @Autowired
    private FeignTestService feignTestService;

    @GetMapping("test")
    public String test(){
        return feignTestService.test();
    }
}
