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
	
	public void feature1Method()
	{
		feature1.click();
	}
	
	@FindBy
	(xpath = "//*[@id=\'second\']/div/div[1]/div[2]/div/ul/li[1]/a/figure/img")
	WebElement image1;
	
	public void image1Method()
	{
		image1.click();
		
	}
	
	@FindBy
	(xpath = "//*[@id=\'second\']/div/div[1]/div[2]/div/ul/li[2]/a/figure/img")
	WebElement image2;
	
	public void image2Method()
	{
		image2.click();
		
	}
	
	@FindBy
	(xpath = "//*[@id=\'second\']/div/div[1]/div[2]/div/ul/li[3]/a/figure/img")
	WebElement image3;
	
	public void image3Method()
	{
		image3.click();
		
	}
	
	
	@FindBy
	(xpath = "//*[@id=\'footer\']/div/div/div[2]/ul/li[3]/a")
	WebElement french;
	
	public void frenchMethod()
	{
		french.click();

	}
	
	@FindBy
	(xpath = "//*[@id=\"footer\"]/div/div/div[2]/ul/li[4]/a")
	WebElement chinese;
	
	public void chineseMethod()
	{
		chinese.click();
	}
		
}