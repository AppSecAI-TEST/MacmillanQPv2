package login_Macmillan;

import java.sql.Driver;
import java.util.*;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Instructor {
	Properties prop;
	WebDriver driver;

	public WebDriver login() {
		System.setProperty("webdriver.chrome.driver", "/home/navendushukla/Downloads/chromedriver");
		driver = new ChromeDriver();
		// prop = new Properties();
		// WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.get("http://www.lt.macmillan.cloud/launchpad/morris2e/");

		driver.findElement(By.xpath("//*[@id ='EMail']")).sendKeys("g.s.instructor@macmillan.com");
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("!@");
		driver.findElement(By.xpath("//*[@id='loginButton']")).click();

		return driver;

	}

	public WebDriver createCourse() throws InterruptedException {
		WebDriver driver = login();
		Thread.sleep(30000);
		driver.findElement(By.xpath(".//a[@id='createcourseoption']")).click();
		Thread.sleep(50000);
		driver.findElement(By.cssSelector(
				".courseoption-dialog-next.ui-button.ui-widget.ui-state-default.ui-corner-all.ui-button-text-only.ui-state-focus"))
				.click();
		Thread.sleep(50000);
		driver.findElement(By
				.xpath(".//div[@aria-labelledby='ui-id-2']//button[@class='courseoption-dialog-next ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='course-title']")).click();
		driver.findElement(By.xpath(".//*[@id='course-title']")).clear();
		driver.findElement(By.xpath(".//*[@id='course-title']")).sendKeys("TESTNAV");
		driver.findElement(By.xpath(".//*[@id='school-name']")).click();
		driver.findElement(By.xpath(".//*[@id='school-name']")).clear();
		driver.findElement(By.xpath(".//*[@id='school-name']")).sendKeys("Test University - Denver, CO");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@aria-labelledby='ui-id-64708']//button[@ class='primary-green ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']")).click();
		driver.findElement(By.xpath(".//*[@class='ui-dialog-buttonset pxactivatecourse-dialog-buttonset']//button[@class='primary-green ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']")).click();
		
		return driver;

	}
}
