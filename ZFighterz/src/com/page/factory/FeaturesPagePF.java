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
	
	
	
	// URLS ==================================================
	public void getURL()
	{
		driver.get("https://www.freecrm.com/features.html");
	}
	
	
	// FINDBYS & METHODS - FEATURES PICS ==================================================
	@FindBy
	(xpath = "//*[@id=\'second\']/div/div[1]/div[2]/div/ul/li[1]/a/figure/img")
	WebElement feature1;
	
	public void feature1Method()
	{
		feature1.click();
		
	}
	
	
	@FindBy
	(xpath = "//*[@id=\'second\']/div/div[1]/div[2]/div/ul/li[2]/a/figure/img")
	WebElement feature2;
	
	public void feature2Method()
	{
		feature2.click();
		
	}
	
	
	@FindBy
	(xpath = "//*[@id=\'second\']/div/div[1]/div[2]/div/ul/li[3]/a/figure/img")
	WebElement feature3;
	
	public void feature3Method()
	{
		feature3.click();
		
	}
	
	
	@FindBy
	(xpath = "//img[@src='/img/tour4.jpg']")
	WebElement feature4;
	
	public void feature4Method()
	{
		feature4.click();
	}
	
	
	@FindBy
	(css = "#second > div > div:nth-child(2) > ul > li:nth-child(2) > a > figure > img")
	WebElement feature5;
	
	public void feature5Method()
	{
		feature5.click();
	}
	
	
	@FindBy
	(xpath = "//img[@src='/img/tour6.jpg']")
	WebElement feature6;
	
	public void feature6Method()
	{
		feature6.click();
	}
	
	
	@FindBy
	(css = "#second > div > div:nth-child(5) > ul > li:nth-child(1) > a > figure > img")
	WebElement feature13;
	
	public void feature13Method()
	{
		feature13.click();
	}
	
	
	
	// FINDBYS & METHODS - HEADER LINKS ==================================================
	@FindBy
	(xpath = "//*[@id=\"navbar-collapse\"]/ul/li[1]/a")
	WebElement homeLink;
	
	public void homeLinkMethod()
	{
		homeLink.click();
	}
	
	
	
	// FINDBYS & METHODS - LANGUAGE LINKS ==================================================
	@FindBy
	(css = "#footer > div > div > div.col-lg-4.col-sm-6.col-offset-2.margin.social > ul > li:nth-child(1) > a")
	WebElement englishLink;
	
	public void englishLinkMethod()
	{
		englishLink.click();
	}
	
	
	@FindBy
	(xpath = "//*[@id=\"footer\"]/div/div/div[2]/ul/li[2]/a")
	WebElement spanishLink;
	
	public void spanishLinkMethod()
	{
		spanishLink.click();
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
	
	
	@FindBy
	(css = "#footer > div > div > div.col-lg-4.col-sm-6.col-offset-2.margin.social > ul > li:nth-child(9) > a")
	WebElement russianLink;
	
	public void russianLinkMethod()
	{
		russianLink.click();
	}
	
	@FindBy
	(xpath = "//*[@id=\"footer\"]/div/div/div[2]/ul/li[5]/a")
	WebElement taiwanLink;
	
	public void taiwanLinkMethod()
	{
		taiwanLink.click();
	}
			
	@FindBy
	(xpath = "//*[@id=\"footer\"]/div/div/div[2]/ul/li[6]/a")
	WebElement arabicLink;
	
	public void arabicLinkMethod()
	{
		arabicLink.click();
	}
	
}