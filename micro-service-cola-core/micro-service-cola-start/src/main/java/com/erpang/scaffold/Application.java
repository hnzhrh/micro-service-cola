package com.erpang.scaffold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author erpang
 * @date 2024/10/29
 */
@EnableDiscoveryClient
@EnableConfigurationProperties
@ConfigurationPropertiesScan(basePackages = {"com.erpang.scaffold.config"})
@SpringBootApplication(scanBasePackages = {"com.erpang.scaffold", "com.alibaba.cola"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
