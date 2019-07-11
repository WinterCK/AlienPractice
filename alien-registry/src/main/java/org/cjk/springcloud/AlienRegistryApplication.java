package org.cjk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * EnableEurekaServer 可以将服务作为注册中心
 * @author chenjk
 */
@SpringBootApplication
@EnableEurekaServer
public class AlienRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlienRegistryApplication.class, args);
	}
}
