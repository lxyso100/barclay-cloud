package com.barclay.ribbon.consumer;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description
 * @Author YIYAO
 * @Date 2018/3/29 17:23
 * @Version V1.0
 * @Copyright: www.weilian.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
@ComponentScan(basePackages = "com.barclay.ribbon.consumer")
@SpringCloudApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
