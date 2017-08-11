package com.qait.QPv2.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qait.QPv2.keywords.LoginPageAction_Student;

public class LoginTestStudent {
	LoginPageAction_Student ins;
	WebDriver w;

	@BeforeTest
	public void before() {
		ins = new LoginPageAction_Student();
		ins.pageName();
		// w.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	@Test
	public void login_Test() throws Exception {
		ins.login();

	}

	@Test
	public void select_launchpad_Test() throws Exception {
		ins.select_launchpad();

	}
	
	@Test
	public void enter_course_Test() throws Exception {
		ins.enter_course();

	}
	
	@Test
	public void enter_quiz_Test() throws Exception {
		ins.enter_quiz();

	}
	
	@Test
	public void start_quiz_Test() throws Exception {
		ins.start_quiz();

	}

	@Test
	public void attempt_quiz_Test() throws Exception {
		ins.attempt_quiz();

	}
	
	@Test
	public void gradebook_check_Test() throws Exception{
		ins.gradebook_check();
	}
	
	@Test
	public void logout_test() throws Exception{
		ins.logout();
	}

}
