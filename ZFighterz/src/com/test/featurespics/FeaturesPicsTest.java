package com.test.featurespics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.page.factory.FeaturesPagePF;
import com.page.factory.HomePagePF;
import com.utility.Hook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeaturesPicsTest 
{
	WebDriver driver = Hook.getChromeDriver();
	FeaturesPagePF ob1 = new FeaturesPagePF(driver);
	HomePagePF ob2 = new HomePagePF(driver);


	
	
	@Given("^I am on the FEATURES page$")
	public void i_am_on_the_FEATURES_page() throws Throwable 
	{
		ob1.getURL();
	}

	
	
	
	@When("^I click on the FOURTH FEATURE PIC$")
	public void i_click_on_the_FOURTH_FEATURE_PIC() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.feature4Method();
	}

	@Then("^the FOURTH FEATURE PIC should ENLARGE$")
	public void the_FOURTH_FEATURE_PIC_should_ENLARGE() throws Throwable 
	{
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//img[@src='/img/company1.jpg']")).isDisplayed())
		{	System.out.println();	}
		else
		{	ob2.featuresLinkMethod().click();	}	// without this the test will show passed even if the image doesn't enlarge
	}

	@When("^I click on the X for the FOURTH FEATURE PIC$")
	public void i_click_on_the_X_for_the_FOURTH_FEATURE_PIC() throws Throwable 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"gallery_4\"]/div/div/div/div[1]/button[2]")).click();	
	}
	
	@Then("^the FOURTH FEATURE PIC should MINIMIZE$")
	public void the_FOURTH_FEATURE_PIC_should_MINIMIZE() throws Throwable 
	{
		Thread.sleep(1000);
		if (!driver.findElement(By.xpath("//img[@src='/img/company1.jpg']")).isDisplayed())
		{	System.out.println();	}
		else
		{	ob2.featuresLinkMethod().click();	}	// without this the test will show passed even if the image doesn't enlarge
	}

	
	
	@When("^I click on the FIFTH FEATURE PIC$")
	public void i_click_on_the_FIFTH_FEATURE_PIC() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.feature5Method();
	}

	@Then("^the FIFTH FEATURE PIC should ENLARGE$")
	public void the_FIFTH_FEATURE_PIC_should_ENLARGE() throws Throwable 
	{
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//img[@src='/img/deals1.jpg']")).isDisplayed())
		{	System.out.println();	}
		else
		{	ob2.featuresLinkMethod().click();	}	// without this the test will show passed even if the image doesn't enlarge
	}
	
	@When("^I click on the X for the FIFTH FEATURE PIC$")
	public void i_click_on_the_X_for_the_FIFTH_FEATURE_PIC() throws Throwable 
	{
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#gallery_5 > div > div > div > div:nth-child(1) > button.back")).click();	// closes image
	}

	@Then("^the FIFTH FEATURE PIC should MINIMIZE$")
	public void the_FIFTH_FEATURE_PIC_should_MINIMIZE() throws Throwable 
	{
		Thread.sleep(1000);
		if (!driver.findElement(By.xpath("//img[@src='/img/deals1.jpg']")).isDisplayed())
		{	System.out.println();	}
		else
		{	ob2.featuresLinkMethod().click();	}	// without this the test will show passed even if the image doesn't enlarge
	}

	
	
	@When("^I click on the THIRTEENTH FEATURE PIC$")
	public void i_click_on_the_THIRTEENTH_FEATURE_PIC() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.feature13Method();
	}

	@Then("^the THIRTEENTH FEATURE PIC should ENLARGE$")
	public void the_THIRTEENTH_FEATURE_PIC_should_ENLARGE() throws Throwable 
	{
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//img[@src='/img/sync1.jpg']")).isDisplayed())
		{	System.out.println();	}
		else
		{	ob2.featuresLinkMethod().click();	}	// without this the test will show passed even if the image doesn't enlarge
	}
	
	@When("^I click on the X for the THIRTEENTH FEATURE PIC$")
	public void i_click_on_the_X_for_the_THIRTEENTH_FEATURE_PIC() throws Throwable 
	{
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#gallery_13 > div > div > div > div:nth-child(1) > button.back")).click();	// closes image
	}

	@Then("^the THIRTEENTH FEATURE PIC should MINIMIZE$")
	public void the_THIRTEENTH_FEATURE_PIC_should_MINIMIZE() throws Throwable 
	{
		Thread.sleep(1000);
		if (!driver.findElement(By.xpath("//img[@src='/img/sync1.jpg']")).isDisplayed())
		{	System.out.println();	}
		else
		{	ob2.featuresLinkMethod().click();	}	// without this the test will show passed even if the image doesn't enlarge
	}
	
}