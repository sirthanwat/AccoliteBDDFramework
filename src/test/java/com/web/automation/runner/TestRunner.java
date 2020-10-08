package com.web.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "featureFiles", 
        monochrome = true, 
        dryRun =false,
        glue ="com.web.automation.stepDefinition",
        plugin={"html:target/cucumber-report/",
        		"json:target/cucumber.json",
        		"pretty:target/cucumber.pretty.txt",
        		"junit:target/cucumber.result.xml",
        		"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"
        }
)
public class TestRunner {
	
	@BeforeClass
	public static void setReportConfiguration()
	{
		ExtentProperties  prop = ExtentProperties.INSTANCE;
		prop.setReportPath("./Assignment5reports/report.html");
	}
	@AfterClass
	public static void setConfiguration()
	{
		Reporter.loadXMLConfig("./configFile/extent-config.xml");
	}
}
