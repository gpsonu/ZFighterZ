package com.test.featurespics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.page.factory.FeaturesPagePF;
import com.page.factory.HomePagePF;

public class FeaturesPicsTest 
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
		
		FeaturesPagePF ob1 = new FeaturesPagePF(driver);
		ob1.getURL();
	}
	
	
	
	// TESTS ==================================================
	@Test
	public void featureTest1() throws InterruptedException
	{
		HomePagePF		ob1 = new HomePagePF		(driver)	;
		FeaturesPagePF	ob2 = new FeaturesPagePF	(driver)	;

		
		// =========================
		Thread.sleep(1000);
		ob2.feature4Method();
		
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//img[@src='/img/company1.jpg']")).isDisplayed())
		{	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");	}
		else
		{	ob1.featuresLinkMethod().click();	}	// without this the test will show passed even if the image doesn't enlarge
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"gallery_4\"]/div/div/div/div[1]/button[2]")).click();	// closes image
		
		
		// =========================
		Thread.sleep(1000);
		ob2.feature5Method();
		
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//img[@src='/img/deals1.jpg']")).isDisplayed())
		{	System.out.println("/////////////////////////////////////////////////////");	}
		else
		{	ob1.featuresLinkMethod().click();	}	// without this the test will show passed even if the image doesn't enlarge

		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#gallery_5 > div > div > div > div:nth-child(1) > button.back")).click();	// closes image
		
		
		// =========================
		/*Thread.sleep(1000);
		ob2.feature6Method();
		driver.findElement(By.xpath("//*[@id=\"second\"]/div/div[2]/ul/li[3]/a/figure/img")).click();
		
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//img[@src='/img/deals3.jpg']")).isDisplayed())
		{	System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");	}
		else
		{	ob1.featuresLinkMethod().click();	}	// without this the test will show passed even if the image doesn't enlarge
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"gallery_6\"]/div/div/div/div[1]/button[2]")).click();	// closes image*/
		
		
		// =========================
		Thread.sleep(1000);
		ob2.feature13Method();
		
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//img[@src='/img/sync1.jpg']")).isDisplayed())
		{	System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");	}
		else
		{	ob1.featuresLinkMethod().click();	}	// without this the test will show passed even if the image doesn't enlarge
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#gallery_13 > div > div > div > div:nth-child(1) > button.back")).click();	// closes image
		
	}
	
	
	
	// AFTERS ==================================================
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
}