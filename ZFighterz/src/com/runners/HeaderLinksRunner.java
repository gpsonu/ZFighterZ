package com.runners;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
		features	= "Features/headerlinks.feature"	,
		glue 		= "com.test.headerlinks"
)

@Test
public class HeaderLinksRunner extends AbstractTestNGCucumberTests
{
	
}
