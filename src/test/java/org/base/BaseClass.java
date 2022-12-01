package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void launchURL() {
		driver.get("https://blazedemo.com/purchase.php");
	}
	
	public void sendKeys(WebElement ref, String value) {
		ref.sendKeys(value);
		
	}

}
