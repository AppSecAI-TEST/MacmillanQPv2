package com.qait.automation.getpageobjects;

import com.qait.automation.WebDriverFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ObjectFileReader {

	public WebDriver driver;
	WebDriverFactory w =new WebDriverFactory();
	static String filepath = "/home/navendushukla/workspace_OLD/MacmillanQPV2/src/test/resources/loginpage.txt";
		
	
	public static String[] getELementFromFile(String elementName) {
        
        BufferedReader br = null;
        String matchingLine = "";
        try {
        	
        	File f = new File(filepath);
        	if(!f.exists()) { 
        		//System.out.println("WARNING : '" + tier + "/" + pageName + ".txt' file not found");
        	}else {
                br = new BufferedReader(new FileReader(filepath));
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
		driver.get("https://dev1-aws.macmillanhighered.com/Launchpad/myers11e");//https://dev1-aws-reg.macmillanhighered.com/
		return driver;
	}
	public  WebElement element(String element) throws Exception {	
		//WebDriver driver= w.getDriver();
		return driver.findElement(getLocators(element));
		
	}
	
	
}


