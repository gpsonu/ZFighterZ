package com.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions

(features = "Features/03logout.feature",

 glue = {"com.test.logout","com.utility"})




public class LogOutRunner extends AbstractTestNGCucumberTests{

	}
