package com.test.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.page.factory.FeaturesPagePF;
import com.page.factory.HomePagePF;

public class FeaturesTest 
{
	// INSTACE VARIABLES ==================================================
	WebDriver driver = null;
	
	
	
	// BEFORES ==================================================
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	
	// TESTS ==================================================
	@Test
	public void featureTest1() throws InterruptedException
	{
		HomePagePF 		ob1 = new HomePagePF		(driver)	;
		FeaturesPagePF	ob2 = new FeaturesPagePF	(driver)	;
		
		driver.get("https://www.freecrm.com/index.html");
		
		Thread.sleep(1000);
		ob1.featuresLinkMethod().click();
		
		Thread.sleep(1000);
		ob2.feature1Method().click();
		
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//img[@src='/img/dash1.jpg']")).isDisplayed())
		{
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("Element is Visible");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		}
		else
		{
			ob1.featuresLinkMethod().click();  // without this the test will show passed even if the image doesn't enlarge
		}
	}
	
	
	
	// AFTERS ==================================================
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
}