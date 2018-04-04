package com.barclay.cloud.consul;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author YIYAO
 * @Date 2018/3/29 10:07
 * @Version V1.0
 * @Copyright: www.weilian.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BarclayConsulApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(BarclayConsulApplication.class).web(WebApplicationType.SERVLET).run(args);;
    }
}
