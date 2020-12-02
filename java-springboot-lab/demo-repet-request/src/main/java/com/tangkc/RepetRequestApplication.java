package com.tangkc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tangkc
 * @description 处理重复请求
 * @date 2020/12/2 17:53
 */
@SpringBootApplication
public class RepetRequestApplication {
    public static void main(String[] args) {
        // 启动 Spring Boot 应用
        SpringApplication.run(RepetRequestApplication.class, args);
    }
}
