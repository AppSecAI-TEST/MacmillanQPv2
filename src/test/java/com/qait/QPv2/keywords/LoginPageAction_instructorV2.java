package com.qait.QPv2.keywords;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

import com.qait.automation.getpageobjects.ObjectFileReader;

public class LoginPageAction_instructorV2 extends ObjectFileReader {
	
	ObjectFileReader obj = new ObjectFileReader();
	WebDriver w;
	String s= "Instructor";
	
	
	public String pageName(){
		obj.GetPage(s);
		String str=obj.GetPage(s);
		return str;
	}
	
	public void login() throws Exception {
		
		w=obj.getWebDriver();
		String s1=w.getTitle();
		
		obj.element("Enter_email").sendKeys("g.s.instructor@macmillan.com");
		obj.element("Enter_password").sendKeys("!@");
		obj.element("Signin_Button").click();
		Thread.sleep(30000);
		String s=w.getTitle();
		
		System.out.println(s1+"-----------------------"+s);
		//obj.element("Remind_me_later_button").click();
//		obj.wait_for("Create_course_button");
//		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

//		obj.element("Create_course_button").isDisplayed();
		
	}

	public void create_course() throws Exception{
		login();
		
		//Thread.sleep(25000);
		
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
		Thread.sleep(5000);
		obj.element("New_course_link").isDisplayed();
		
		
		
		
		
	}
	
	
	public void check_create_course() throws Exception{
		login();
		//Thread.sleep(25000);
//		obj.element("Remind_me_later_button").click();
		obj.element("New_course_link").isDisplayed();
		
	}
	
	public void acivate_course() throws Exception{
		login();
		//Thread.sleep(25000);
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
		Thread.sleep(15000);
		obj.element("Add_new_button").click();
		Thread.sleep(5000);
		obj.element("Next_link_on_pop_up").click();
		obj.element("Quiz_option_from_the_list").click();
		Thread.sleep(10000);
		obj.element("Select_title_field").click();
		obj.element("Select_title_field").clear();
		obj.element("Select_title_field").sendKeys("TESTQUIZ");
		obj.element("Save_quiz_button").click();
		Thread.sleep(2000);
		obj.element("Item_saved_successfully_toast").isDisplayed();
		
	}
	
	public void enter_course() throws Exception{
		check_create_course();
		obj.element("New_course_link").click();
		Thread.sleep(15000);
		obj.element("Enter_your_course_button").click();
String s=w.getTitle();
		
		System.out.println(s);
		
	}
	public void add_questions_to_quiz() throws Exception{
		create_quiz();
		Thread.sleep(10000);
		obj.element("Search_questions").click();
		Thread.sleep(3000);
		obj.element("Question_type").click();
		obj.element("Question_type_multiple_choice").click();
		obj.element("Apply_filters_button").click();
		Thread.sleep(6000);
		obj.element("MC_q1").click();
		obj.element("MC_q2").click();
		obj.element("MC_q3").click();
		obj.element("Add_checked_to").click();
		obj.element("Add_to_quiz").click();
	}
	
	public void add_questions_to_pool() throws Exception{
		create_quiz();
		Thread.sleep(10000);
		obj.element("Search_questions").click();
		Thread.sleep(3000);
		obj.element("Question_type").click();
		obj.element("Question_type_multiple_choice").click();
		obj.element("Apply_filters_button").click();
		Thread.sleep(6000);
		obj.element("MC_q4").click();
		obj.element("MC_q5").click();
		obj.element("MC_q6").click();
		obj.element("Add_checked_to").click();
		obj.element("Add_to_new_pool").click();
		obj.element("Enter_pool_name").click();
		obj.element("Enter_pool_name").sendKeys("TESTPOOL");
		obj.element("Enter_pool_count").click();
		obj.element("Enter_pool_count").sendKeys("5");;
		obj.element("Create_question_pool_button").click();
	}
	public void add_questions() throws Exception{
		add_questions_to_quiz();
		Thread.sleep(3000);
		obj.element("MC_q4").click();
		obj.element("MC_q5").click();
		obj.element("MC_q6").click();
		obj.element("Add_checked_to").click();
		obj.element("Add_to_new_pool").click();
		obj.element("Enter_pool_name").click();
		obj.element("Enter_pool_name").sendKeys("TESTPOOL");
		obj.element("Enter_pool_count").click();
		obj.element("Enter_pool_count").sendKeys("5");;
		obj.element("Create_question_pool_button").click();
	}
	
	
	
		
	public void create_question() throws Exception{
		create_quiz();
		Thread.sleep(10000);
		obj.element("Review_and_modify").click();
		Thread.sleep(3000);
		obj.element("Create_question_dropdown").click();
		obj.element("Create_MCQ").click();
		Thread.sleep(10000);
		obj.element("TESTQUIZ_text").click();
		obj.switchtoframe("Mgradebook_import_TestCQ_frame");
		obj.element("MCQ_text_area").click();
		obj.element("MCQ_text_area").sendKeys("Select noun from the following");
		obj.element("MCQ_text_area").sendKeys(Keys.ENTER);
		obj.element("ANS_1").sendKeys("this");
		obj.element("ANS_1").sendKeys(Keys.ENTER);
		obj.element("ANS_2").sendKeys("Ram");
		obj.element("ANS_2").sendKeys(Keys.ENTER);
		obj.element("ANS_3").sendKeys("that");
		obj.element("ANS_3").sendKeys(Keys.ENTER);
		obj.element("ANS_4").sendKeys("those");
		obj.element("Correct_ans").click();
		obj.switchtodefault();
		obj.element("Save_button_create_mcq").click();
		
	}
	
