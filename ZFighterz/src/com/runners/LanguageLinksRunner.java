package com.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
	features	= "Features/07languagelinks.feature" ,
	
	glue		= {"com.test.languagelinks" , "com.utility"}
)

public class LanguageLinksRunner extends AbstractTestNGCucumberTests
{
	
}