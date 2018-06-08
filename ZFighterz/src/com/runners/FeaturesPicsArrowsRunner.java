package com.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
	features	= "Features/08featurespicsarrows.feature" ,
	
	glue		= {"com.test.featurespicsarrows" , "com.utility" }
)

public class FeaturesPicsArrowsRunner extends AbstractTestNGCucumberTests
{
	
}