package com.qait.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;




public class TestSessionInitiator {

	
	WebDriver driver;
	WebDriverFactory wdfactory;
	
	public TestSessionInitiator() {
		wdfactory = new WebDriverFactory();
	}
	
	protected void configureBrowser() {
		
		driver.manage().window().maximize();
		
		int	timeout = Integer.parseInt(System.getProperty("timeout"));
		
		driver.manage().timeouts().implicitlyWait(timeout,TimeUnit.SECONDS);
		
		
	}
}
