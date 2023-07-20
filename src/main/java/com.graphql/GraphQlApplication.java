package com.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
@SpringBootApplication
public class GraphQlApplication {
	public static void main(String[] args) {
		SpringApplication.run(GraphQlApplication.class, args);
	}
}
