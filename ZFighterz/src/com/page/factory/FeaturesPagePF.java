package com.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeaturesPagePF 
{
	// INSTACE VARIABLES ==================================================
	WebDriver driver;
	
	
	
	// CONSTRUCTORS ==================================================
	public FeaturesPagePF (WebDriver d)
	{
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	
	
	
	// FINDBYS & METHODS ==================================================
	@FindBy
	(xpath = "//img[@src='/img/tour1.jpg']")
	WebElement feature1;
	
	public WebElement feature1Method()
	{
		return feature1;
	}
		
}