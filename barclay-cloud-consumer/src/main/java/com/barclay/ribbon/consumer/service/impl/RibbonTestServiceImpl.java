package com.barclay.ribbon.consumer.service.impl;

import com.barclay.ribbon.consumer.service.RibbonTestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author YIYAO
 * @Date 2018/3/29 17:31
 * @Version V1.0
 * @Copyright: www.weilian.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@Service
public class RibbonTestServiceImpl implements RibbonTestService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RibbonTestServiceImpl.class);
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testError")
    @Override
    public String test() {
        LOGGER.debug("调用集群");
        String resp = restTemplate.getForObject("http://PROVIDER/ribbon/test", String.class);
        LOGGER.debug("spring cloud 返回： 【{}】", resp);
        return resp;
    }

    public String testError(){
        return "服务异常";
    }
}
