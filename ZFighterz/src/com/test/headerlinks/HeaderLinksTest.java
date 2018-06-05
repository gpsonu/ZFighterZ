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
	
	@Given("^I navigate to CRM homepage$")
	public void i_navigate_to_CRM_homepage() throws Throwable 
	{
		ob1.getURL();
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
		
}