package com.test.logolink;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.page.factory.ContactPagePF;
import com.page.factory.CustomersPagePF;
import com.page.factory.FeaturesPagePF;
import com.page.factory.HomePagePF;
import com.page.factory.PricingPagePF;
import com.page.factory.SignUpPF;
import com.utility.Hook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoLinkTest 
{	
	WebDriver driver = Hook.getChromeDriver();
	HomePagePF ob1 = new HomePagePF(driver);



	
	@Given("^I am on the Homepage$")
	public void i_am_on_the_Homepage() throws Throwable 
	{
		HomePagePF ob1 = new HomePagePF(driver);
		ob1.getURL();
	}
	
	@Given("^I am on the Features page$")
	public void i_am_on_the_Features_page() throws Throwable 
	{
		FeaturesPagePF ob1 = new FeaturesPagePF(driver);
		ob1.getURL();
	}

	@Given("^I am on the Sign Up page$")
	public void i_am_on_the_Sign_Up_page() throws Throwable 
	{
		SignUpPF ob1 = new SignUpPF(driver);
		ob1.getURL();
	}

	@Given("^I am on the Pricing page$")
	public void i_am_on_the_Pricing_page() throws Throwable 
	{
		PricingPagePF ob1 = new PricingPagePF(driver);
		ob1.getURL();
	}

	@Given("^I am on the Customers page$")
	public void i_am_on_the_Customers_page() throws Throwable 
	{
		CustomersPagePF ob1 = new CustomersPagePF(driver);
		ob1.getURL();
	}

	@Given("^I am on the Contact page$")
	public void i_am_on_the_Contact_page() throws Throwable 
	{
		ContactPagePF ob1 = new ContactPagePF(driver);
		ob1.getURL();
	}	
	
	
	@When("^I click on the Logo$")
	public void i_click_on_the_Logo() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.logoLinkMethod();
	}

	@Then("^I should be taken to the Homepage$")
	public void i_should_be_taken_to_the_Homepage() throws Throwable 
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.freecrm.com/index.html");
	}

}