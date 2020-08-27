package com.jiangfan.springboot02.com.jiangfan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 江帆
 * @Date: 2020/6/20
 * @Description: com.jiangfan.springboot02.com.jiangfan
 * @version: 1.0
 */
@RestController
public class UserController {
    @RequestMapping("/hello1")
    public String hello() {

        return "helloSpringBoot2";
    }

}
