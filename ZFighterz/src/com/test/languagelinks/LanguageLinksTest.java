package com.test.languagelinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.page.factory.FeaturesPagePF;

public class LanguageLinksTest 
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
	@Test (priority = 1)
	public void englishLinkTest() throws InterruptedException
	{
		FeaturesPagePF ob1 = new FeaturesPagePF(driver);
		
		Thread.sleep(1000);
		ob1.englishLinkMethod();
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.crmpro.com/index.html");
	}
	
	
	@Test (priority = 2)
	public void spanishLinkTest() throws InterruptedException
	{
		FeaturesPagePF ob1 = new FeaturesPagePF(driver);
		
		Thread.sleep(1000);
		ob1.spanishLinkMethod();
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://es.crmpro.com/index.html");
	}
	
	
	@Test (priority = 3)
	public void russianLinkTest() throws InterruptedException
	{
		FeaturesPagePF ob1 = new FeaturesPagePF(driver);
		
		Thread.sleep(1000);
		ob1.russianLinkMethod();
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://ru.crmpro.com/index.html");
	}
	
	
	@Test (priority = 5)
	public void taiwanLinkTest() throws InterruptedException
	{
		FeaturesPagePF ob1 = new FeaturesPagePF(driver);
		
		Thread.sleep(1000);
		ob1.taiwanLinkMethod();    
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://tw.crmpro.com/index.html");
	}
	
	
	@Test (priority = 6)
	public void arabicLinkTest() throws InterruptedException
	{
		FeaturesPagePF ob1 = new FeaturesPagePF(driver);
		
		Thread.sleep(1000);
		ob1.arabicLinkMethod();
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://ar.crmpro.com/index.html");
	}
	
	
	// AFTERS ==================================================
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}