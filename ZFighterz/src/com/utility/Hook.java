package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook 
{
	public static WebDriver driver;
	
	@Before
	public void setupChrome()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	public static WebDriver getChromeDriver()
	{
		return driver;
	}
	
	
	@After
	public void closeChrome()
	{
		driver.quit();
	}
}