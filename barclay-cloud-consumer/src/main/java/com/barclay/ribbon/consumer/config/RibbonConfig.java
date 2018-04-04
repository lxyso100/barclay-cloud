package com.barclay.ribbon.consumer.config;

import org.antlr.stringtemplate.StringTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author YIYAO
 * @Date 2018/3/29 17:31
 * @Version V1.0
 * @Copyright: www.weilian.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
