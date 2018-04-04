package com.barclay.ribbon.provider;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @Description
 * @Author YIYAO
 * @Date 2018/3/29 14:21
 * @Version V1.0
 * @Copyright: www.weilian.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@SpringCloudApplication
public class ProviderApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
