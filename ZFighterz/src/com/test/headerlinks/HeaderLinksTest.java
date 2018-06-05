package com.test.headerlinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.page.factory.FeaturesPagePF;

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
		
		FeaturesPagePF ob1 = new FeaturesPagePF(driver);
		ob1.getURL();
	}
	
	
	
	// TESTS ==================================================
	@Test
	public void homeLinkTest() throws InterruptedException
	{
		FeaturesPagePF ob1 = new FeaturesPagePF(driver);
		
		Thread.sleep(1000);
		ob1.homeLinkMethod();
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.freecrm.com/index.html");
	}
	
	
	
	// AFTERS ==================================================
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
}