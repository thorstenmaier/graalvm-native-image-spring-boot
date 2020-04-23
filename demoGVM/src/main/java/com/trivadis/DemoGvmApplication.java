package com.trivadis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoGvmApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoGvmApplication.class, args);
		RestTemplate  restTemplate = new RestTemplate();
		String obj = restTemplate.getForObject("http://localhost:8089/", String.class);
		System.out.println(" ===  http://localhost:8089/ : " + obj);
		ctx.close();
	
	}

}
