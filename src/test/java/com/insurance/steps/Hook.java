package com.insurance.steps;

import com.insurance.resources.Commonactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends Commonactions {

	@Before
	public void beforeScenario() throws InterruptedException {
		
		launch("https://www.travelers.com/");
	}
	
	@After
	public void afterScenario() {
		
		quitBrowser();
	}
}
