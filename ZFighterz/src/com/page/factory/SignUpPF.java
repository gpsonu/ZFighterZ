package com.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPF {
	
	// INSTACE VARIABLES //////////////////////////////////////////////////
	WebDriver driver;
		
	
	// CONSTRUCTORS //////////////////////////////////////////////////
	public SignUpPF (WebDriver d)
	{
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	
	
	// URLS //////////////////////////////////////////////////
	public void getURL()
	{
		driver.get("https://www.freecrm.com/register/");
	}
	
	
	
	
	// FINDBYS & METHODS - Sign Up Fields //////////////////////////////////////////////////
	@FindBy
	(xpath = "//*[@id=\'payment_plan_id\']")
	
	WebElement edition;
	
	public WebElement editionMethod()
	{
	return edition;
	}
	
	
	@FindBy
	(xpath = "//*[@id=\'multipleForm\']/div[3]/input")
	WebElement firstname;
	
	public WebElement firstnameMethod()
	{
	return firstname;
	}
	
	
	@FindBy
	(xpath = "//*[@id=\'multipleForm\']/div[4]/input")
	WebElement lastname;
	
	public WebElement lastnameMethod()
	{
	return	lastname;
	}
	
	
	@FindBy
	(xpath = "//*[@id=\'multipleForm\']/div[5]/input")
	WebElement email;
	
	public WebElement emailMethod()
	{
	return	email;
	}
	
	@FindBy
	(xpath = "//*[@id=\'multipleForm\']/div[6]/input")
	WebElement confirmemail;
	
	public WebElement confirmemailMethod()
	{
	return	confirmemail;
	}
	
	@FindBy
	(xpath = "//*[@id=\'username\']/input")
	WebElement username;
	
	public WebElement usernameMethod()
	{
	return	username;
	}
	
	
	@FindBy
	(xpath = "//*[@id=\'multipleForm\']/div[8]/input")
	WebElement password;
	
	public WebElement passwordMethod()
	{
	return	password;
	}
	
	
	@FindBy
	(xpath = "//*[@id=\'multipleForm\']/div[9]/input")
	WebElement confirmpassword;
	
	public WebElement confirmpasswordMethod()
	{
	return	confirmpassword;
	}
	
	@FindBy
	(xpath = "//*[@id=\'multipleForm\']/div[11]/div/label/input")
	WebElement checkbox;
	
	public void checkboxMethod()
	{
		checkbox.click();
		
	}
	
	@FindBy
	(xpath = "//*[@id=\'multipleForm\']/div[12]/div")
	WebElement submit;
	
	public void submitMethod()
	{
		submit.click();
		
	}
		
}