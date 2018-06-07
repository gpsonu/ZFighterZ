package com.test.headerlinks;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.page.factory.HomePagePF;
import com.utility.Hook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HeaderLinksTest 
{
	WebDriver driver = Hook.getChromeDriver();
	HomePagePF ob1 = new HomePagePF(driver);
	
	
	
	
	@Given("^I am on the CRM homepage$")
	public void i_am_on_the_CRM_homepage() throws Throwable 
	{
		ob1.getURL();
	}

	
	
	
	@When("^I click on features link$")
	public void i_click_on_features_link() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.featuresLinkMethod().click();
	}

	@Then("^I should be taken to the features page$")
	public void i_should_be_taken_to_the_features_page() throws Throwable 
	{
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.freecrm.com/features.html");
	}

	
	
	
	@When("^I click on sign up link$")
	public void i_click_on_sign_up_link() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.signUpLinkMethod().click();
	}

	@Then("^I should be taken to the sign up page$")
	public void i_should_be_taken_to_the_sign_up_page() throws Throwable 
	{
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.freecrm.com/register/");
	}

	
	
	
	@When("^I click on pricing link$")
	public void i_click_on_pricing_link() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.pricingLinkMethod().click();
	}

	@Then("^I should be taken to the pricing page$")
	public void i_should_be_taken_to_the_pricing_page() throws Throwable 
	{
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.freecrm.com/pricing.html");
	}
	
	
	
	
	@When("^I click on customers link$")
	public void i_click_on_customers_link() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.customerLinkMethod().click();
	}

	@Then("^I should be taken to the customers page$")
	public void i_should_be_taken_to_the_customers_page() throws Throwable 
	{
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.freecrm.com/customers.html");
	}	

	
	
	
	@When("^I click on contact link$")
	public void i_click_on_contact_link() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.contactLinkMethod().click();
	}

	@Then("^I should be taken to the contact page$")
	public void i_should_be_taken_to_the_contact_page() throws Throwable 
	{
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.freecrm.com/contact.html");
	}
		
}