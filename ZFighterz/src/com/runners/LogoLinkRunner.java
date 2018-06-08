package com.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
	features	= "Features/04logolink.feature" ,
	
	glue		= {"com.test.logolink" , "com.utility"}
)
public class LogoLinkRunner extends AbstractTestNGCucumberTests
{

}