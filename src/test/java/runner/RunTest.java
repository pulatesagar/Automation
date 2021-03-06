package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features="classpath:features/landing.feature",
		glue="stepdefs",
        tags="",
		//monochrome = true,
		plugin = {"pretty",
				"html:target/html/",
				"json:target/json/file.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
		//strict=false,
		dryRun=false

		)
public class RunTest {

	//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
