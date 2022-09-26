package com.square.springcloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhengjiang
 */
@FeignClient(name = "open-feign-demo")
public interface FeignService {

    @GetMapping("/current")
    long current();
}
