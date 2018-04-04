package com.barclay.ribbon.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author YIYAO
 * @Date 2018/3/29 15:44
 * @Version V1.0
 * @Copyright: www.weilian.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@RestController
@RequestMapping("ribbon")
public class RibbonProvider {
    private static final Logger LOGGER = LoggerFactory.getLogger(RibbonProvider.class);
    @Autowired
    private DiscoveryClient discoveryClient;
    @GetMapping("test")
    public String test(){
        String services = "services:  " + discoveryClient.getServices();
        LOGGER.debug(services);
        return services;
    }
}
