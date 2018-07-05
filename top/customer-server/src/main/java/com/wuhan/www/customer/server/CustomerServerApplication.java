package com.wuhan.www.customer.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerServerApplication {
//客户服务
	public static void main(String[] args) {
		SpringApplication.run(CustomerServerApplication.class, args);
	}
}
