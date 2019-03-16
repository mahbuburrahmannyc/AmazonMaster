package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty", "html:target","com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber_Extents_report.html"},
		features= {"Features"},
		glue= {"com.stepdef"},
		tags= {"@FunctionalTest "}
		//monochrome=true, // console will be readable
		//dryRun=false // if true tells you if you are missing steps in stepdef
		//"json:target/cucumber.json",
		
		)

public class AmazonLogInRunner extends AbstractTestNGCucumberTests {

}
