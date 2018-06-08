package com.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePF 
{
	// INSTACE VARIABLES //////////////////////////////////////////////////
	WebDriver driver;
	
	
	// CONSTRUCTORS //////////////////////////////////////////////////
	public HomePagePF (WebDriver d)
	{
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	
	
	// URLS //////////////////////////////////////////////////
	public void getURL()
	{
		driver.get("https://www.freecrm.com/index.html");
	}
	
	
	
	
	// FINDBYS & METHODS - LOGIN //////////////////////////////////////////////////
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
	
	
	

	// FINDBYS & METHODS - HEADER LINKS //////////////////////////////////////////////////
	@FindBy
	(xpath = "//*[@id=\"navbar-collapse\"]/ul/li[1]/a")
	WebElement featuresLink;
	
	public WebElement featuresLinkMethod()
	{
		return featuresLink;
	}
		
	
	@FindBy
	(css = "#navbar-collapse > ul > li:nth-child(2) > a")
	WebElement signUpLink;
	
	public WebElement signUpLinkMethod()
	{
		return signUpLink;
	}
	
	
	@FindBy
	(xpath = "//*[@id=\"navbar-collapse\"]/ul/li[3]/a")
	WebElement pricingLink;
	
	public WebElement pricingLinkMethod()
	{
		return pricingLink;
	}
	
	
	@FindBy
	(xpath = "//*[@id=\"navbar-collapse\"]/ul/li[4]/a")
	WebElement customerLink;
	
	public WebElement customerLinkMethod()
	{
		return customerLink;
	}
	
	
	@FindBy
	(css = "#navbar-collapse > ul > li:nth-child(5) > a")
	WebElement contactLink;
	
	public WebElement contactLinkMethod()
	{
		return contactLink;
	}
	
	
	
	
	// FINDBYS & METHODS - LOGO LINK //////////////////////////////////////////////////
	@FindBy
	(css = "body > div.navbar.navbar-default.navbar-fixed-top > div > div.navbar-header > a")
	WebElement logoLink;
	
	public void logoLinkMethod()
	{
		logoLink.click();
	}

	
}