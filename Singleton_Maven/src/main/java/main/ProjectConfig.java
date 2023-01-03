package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import controller.TestController;


@Configuration
@ComponentScan(basePackages = "controller")
public class ProjectConfig {
	
	@Bean
	public TestController test() {
		
		return new TestController();
	}

}
