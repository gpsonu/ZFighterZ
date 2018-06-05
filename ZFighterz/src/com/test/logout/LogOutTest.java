package com.test.logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.page.factory.AccountPagePF;
import com.page.factory.HomePagePF;

public class LogOutTest {

	WebDriver driver = null;
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("wedsriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		HomePagePF ob1 = new HomePagePF(driver);
		ob1.getURL();
	}
	
	@Test (priority = 1)
	public void loginTest2p1() throws InterruptedException
	{
		HomePagePF ob1 = new HomePagePF(driver);
				
		Thread.sleep(1000);
		ob1.usernameFieldMethod().sendKeys("zfighterz");
		ob1.passwordFieldMethod().sendKeys("zf123zf");
		
		Thread.sleep(1000);
		ob1.loginButtonMethod().click();
		
		Thread.sleep(2000);
		
		AccountPagePF ob2 = new AccountPagePF(driver);
		ob2.logoutButtonMethod();
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.freecrm.com/index.html");	
		
	}
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
}
