package com.qait.QPv2.keywords;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.ObjectFileReader;

public class LoginPageAction_Student extends ObjectFileReader {

	
	ObjectFileReader obj = new ObjectFileReader();
	WebDriver w;
	String s= "Student";
	
	
	public String pageName(){
		obj.GetPage(s);
		String str=obj.GetPage(s);
		return str;
	}
	
	public void login() throws Exception {
		
		obj.getWebDriver();

		
		obj.element("Enter_email").sendKeys("g.s.student@macmillan.com");
		obj.element("Enter_password").sendKeys("Password1");
		obj.element("Signin_Button").click();
		Thread.sleep(10000);
		

	}

	public void select_launchpad() throws Exception{
		login();
		obj.element("University_name").click();
		obj.element("University_name").sendKeys("Bedford");
		Thread.sleep(4000);
		obj.element("Academic_term").click();
		obj.element("Summer_term").click();
		Thread.sleep(3000);
		obj.element("Join_launchpad").click();
		Thread.sleep(5000);
		obj.element("Continue_to_site").click();
		
	}
	public void enter_course() throws Exception{
		select_launchpad();
		Thread.sleep(7000);
		obj.element("Enter_course_button").click();
	}

	public void enter_quiz() throws Exception{
		enter_course();
		Thread.sleep(7000);
		obj.element("Enter_assigned_quiz").click();
		
	}

	public void start_quiz() throws Exception{
		enter_quiz();
		Thread.sleep(3000);
		obj.element("Start_quiz").click();
	}

	public void attempt_quiz() throws Exception{
		start_quiz();
		Thread.sleep(10000);
		obj.switchtoframe("Question_frame");
		obj.switchtoframe("iframe_contentBody");
		obj.switchtoframe("iframe_courseContentFrame");
		obj.element("Answer_1").click();
		obj.element("Answer_2").click();
		obj.element("Answer_3").click();
		obj.element("Answer_4").click();
		obj.element("Answer_5").click();
		obj.element("Quiz_submit_button").click();
		obj.element("Submit_confirmation").click();
		Thread.sleep(5000);
		obj.element("Done_test_button").click();
		obj.element("Home_button").click();
		Thread.sleep(4000);
		obj.element("Account_menu").click();
		obj.element("Sign_out").click();
		obj.element("").click();
		obj.element("").click();
		obj.element("").click();
		obj.element("").click();
		obj.element("").click();
		
		
		
	}
	
	
	public void gradebook_check() throws Exception{
		
		enter_course();
		Thread.sleep(5000);
		obj.element("Gradebook_button").click();
		Thread.sleep(7000);
		obj.switchtoframe("Gradebook_frame");
		obj.element("Quiz_number").click();
		Thread.sleep(4000);
		obj.element("Close_quiz_number").click();
		Thread.sleep(3000);
		obj.switchtodefault();
		obj.element("Home_button").click();
		//obj.element("").click();
		
	}
	
	public void logout() throws Exception{
		login();
		select_launchpad();
		Thread.sleep(7000);
		obj.element("Account_menu").click();
		obj.element("Sign_out").click();
		
	}
}
