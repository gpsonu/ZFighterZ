package com.runners;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
	features	= "Features/05headerlinks.feature",
	
	glue 		= {"com.test.headerlinks" , "com.utility"}
)

@Test
public class HeaderLinksRunner extends AbstractTestNGCucumberTests
{
	
}