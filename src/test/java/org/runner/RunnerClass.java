package org.runner;

import org.base.BaseClass;

import org.openqa.selenium.WebElement;
import org.pom.PomClassFlight;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RunnerClass extends BaseClass {
	
	@Test
	@Parameters({"name", "address", "city", "state", "zipCode"})
	private void sample(String Name, String Address, String city, String State, String ZipCode ) {
		
		launchBrowser();
		launchURL();
		PomClassFlight pc = new PomClassFlight();
		WebElement name = pc.getName();
		sendKeys(name, Name);
		WebElement address2 = pc.getAddress();
		sendKeys(address2, Address);
		WebElement city2 = pc.getCity();
		sendKeys(city2, city);

	}

}
