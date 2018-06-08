package com.runners;
 
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
	features	= "Features/06featurespics.feature" ,
	
	glue		= {"com.test.featurespics" , "com.utility" }
)

public class FeaturesPicsRunner extends AbstractTestNGCucumberTests
{
	
}