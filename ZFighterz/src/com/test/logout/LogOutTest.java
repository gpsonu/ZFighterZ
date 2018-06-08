package com.test.logout;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.page.factory.AccountPagePF;
import com.page.factory.HomePagePF;
import com.utility.Hook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogOutTest {

	WebDriver driver = Hook.getDriver();
	
	HomePagePF ob1 = new HomePagePF (driver);
	AccountPagePF ob2 = new AccountPagePF (driver);
	
	
	@Given("^I on the CRM homepage$")
	public void i_on_the_CRM_homepage() throws Throwable {
		ob1.getURL();
	}
	
	@When("^I enter user name and password$")
	public void i_enter_user_name_and_password() throws Throwable {
		
		Thread.sleep(1000);
		ob1.usernameFieldMethod().sendKeys("zfighterz");
		ob1.passwordFieldMethod().sendKeys("zf123zf");
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		
		Thread.sleep(1000);
		ob1.loginButtonMethod().click();
	}
	
	@Then("^I should be logged into my account page$")
	public void i_should_be_logged_into_my_account_page() throws Throwable {
		
		Assert.assertEquals(driver.getTitle(),"CRMPRO");
	}


	@When("^I click on logout$")
	public void i_click_on_logout() throws Throwable {
		
		AccountPagePF ob2 = new AccountPagePF(driver);
		ob2.logoutButtonMethod();
	}

	@Then("^I should be logged out from my account\\. Should be rerouted to homepage$")
	public void i_should_be_logged_out_from_my_account_Should_be_rerouted_to_homepage() throws Throwable {
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.freecrm.com/index.html");
	    
	}
	
		
	
}
