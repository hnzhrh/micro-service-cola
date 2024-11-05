package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ${author}
 * @date ${date}
 */
@EnableDiscoveryClient
@EnableConfigurationProperties
@ConfigurationPropertiesScan(basePackages = {"${package}.config"})
@SpringBootApplication(scanBasePackages = {"${package}", "com.alibaba.cola"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
