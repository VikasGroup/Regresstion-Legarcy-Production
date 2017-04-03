package com.reg.test.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import wpPageobject.HomePageObj;
import wpPageobject.Online_Login_VOPageObj;

public class ValidateLoginPage {
	@Steps
	@Managed
	WebDriver driver;
	HomePageObj homePageObj;
	Online_Login_VOPageObj online_Login_VOPageObj;
	
	
	@Given("^user direct to the site$")
	public void user_direct_to_the_site() throws Throwable {
		driver.manage().window().maximize();
		driver.get("http://www.qnet.net/");
	   
	}

	@When("^user click on Login or Register button$")
	public void user_click_on_Login_or_Register_button() throws Throwable {
	    homePageObj.clickLogin();
	    Thread.sleep(15000);
	   
	}

	@When("^user enter a valid ID or email \"([^\"]*)\"$")
	public void user_enter_a_valid_ID_or_email(String arg1) throws Throwable {
	    online_Login_VOPageObj.enterIRID(arg1);
	    
	   
	}

	@When("^user enter a password \"([^\"]*)\"$")
	public void user_enter_a_password(String arg1) throws Throwable {
	    online_Login_VOPageObj.enterPWD(arg1);
	   
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    online_Login_VOPageObj.clickLogin();
	   Thread.sleep(10000);
	}

	@Then("^validate the landing page \"([^\"]*)\"$")
	public void validate_the_landing_page(String arg1) throws Throwable {
	    Assert.assertEquals(arg1, driver.getCurrentUrl());
		
	   
	}


	
}
