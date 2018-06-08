package com.test.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.page.factory.SignUpPF;
import com.utility.Hook;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpTest {

	WebDriver driver = Hook.getChromeDriver();
	SignUpPF signup = new SignUpPF(driver);
	
	
	@Given("^I am on the CRM \"([^\"]*)\" page$")
	public void i_am_on_the_CRM_page(String arg1) throws Throwable {
		signup.getURL();
	}

	@And("^I slected the \"([^\"]*)\" by value$")
	public void i_slected_the_by_value(String edition) throws Throwable {
		Select pickedition = new Select(signup.editionMethod());
		pickedition.selectByValue(edition);
	}

	@And("^I entered the correct \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_entered_the_correct_and_and_and_and_and_and(String firstname, 
			String lastname, String email, String confirmemail, String username, 
			String password, String confirmpassword) throws Throwable {
		
		signup.firstnameMethod().sendKeys(firstname);
		signup.lastnameMethod().sendKeys(lastname);
		signup.emailMethod().sendKeys(email);
		signup.confirmemailMethod().sendKeys(confirmemail);
		signup.usernameMethod().sendKeys(username);
		signup.passwordMethod().sendKeys(password);
		signup.confirmpasswordMethod().sendKeys(confirmpassword);
		Thread.sleep(2000);
	}

	@And("^I click on checkbox$")
	public void i_click_on_checkbox() throws Throwable {
		signup.checkboxMethod();
	}

	@When("^I click on signup button$")
	public void i_click_on_signup_button() throws Throwable {
	    signup.submitMethod();
	}

	@Then("^I should be signed up if the correct data was entered$")
	public void i_should_be_signed_up_if_the_correct_data_was_entered() throws Throwable {
	    Assert.assertEquals(driver.getCurrentUrl(), "https://www.freecrm.com/register/?step=2&CFID=1198353&CFTOKEN=66426989&jsessionid=9c30326a9b3efe5f090d341a0715a187f4e5");
	}
	
	@And("^I slected the \"([^\"]*)\" by value or leave it unselected$")
	public void i_slected_the_by_value_or_leave_it_unselected(String edition) throws Throwable {
		Select pickedition = new Select(signup.editionMethod());
		pickedition.selectByValue(edition);
	}
	    
	
	@And("^I entered incorrect variations \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_entered_incorrect_variations_and_and_and_and_and_and(String firstname, 
			String lastname, String email, String confirmemail, String username, 
			String password, String confirmpassword) throws Throwable {
		
		signup.firstnameMethod().sendKeys(firstname);
		signup.lastnameMethod().sendKeys(lastname);
		signup.emailMethod().sendKeys(email);
		signup.confirmemailMethod().sendKeys(confirmemail);
		signup.usernameMethod().sendKeys(username);
		signup.passwordMethod().sendKeys(password);
		signup.confirmpasswordMethod().sendKeys(confirmpassword);
		Thread.sleep(2000);
	 }
	
	@Then("^I should not be able to sign up and stay on the register page$")
	public void i_should_not_be_able_to_sign_up_and_stay_on_the_register_page() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.freecrm.com/register/");	
		
	}
	 
}