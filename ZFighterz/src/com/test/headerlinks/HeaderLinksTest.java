package com.test.headerlinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.page.factory.FeaturesPagePF;
import com.page.factory.HomePagePF;

public class HeaderLinksTest 
{
	// INSTANCE VARIABLES ==================================================
	WebDriver driver = null ;
	
	
	
	// BEFORES ==================================================
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//FeaturesPagePF ob1 = new FeaturesPagePF(driver);
		//ob1.getURL();
	}
	
	
	
	// TESTS ==================================================
	@Test(priority = 1)
	public void homeLinkTest() throws InterruptedException
	{
		FeaturesPagePF ob1 = new FeaturesPagePF(driver);
		driver.get("https://www.freecrm.com/features.html");
		
		Thread.sleep(1000);
		ob1.homeLinkMethod();
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.freecrm.com/index.html");
	}
	
	@Test(priority = 5)
	public void customerLinkTest() throws InterruptedException
	{
		HomePagePF ob1 = new HomePagePF(driver);
		
		driver.get("https://www.freecrm.com/index.html");
		
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
	}
	
}