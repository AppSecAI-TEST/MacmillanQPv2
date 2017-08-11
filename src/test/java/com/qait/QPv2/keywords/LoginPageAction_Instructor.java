package com.qait.QPv2.keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.ObjectFileReader;

public class LoginPageAction_Instructor extends ObjectFileReader {

	ObjectFileReader obj = new ObjectFileReader();
	WebDriver w;
	
	public void login() throws Exception {

		obj.getWebDriver();

		
		obj.element("Enter_email").sendKeys("g.s.instructor@macmillan.com");
		obj.element("Enter_password").sendKeys("!@");
		obj.element("Signin_Button").click();
		Thread.sleep(25000);
		obj.element("Create_course_button").isDisplayed();
		
	}

	public void create_course() throws Exception{
		login();
		
		Thread.sleep(25000);
		
		obj.element("Create_course_button").click();
		Thread.sleep(5000);
		obj.element("Next_button_create_course").click();
		Thread.sleep(5000);
		obj.element("Next2_button_create_course").click();
		Thread.sleep(10000);
		obj.element("Edit_name_of_course").click();
		obj.element("Edit_name_of_course").clear();;
		obj.element("Edit_name_of_course").sendKeys("TESTNAV");
		obj.element("Select_university").click();
		obj.element("Select_university").clear();
		obj.element("Select_university").sendKeys("Test University - Denver, CO");
		obj.element("Button_create_course").click();
		
		
		
		
		
	}
	
	
	public void check_create_course() throws Exception{
		login();
		Thread.sleep(25000);
//		obj.element("Remind_me_later_button").click();
		obj.element("New_course_link").isDisplayed();
		
	}
	
	public void acivate_course() throws Exception{
		login();
		Thread.sleep(25000);
//		obj.element("Remind_me_later_button").click();
		obj.element("Course_activate_link").click();
		Thread.sleep(3000);
		obj.element("Activate_course_button").click();
		Thread.sleep(2000);
		obj.element("Done_activate_course_button").click();
		obj.element("Deactivation_button").isDisplayed();
		
				
	}
	
	
	public void create_quiz() throws Exception{
		check_create_course();
		obj.element("New_course_link").click();
		Thread.sleep(15000);
		obj.element("Enter_your_course_button").click();
		Thread.sleep(5000);
		obj.element("Add_new_button").click();
		Thread.sleep(5000);
		obj.element("Quiz_option_from_the_list").click();
		Thread.sleep(10000);
		obj.element("Select_title_field").click();
		obj.element("Select_title_field").clear();
		obj.element("Select_title_field").sendKeys("TESTQUIZ");
		obj.element("Save_quiz_button").click();
		Thread.sleep(2000);
		obj.element("Questions_link").click();
		Thread.sleep(5000);
		obj.element("Chapter_1").click();
		Thread.sleep(5000);
		obj.element("Multiple_choice_1").click();
		Thread.sleep(5000);
		obj.element("MCQ_q1").click();
		obj.element("MCQ_q2").click();
		obj.element("MCQ_q3").click();
		obj.element("Add_button").click();
		Thread.sleep(5000);
		obj.element("MCQ_q4").click();
		obj.element("MCQ_q5").click();
		obj.element("MCQ_q6").click();
		obj.element("Add_to_pool_button").click();
		obj.element("Add_to_a_new_pool").click();
		Thread.sleep(5000);
		obj.element("New_pool_name").click();
		obj.element("New_pool_name").sendKeys("TESTPOOL");
		obj.element("Pull_pool_questions").click();
		obj.element("Pull_pool_questions").sendKeys("5");
		obj.element("Create_pool").click();
		Thread.sleep(2000);
		obj.element("Create_questions").click();
		Thread.sleep(7500);
		
		
		obj.element("Question_editor_text_area").click();
		String s="Select noun from the following:";
		obj.element("Question_editor_text_area").sendKeys(s);
		obj.element("Question_editor_text_area").sendKeys(Keys.ENTER);
		
		
	
		
		
		
			
	}







}

