package com.test.headerlinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

//import com.page.factory.FeaturesPagePF;
import com.page.factory.HomePagePF;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HeaderLinksTest 
{
	// INSTANCE VARIABLES ==================================================
	WebDriver driver;
	
	
	
	/*// BEFORES ==================================================
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		HomePagePF ob1 = new HomePagePF(driver);
		ob1.getURL();
	}
	
	
	
	// TESTS ==================================================
	@Test (priority = 1)
	public void homeLinkTest() throws InterruptedException
	{
		FeaturesPagePF ob1 = new FeaturesPagePF(driver);
		
		driver.get("https://www.freecrm.com/features.html");
		
		Thread.sleep(1000);
		ob1.homeLinkMethod();
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.freecrm.com/index.html");
	}
	
	@Test (priority = 5)
	public void customerLinkTest() throws InterruptedException
	{
		HomePagePF ob1 = new HomePagePF(driver);
				
		Thread.sleep(1000);
		ob1.customerLinkMethod().click();
				
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.freecrm.com/customers.html");
	}
	
	
	
	// AFTERS ==================================================
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();			
	}*/
	
	
	// CUCUMBER ==================================================
	@Given("^I navigate to CRM homepage$")
	public void i_navigate_to_CRM_homepage() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		HomePagePF ob1 = new HomePagePF(driver);
		ob1.getURL();
	}

	@When("^I click on customers link$")
	public void i_click_on_customers_link() throws Throwable 
	{
		HomePagePF ob1 = new HomePagePF(driver);
		
		Thread.sleep(1000);
		ob1.customerLinkMethod().click();
				
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.freecrm.com/customers.html");
	}

	@Then("^I should be taken to the customers page$")
	public void i_should_be_taken_to_the_customers_page() throws Throwable 
	{
		Thread.sleep(3000);
		driver.quit();	
	}	
		
}