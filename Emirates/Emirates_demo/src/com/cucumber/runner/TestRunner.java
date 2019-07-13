
package com.cucumber.runner;

import java.io.FileReader;
//import com.cucumber.listener.Reporter;
//import com.vimalselvam.cucumber.listener.ExtentProperties;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features", glue = { "src/steps" },
plugin = { "pretty", "html:src/target/cucumber-reports" },
monochrome = true,
tags = {"@BookFlight"}
// {"com.cucumber.listener.ExtentCucumberFormatter:src/target/cucumber-reports/report.html"}
)

public class TestRunner{
	/*
	 * @BeforeClass public static void setup() { ExtentProperties extentProperties =
	 * ExtentProperties.INSTANCE; extentProperties.setReportPath(
	 * "C:\\Emirates\\Emirates_demo\\test-output\\myreport.html"); }
	 */
	
	}
