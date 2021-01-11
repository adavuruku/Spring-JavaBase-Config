package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
 * @Configuration is to make this class the main config file or the App root file
 * @ComponentScan is to tell the app where to search for beans
 * 
 * once using @bean u dont need the @ComponentScan since this file already specify the
 * configuration
 * 
 * but IOC u will need @ComponentScan annotation
 * */

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.luv2code.springdemo")
public class SportConfig {
	
	//define method to expose bean
	@Bean
	public FortuneService fortuneServiceImplement() {
		return new FortuneServiceImplement();
	}
	
	//define bean for our swim Coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(fortuneServiceImplement());
	}
}
