package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	//field injection from property
	@Value("${foo.email}")
	String email;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	

	@Value("${foo.team}")
	String team;
	
	/*Injection base On Constructor
	 * Injecting Fortune Service
	 * */
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}




