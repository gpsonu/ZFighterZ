package com.test.login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.page.factory.HomePagePF;
import com.utility.Hook;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest 
{
	WebDriver driver = Hook.getChromeDriver();
	HomePagePF ob1 = new HomePagePF(driver);
		
	
	
	
	@Given("^I am on the CRM homepage$")
	public void i_am_on_the_CRM_homepage() throws Throwable 
	{
		ob1.getURL();
	}

	
	
	
	@And("^I entered correct \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_entered_correct_and(String arg1, String arg2) throws Throwable 
	{
		Thread.sleep(1000);
		ob1.usernameFieldMethod().sendKeys(arg1);
		ob1.passwordFieldMethod().sendKeys(arg2);
	}

	@When("^I click on login$")
	public void i_click_on_login() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.loginButtonMethod().click();	
	}

	@Then("^I should be logged in$")
	public void i_should_be_logged_in() throws Throwable 
	{
		Assert.assertEquals(driver.getTitle(), "CRMPRO");	
	}

	
	
	
	@And("^I entered incorrect \"([^\"]*)\" and/or \"([^\"]*)\"$")
	public void i_entered_incorrect_and_or(String arg1, String arg2) throws Throwable 
	{
		Thread.sleep(1000);
		ob1.usernameFieldMethod().sendKeys(arg1);
		ob1.passwordFieldMethod().sendKeys(arg2);
	}

	@Then("^The homepage should refresh and I should NOT be logged in$")
	public void the_homepage_should_refresh_and_i_should_NOT_be_logged_in() throws Throwable 
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.freecrm.com/index.html?e=1");	
	}	

}