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
<<<<<<< HEAD
	(xpath = "//*[@id=\"navMenu\"]/ul/li[10]/a")
=======
	(xpath = "/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a/i")
>>>>>>> branch 'master' of https://github.com/gpsonu/ZFighterZ.git
	WebElement logoutButton;
	
	public void logoutButtonMethod()
	{
		logoutButton.click();
		
	}
	
	
}
