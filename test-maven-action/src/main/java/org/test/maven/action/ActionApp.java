package org.test.maven.action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:consumer.xml") // 很重要
public class ActionApp {

	public static void main(String[] args) {
		SpringApplication.run(ActionApp.class, args);
	}
}
