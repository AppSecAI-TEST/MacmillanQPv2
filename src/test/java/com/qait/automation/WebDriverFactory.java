package com.qait.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
	
public static WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "/home/navendushukla/Downloads/chromedriver");
		
		
		return new ChromeDriver();
		//return new ChromeDriver(capabilities);
	}


}
