package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook 
{
	public static WebDriver driver;
	
	
	@Before("@chrome")
	public void setupChrome()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Before("@firefox")
	public void setupFireFox()
	{
		System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	
	
	
	public static WebDriver getChromeDriver()
	{
		return driver;
	}
	
	
	
	
	@After
	public void closeChrome() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}