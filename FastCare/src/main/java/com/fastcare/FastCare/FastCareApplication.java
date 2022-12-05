package com.fastcare.FastCare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.fastcare.FastCare.request"})
@EntityScan("com.fastcare.FastCare.domain")
@EnableAutoConfiguration(exclude=(DataSourceAutoConfiguration.class))
public class FastCareApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastCareApplication.class, args);
	}

}
