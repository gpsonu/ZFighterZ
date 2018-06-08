package com.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricingPagePF 
{
	// INSTACE VARIABLES //////////////////////////////////////////////////
	WebDriver driver;
	
	
	// CONSTRUCTORS //////////////////////////////////////////////////
	public PricingPagePF (WebDriver d)
	{
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	
	
	// URLS //////////////////////////////////////////////////
	public void getURL()
	{
		driver.get("https://www.freecrm.com/pricing.html");
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