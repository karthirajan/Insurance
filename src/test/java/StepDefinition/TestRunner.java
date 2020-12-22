package StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="./Feature",
                 glue="StepDefinition",
                 monochrome=true, 
                 dryRun=false,
                 plugin= {"html:target/htmlreport","json:target/report.json"}
               )


public class TestRunner {
	


}
