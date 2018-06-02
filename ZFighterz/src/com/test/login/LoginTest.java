package com.test.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.page.factory.HomePagePF;

public class LoginTest 
{
	// INSTACE VARIABLES ==================================================
	WebDriver driver = null;
	
	
	
	// BEFORES ==================================================
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("wedsriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	
	// TESTS ==================================================
	@Test
	public void loginTest2p1() throws InterruptedException
	{
		HomePagePF ob1 = new HomePagePF(driver);
		
		driver.get("https://www.freecrm.com/index.html");
		
		Thread.sleep(1000);
		ob1.usernameFieldMethod().sendKeys("zfighterz");
		ob1.passwordFieldMethod().sendKeys("zf123zf");
		
		Thread.sleep(1000);
		ob1.loginButtonMethod().click();
		
		String url = driver.getTitle();
		Assert.assertEquals(url, "CRMPRO");
		
	}
	
	
	
	// AFTERS ==================================================
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}