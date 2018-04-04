package com.barclay.cloud.config;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description
 * @Author YIYAO
 * @Date 2018/3/27 18:03
 * @Version V1.0
 * @Copyright: www.weilian.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@EnableConfigServer
@SpringBootApplication
public class BarclayConfigApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(BarclayConfigApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
