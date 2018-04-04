package com.barclay.ribbon.consumer.service;

import com.barclay.ribbon.consumer.service.impl.FeignClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description
 * @Author YIYAO
 * @Date 2018/3/30 10:39
 * @Version V1.0
 * @Copyright: www.weilian.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@FeignClient(value = "PROVIDER", fallback = FeignClientHystrix.class)
public interface FeignTestService {

    @GetMapping("/feignProvider/test")
    String test();

}
