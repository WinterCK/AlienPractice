package org.cjk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient // 除了Eureka注册中心之外，其他注册中心也能扫描该服务
@EnableFeignClients
public class AlienProviderCoreApplication {


    public static void main(String[] args) {
        SpringApplication.run(AlienProviderCoreApplication.class, args );
    }

}
