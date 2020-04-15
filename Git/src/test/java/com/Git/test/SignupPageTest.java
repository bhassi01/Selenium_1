package com.Git.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Git.Base.BaseTest;
import com.Git.Object.LoginPage;
import com.Git.Object.SignupPage;

public class SignupPageTest extends BaseTest {
	SignupPage signuptype;
	LoginPage loginpage;

	public SignupPageTest() {
		super();
	}

	@BeforeMethod()
	public void setup() {
		signuptype = new SignupPage();
		initialisation();
	}

	@Test()
	public void validate_Title() {
		String Title = signuptype.Signup_Page_Title();
		Assert.assertEquals(Title, "The world’s leading software development platform · GitHub");
	}

	@Test()
	public void validate_lOGO() {
		Boolean Logo = signuptype.Git_Logo();
		Assert.assertEquals(true, true);
	}

	@Test()
	public LoginPage click_On_SignIn() {
		signuptype.Click_On_SignIn();
		return loginpage;
	}

	@AfterMethod()
	public void teardown() {
		driver.quit();
	}
}
