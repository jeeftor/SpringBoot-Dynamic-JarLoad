package org.company.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"org.company.adapters", "org.company.app"})
@SpringBootApplication
public class DemoApplication {

	@Autowired
	SystemAdapterFactory factory;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
