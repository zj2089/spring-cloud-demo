package com.qinbaobao.clound.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengjiang
 */
@RestController
public class HelloController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/hello")
    public String hello() {
        return "hello eureka, feign timestamp " + feignService.current();
    }
}
