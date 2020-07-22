package com.trivadis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.trivadis.controller.HelloController;

@SpringBootApplication(proxyBeanMethods = false)
public class SpringGraalNativeImageApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringGraalNativeImageApplication.class, args);
//		RestTemplate restTemplate = new RestTemplate();
//		String obj = restTemplate.getForObject("http://localhost:8089/", String.class);
//
		System.out.println(ctx.getBean(HelloController.class).hello());
//
		System.out.println("Max memory:   " + formatSize(Runtime.getRuntime().maxMemory()));
		System.out.println("Total memory: " + formatSize(Runtime.getRuntime().totalMemory()));
		System.out.println("Free memory:  " + formatSize(Runtime.getRuntime().freeMemory()));
		System.out.println(
				"Used memory:  " + formatSize(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));

		ctx.close();
	}

	public static String formatSize(long v) {
		if (v < 1024)
			return v + " B";
		int z = (63 - Long.numberOfLeadingZeros(v)) / 10;
		return String.format("%.1f %sB", (double) v / (1L << (z * 10)), " KMGTPE".charAt(z));
	}

}
