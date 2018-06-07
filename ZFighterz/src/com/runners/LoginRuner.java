package com.runners;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
	features	= "Features/login.feature",
	
	glue		= {"com.test.login" , "com.utility"}
)

@Test
public class LoginRuner extends AbstractTestNGCucumberTests
{

}