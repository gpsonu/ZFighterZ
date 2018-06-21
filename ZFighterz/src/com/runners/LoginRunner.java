package com.runners;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
	features	= "Features/02login.feature",
	
	glue		= {"com.test.login" , "com.utility"}
)

@Test
public class LoginRunner extends AbstractTestNGCucumberTests
{

}