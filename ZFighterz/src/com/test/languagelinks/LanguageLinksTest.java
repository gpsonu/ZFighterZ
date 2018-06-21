package com.test.languagelinks;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.page.factory.FeaturesPagePF;
import com.utility.Hook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LanguageLinksTest 
{
	WebDriver driver = Hook.getDriver();
	FeaturesPagePF ob1 = new FeaturesPagePF(driver);
	
	
	
	
	@Given("^I am on the features page$")
	public void i_am_on_the_features_page() throws Throwable 
	{
		ob1.getURL();
	}
	
	
	

	@When("^I click on the English link$")
	public void i_click_on_the_English_link() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.englishLinkMethod();
	}
	
	@Then("^I should be taken to the homepage of the English version of the site$")
	public void i_should_be_taken_to_the_homepage_of_the_English_version_of_the_site() throws Throwable 
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.freecrm.com/index.html");
	}
	
	
	@When("^I click on the Spanish link$")
	public void i_click_on_the_Spanish_link() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.spanishLinkMethod();
	}
	
	@Then("^I should be taken to the homepage of the Spanish version of the site$")
	public void i_should_be_taken_to_the_homepage_of_the_Spanish_version_of_the_site() throws Throwable 
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://es.crmpro.com/index.html");
	}
	
	
	@When("^I click on the French link$")
	public void i_click_on_the_French_link() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.frenchMethod();
	}
	
	@Then("^I should be taken to the homepage of the French version of the site$")
	public void i_should_be_taken_to_the_homepage_of_the_French_version_of_the_site() throws Throwable 
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://fr.crmpro.com/index.html");
	}
	
	
	@When("^I click on the Chinese link$")
	public void i_click_on_the_Chinese_link() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.chineseMethod();
	}
	
	@Then("^I should be taken to the homepage of the Chinese version of the site$")
	public void i_should_be_taken_to_the_homepage_of_the_Chinese_version_of_the_site() throws Throwable 
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://fr.crmpro.com/index.html");
	}

	
	@When("^I click on the Taiwanese link$")
	public void i_click_on_the_Taiwanese_link() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.taiwanLinkMethod();  
	}
	
	@Then("^I should be taken to the homepage of the Taiwanese version of the site$")
	public void i_should_be_taken_to_the_homepage_of_the_Taiwanese_version_of_the_site() throws Throwable 
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://tw.crmpro.com/index.html");
	}
	

	@When("^I click on the Arabic link$")
	public void i_click_on_the_Arabic_link() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.arabicLinkMethod();
	}
	
	@Then("^I should be taken to the homepage of the Arabic version of the site$")
	public void i_should_be_taken_to_the_homepage_of_the_Arabic_version_of_the_site() throws Throwable 
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://ar.crmpro.com/index.html");
	}
	

	@When("^I click on the Russian link$")
	public void i_click_on_the_Russian_link() throws Throwable 
	{
		Thread.sleep(1000);
		ob1.russianLinkMethod();
	}

	@Then("^I should be taken to the homepage of the Russian version of the site$")
	public void i_should_be_taken_to_the_homepage_of_the_Russian_version_of_the_site() throws Throwable 
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://ru.crmpro.com/index.html");
	}

}