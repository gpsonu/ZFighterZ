package com.test.featurespicsarrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.page.factory.FeaturesPagePF;
import com.page.factory.HomePagePF;
import com.utility.Hook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeaturesPicsArrowsTest 
{
	WebDriver driver = Hook.getDriver();
	FeaturesPagePF ob1 = new FeaturesPagePF(driver);
	HomePagePF ob2 = new HomePagePF(driver);
	
	
	
	@Given("^I am on the FEATURES page$")
	public void i_am_on_the_FEATURES_page() throws Throwable 
	{
		ob1.getURL();
	}

	
	
	@When("^I CLICK on the FIRST FEATURE PIC$")
	public void i_CLICK_on_the_FIRST_FEATURE_PIC() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.feature1Method();
	}

	@Then("^the FIRST FEATURE PIC should ENLARGE$")
	public void the_FIRST_FEATURE_PIC_should_ENLARGE() throws Throwable 
	{
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//img[@src='/img/dash1.jpg']")).isDisplayed())
		{	System.out.println();	}
		else
		{	ob2.featuresLinkMethod().click();	}	// without this the test will show passed even if the image doesn't enlarge
	}

	
	
	@When("^I CLICK on the RIGHT ARROW of the FIRST FEATURE PIC$")
	public void i_CLICK_on_the_RIGHT_ARROW_of_the_FIRST_FEATURE_PIC() throws Throwable 
	{
		Thread.sleep(1000);
		//ob1.featurePicForwardArrowMethod();
		driver.findElement(By.xpath("//*[@id=\"gallery_1\"]/div/div/div/div[1]/button[3]")).click();;
	}

	@Then("^the ENLARGED SECOND FEATURE PIC should APPEAR$")
	public void the_ENLARGED_SECOND_FEATURE_PIC_should_APPEAR() throws Throwable 
	{
		Thread.sleep(1000);
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//img[@src='/img/calendar1.jpg']")).isDisplayed())
		{	System.out.println();	}
		else
		{	ob2.featuresLinkMethod().click();	}	// without this the test will show passed even if the image doesn't enlarge
	}

	
	
	@When("^I CLICK on the RIGHT ARROW of the SECOND FEATURE PIC$")
	public void i_CLICK_on_the_RIGHT_ARROW_of_the_SECOND_FEATURE_PIC() throws Throwable 
	{
		Thread.sleep(1000);
		//ob1.featurePicForwardArrowMethod();
		driver.findElement(By.xpath("//*[@id=\"gallery_2\"]/div/div/div/div[1]/button[3]")).click();;
	}

	@Then("^the ENLARGED THIRD FEATURE PIC should APPEAR$")
	public void the_ENLARGED_THIRD_FEATURE_PIC_should_APPEAR() throws Throwable 
	{
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//img[@src='/img/contacts1.jpg']")).isDisplayed())
		{	System.out.println();	}
		else
		{	ob2.featuresLinkMethod().click();	}	// without this the test will show passed even if the image doesn't enlarge
	}

	
	
	@When("^I CLICK on the LEFT ARROW of the THIRD FEATURE PIC$")
	public void i_CLICK_on_the_LEFT_ARROW_of_the_THIRD_FEATURE_PIC() throws Throwable 
	{
		Thread.sleep(1000);
		//ob1.featurePicPreviousArrowMethod();
		driver.findElement(By.xpath("//*[@id=\"gallery_3\"]/div/div/div/div[1]/button[1]")).click();;
	}

	
	
	@When("^I CLICK on the LEFT ARROW of the SECOND FEATURE PIC$")
	public void i_CLICK_on_the_LEFT_ARROW_of_the_SECOND_FEATURE_PIC() throws Throwable 
	{
		Thread.sleep(1000);
		//ob1.featurePicPreviousArrowMethod();
		driver.findElement(By.xpath("//*[@id=\"gallery_2\"]/div/div/div/div[1]/button[1]")).click();;
	}

	@Then("^the ENLARGED FIRST FEATURE PIC should APPEAR$")
	public void the_ENLARGED_FIRST_FEATURE_PIC_should_APPEAR() throws Throwable 
	{
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//img[@src='/img/dash1.jpg']")).isDisplayed())
		{	System.out.println();	}
		else
		{	ob2.featuresLinkMethod().click();	}	// without this the test will show passed even if the image doesn't enlarge
	}

}