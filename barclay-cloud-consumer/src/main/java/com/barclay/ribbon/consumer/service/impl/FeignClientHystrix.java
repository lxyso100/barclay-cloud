package com.barclay.ribbon.consumer.service.impl;

import com.barclay.ribbon.consumer.service.FeignTestService;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author YIYAO
 * @Date 2018/3/30 16:41
 * @Version V1.0
 * @Copyright: www.weilian.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@Component
public class FeignClientHystrix implements FeignTestService {
    @Override
    public String test() {
        return "异常";
    }
}
