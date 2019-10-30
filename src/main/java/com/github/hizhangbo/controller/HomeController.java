package com.github.hizhangbo.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangbo on 2019/10/29 5:30 下午.
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @NacosValue(value = "${home.index.name}", autoRefreshed = true)
    private String name;

    @GetMapping("/index")
    public String index() {
        return name;
    }
}
