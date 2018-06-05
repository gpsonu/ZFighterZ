package com.test.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.page.factory.SignUpPF;

public class SignUpTest {

	WebDriver driver = null;
	
	@BeforeMethod
	public void beforeMethod()
	{
	System.setProperty("wedsriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
			
	SignUpPF signup = new SignUpPF(driver);
	signup.getURL();
	}
		
	@Test (priority = 1)
	public void loginTest2p1() throws InterruptedException
	{
	SignUpPF signup = new SignUpPF(driver);
	Thread.sleep(1000);
	
	Select pickedition = new Select(signup.editionMethod());
	pickedition.selectByValue("1");
	
	signup.firstnameMethod().sendKeys("ff");
	signup.lastnameMethod().sendKeys();
	signup.emailMethod().sendKeys();
	signup.confirmemailMethod().sendKeys();
	signup.usernameMethod().sendKeys();
	signup.passwordMethod().sendKeys();
	signup.confirmpasswordMethod().sendKeys();
	signup.checkboxMethod();
	
}
}