	public void assign_due_date_without_questions() throws Exception{
		create_quiz();
		Thread.sleep(8000);
		obj.element("Assign_due_date").click(); Thread.sleep(8000);
		obj.element("Assign_date").click();
		obj.element("Assign_date").clear();
		obj.element("Assign_date").sendKeys("15/08/2017");;
		obj.element("Assign_points").click();
		obj.element("Assign_points").sendKeys("50");
		obj.element("Assign_due_date_button").click(); Thread.sleep(3000);
		obj.element("Assignment_successful").isDisplayed();
		obj.element("Done_editing").click(); Thread.sleep(5000);
		obj.element("Home_button").click(); Thread.sleep(5000);
		obj.element("Account_menu").click();
		obj.element("Sign_out").click();
	}
	public void assign_due_date() throws Exception{
		Thread.sleep(8000);
		obj.element("Assign_due_date").click(); Thread.sleep(8000);
		obj.element("Assign_date").click();
		obj.element("Assign_date").clear();
		obj.element("Assign_date").sendKeys("15/08/2017");;
		obj.element("Assign_points").click();
		obj.element("Assign_points").sendKeys("50");
		obj.element("Assign_due_date_button").click(); Thread.sleep(3000);
		obj.element("Assignment_successful").isDisplayed();
		obj.element("Done_editing").click(); Thread.sleep(5000);
		obj.element("Home_button").click(); Thread.sleep(5000);
		obj.element("Account_menu").click();
		obj.element("Sign_out").click();
		
	}
	
	public void gradebook_check() throws Exception{
		
		enter_course();
		Thread.sleep(5000);
		obj.element("Gradebook_button").click();
		Thread.sleep(7000);
		//obj.element("Next_link_on_pop_up").click();
		obj.switchtoframe("Gradebook_frame");
		obj.element("Quiz_number").click();
		Thread.sleep(4000);
		String s=obj.element("Grade_earned").getText();
		float a=Float.parseFloat(s.split("/")[0]);
		float b= Float.parseFloat(s.split("/")[1]);
		
		int check = (int) (a/b);
		System.out.println(a+"------ "+b+"------ "+check);
		
		obj.element("Submit_score_gradebook").click();
		obj.switchtodefault();
		obj.element("Home_button").click();

		
	}
	
	public void gradebook_export() throws Exception{

		enter_course();
		Thread.sleep(5000);
		obj.element("Gradebook_button").click();
		Thread.sleep(7000);
		//obj.element("Next_link_on_pop_up").click();
		obj.switchtoframe("Gradebook_frame");
		obj.element("Gradebook_export_button").click();
		Thread.sleep(3000);
		obj.element("Gradebook_export_dropdown").click();
		
		obj.element("Gradebook_export_txt").click();
		obj.element("Gradebook_export_submit").click();
		
		
		
	}
	
	public int gradebook_import() throws Exception{
		Screen s = new Screen();
		ImagePath.setBundlePath("/home/navendushukla/workspace_OLD/MacmillanQPV2/src/test/resources/Images/");
		enter_course();
		Thread.sleep(5000);
		obj.element("Gradebook_button").click();
		Thread.sleep(7000);
		obj.switchtoframe("Gradebook_frame");
		obj.element("Quiz_number").click();
		Thread.sleep(4000);
		String str=obj.element("Grade_earned").getText();
		float a=Float.parseFloat(str.split("/")[0]);
		float b= Float.parseFloat(str.split("/")[1]);
		
		int check = (int) ((a/b)*100);
		System.out.println(a+"------ "+b+"------ "+check);
		
		obj.element("Submit_score_gradebook").click();
		obj.element("Gradebook_import_button").click();
		Thread.sleep(3000);
		obj.element("Gradebook_import_browse").click();
		Thread.sleep(4000);
		s.click("Downloads.png");
		//s.click("modified.png");
		s.click("grades_txt.png");
		s.click("Open.png");
		Thread.sleep(2000);
		s.click("Continue.png");
		Thread.sleep(4000);
		int score=Integer.parseInt((obj.element("Gradebook_import_score").getText()).split("%")[0]);
		System.out.println(score);
		return (check-score);
//		obj.element("").click();
//		obj.element("").click();
//		obj.element("").click();
//		obj.element("").click();
//		obj.element("").click();
		
	}
	public void logout() throws Exception{
	login();
	obj.element("Account_menu").click();
	obj.element("Sign_out").click();
	
}
	
}
