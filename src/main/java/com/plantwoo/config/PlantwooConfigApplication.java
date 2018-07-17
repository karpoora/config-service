package com.plantwoo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
@RestController
public class PlantwooConfigApplication {

	public static final Logger LOGGER = LoggerFactory.getLogger(PlantwooConfigApplication.class);

	public static void main(String[] args) {
		LOGGER.info("in Config Test main Entrance API");
		SpringApplication.run(PlantwooConfigApplication.class, args);
	}


	@GetMapping("/test")
	public String getUserTest(){
		LOGGER.info("in Config Test API");
		return "success";
	}
}
