package com.erpang.scaffold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author erpang
 * @date 2024/10/29
 */
@SpringBootApplication(scanBasePackages = {"com.erpang", "com.alibaba.cola"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
