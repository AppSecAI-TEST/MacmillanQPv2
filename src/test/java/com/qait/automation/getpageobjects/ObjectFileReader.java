package com.qait.automation.getpageobjects;

import com.google.common.base.Function;

import com.qait.automation.WebDriverFactory;
//import com.qait.automation.utils.CustomAssert;
//import com.qait.automation.utils.LayoutValidation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ObjectFileReader {

	private static final TimeUnit SECONDS = null;
	public WebDriver driver;
	public static String pageName;
	WebDriverFactory w =new WebDriverFactory();
	static String filepath = "/home/navendushukla/workspace_OLD/MacmillanQPV2/src/test/resources/";	
	
	public String GetPage(String pageName) {

		this.pageName = pageName;
		return pageName;
		
	}
	
	public static String[] getELementFromFile(String elementName) {
        
        BufferedReader br = null;
        String matchingLine = "";
       // String pagepath= filepath+pageName+".txt";
       // System.out.println(filepath+pageName+".txt");
        try {
        	
        	File f = new File(filepath+pageName+".txt");
        	
        	if(!f.exists()) { 
        		//System.out.println("WARNING : '" + tier + "/" + pageName + ".txt' file not found");
        	}else {
                br = new BufferedReader(new FileReader(filepath+pageName+".txt"));
                String line = br.readLine();
                while (line != null) {
                    if (line.split(": ", 3)[0].equalsIgnoreCase(elementName)) {
                        matchingLine = line;
                        break;
                    }
                    line = br.readLine();
                }
        	}
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        String S[]= new String[2];
        S[0] =matchingLine.split(": ", 3)[2];
        S[1] =matchingLine.split(": ", 3)[1];
        return S;
        // TODO: Handle Arrayoutofbounds and Filenotfound exceptions gracefully.
  
	}
	
	
	public By getLocators(String elementname) {
		
		String s[]= getELementFromFile(elementname);
//		System.out.println(s[1]);
//		System.out.println(s[0]);
		
		switch (Locators.valueOf(s[1])){
		case id:
			return By.id(s[0]);
		case xpath:
			//System.out.println(By.xpath(s[0]));
			return By.xpath(s[0]);
		case name:
			return By.name(s[0]);
		case classname:
			return By.className(s[0]);
		case css:
			return By.cssSelector(s[0]);
		case linktext:
			return By.linkText(s[0]);
		default:
			return By.id(s[0]);
		}
	}
	
	public WebDriver getWebDriver(){
		driver=w.getDriver();
		driver.get("http://www.lt.macmillan.cloud/launchpad/morris2e/");//https://dev1-aws-reg.macmillanhighered.com/
		//driver.manage().deleteAllCookies();
		return driver;
	}
	public  WebElement element(String element) throws Exception {	
		String driver1="";
		WebElement w=driver.findElement(getLocators(element));
		return w;
	}
	
	
	public void switchtoframe(String s) throws Exception
	{
		driver.switchTo().frame(element(s));
	}
	public void switchtodefault() throws Exception
	{
		driver.switchTo().defaultContent();
	}

	public <T> Wait<WebDriver> wait_for(String s) throws Exception{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, SECONDS)
			       .pollingEvery(5, SECONDS)
			       .ignoring(NoSuchElementException.class);
		wait.until((Function<? super WebDriver, T>) element(s));
	
		return wait;
	}
	
	
}


