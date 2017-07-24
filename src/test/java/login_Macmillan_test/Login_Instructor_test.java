package login_Macmillan_test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
import login_Macmillan.Login_Instructor;

public class Login_Instructor_test {

	Login_Instructor login;
	WebDriver w;

	@BeforeTest
	public void BeforeTest() {

		login = new Login_Instructor();
		

	}

	@Test
	public void testLogin() {
		
		w = login.login(); 
		
		String s=w.getTitle();
		System.out.println(s);
		assertThat(w.getTitle().equals(s)).isTrue();
		
		

	}

	@Test
	public void testcreateCourse() throws InterruptedException{
		w=login.createCourse();
		
		
	}
}
