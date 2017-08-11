package com.qait.QPv2.tests;

import org.testng.annotations.Test;


import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import com.qait.QPv2.keywords.LoginPageAction_instructorV2;

public class LoginTestInstructor {

	LoginPageAction_instructorV2 ins;
	WebDriver w;

	@BeforeTest
	public void before() {
		ins = new LoginPageAction_instructorV2();
		ins.pageName();
		// w.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	@Test
	public void login_Test() throws Exception {
		ins.login();

	}

	@Test
	public void create_course_Test() throws Exception {
		ins.create_course();

	}

	@Test
	public void check_create_course_Test() throws Exception {
		ins.check_create_course();
	}

	@Test
	public void activate_course_Test() throws Exception {
		ins.acivate_course();
	}

	@Test
	public void enter_course() throws Exception{
		ins.enter_course();
	}
	@Test
	public void create_quiz_Test() throws Exception {

		ins.create_quiz();
		// assertThat(w.getTitle().equals("Home")).isTrue();

	}

	@Test
	public void add_questions_to_quiz_Test() throws Exception {
		ins.add_questions_to_quiz();
	}

	@Test
	public void add_questions_to_pool_Test() throws Exception {
		ins.add_questions_to_pool();
	}

	
	@Test
	public void add_questions_Test() throws Exception{
		ins.add_questions();
	}

	

	@Test
	public void create_question_Test() throws Exception{
		ins.create_question();
	}

	@Test
	public void assign_due_date_without_questions_test() throws Exception{
		
		ins.assign_due_date_without_questions();
	}

	@Test
	public void assign_due_date_with_questions_test() throws Exception{
		ins.add_questions();
		ins.assign_due_date();
	}

	@Test
	public void assign_due_date_created_questions_Test() throws Exception{
	
		ins.create_question();
		ins.assign_due_date();
	}

	@Test
	public void gradebook_check_Test() throws Exception{
		ins.gradebook_check();
	}

	@Test
	public void logout_Test() throws Exception{
		ins.logout();
	}


	@Test
	public void gradebook_export_Test() throws Exception{
		ins.gradebook_export();
	}

	@Test
	public void gradebook_import_Test() throws Exception{
		int score=ins.gradebook_import();
		assertThat(score).isEqualTo(0);
		
	}


}
