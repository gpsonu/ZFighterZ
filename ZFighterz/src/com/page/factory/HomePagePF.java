package com.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePF 
{
	// INSTACE VARIABLES ==================================================
	WebDriver driver;
	
	
	
	// CONSTRUCTORS ==================================================
	public HomePagePF (WebDriver d)
	{
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	
	
	
	// URLS ==================================================
	public void getURL()
	{
		driver.get("https://www.freecrm.com/index.html");
	}
	
	
	
	// FINDBYS & METHODS ==================================================
	@FindBy
	(xpath = "//input[@name='username']")
	WebElement usernameField;
	
	public WebElement usernameFieldMethod()
	{
		return usernameField;
	}
	
	
	@FindBy
	(xpath = "//input[@name='password']")
	WebElement passwordField;
	
	public WebElement passwordFieldMethod()
	{
		return passwordField;
	}
	
	
	@FindBy
	(xpath = "//input[@value='Login']")
	WebElement loginButton;
	
	public WebElement loginButtonMethod()
	{
		return loginButton;
	}
	
	
	@FindBy
	(xpath = "//*[@id=\"navbar-collapse\"]/ul/li[1]/a")
	WebElement featuresLink;
	
	public WebElement featuresLinkMethod()
	{
		return featuresLink;
	}
		
}