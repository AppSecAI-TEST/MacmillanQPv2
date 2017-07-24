package com.qait.QPv2.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qait.QPv2.keywords.LoginPageAction_Instructor;

public class LoginTestInstructor {

	
	LoginPageAction_Instructor ins;
	WebDriver w;
	
	@BeforeTest
	public void before(){
		ins = new LoginPageAction_Instructor();
		//w.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void login_Test() throws Exception{
		ins.login();

		
	}
	
	@Test
	public void create_course_Test() throws Exception{
		ins.create_course();
		
		
	}

	@Test
	public void check_create_course_Test() throws Exception{
		ins.check_create_course();
	}
	
	@Test
	public void activate_course_Test() throws Exception{
		ins.acivate_course();
	}
	
	@Test
	public void create_quiz_Test() throws Exception{
		
		ins.create_quiz();
		//assertThat(w.getTitle().equals("Home")).isTrue();
				
	}
}
