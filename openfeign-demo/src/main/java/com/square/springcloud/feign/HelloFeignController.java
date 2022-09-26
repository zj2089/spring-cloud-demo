package com.square.springcloud.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengjiang
 */
@RestController
public class HelloFeignController {

    @GetMapping("/current")
    public long hello() {
        return System.currentTimeMillis();
    }
}
