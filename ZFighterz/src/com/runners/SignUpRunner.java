package com.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class SignUpRunner {
	
	@CucumberOptions
	(
		features	= "Features/01signup.feature" ,
		
		glue		= {"com.test.signup" , "com.utility"}
	)

	public class LanguageLinksRunner extends AbstractTestNGCucumberTests
	{
		
	}

}
