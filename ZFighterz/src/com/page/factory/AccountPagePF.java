package com.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPagePF {

	WebDriver driver;  
	
	
	public AccountPagePF (WebDriver d)
	{
		this.driver = d;
		PageFactory.initElements(driver, this);
		
	}
	
	public void getURL()
	{
		driver.get("https://www.freecrm.com/index.html");
	}	
	
	@FindBy
	(xpath = "//*[@id=\"navMenu\"]/ul/li[10]/a")
	WebElement logoutButton;
	
	public void logoutButtonMethod()
	{
		logoutButton.click();
		
	}
	
	
}
