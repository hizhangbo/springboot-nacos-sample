package com.github.hizhangbo;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zhangbo on 2019/10/29 5:28 下午.
 */
@NacosPropertySource(
        dataId = "sample",
        autoRefreshed = true,
        type = ConfigType.PROPERTIES,
        first = true
)
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
