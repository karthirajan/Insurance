package com.insurance.steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features//Home_Page.feature",
               	 glue="com.insurance.stepdefinition",
               	 monochrome = true,
               	 dryRun = false,
               	 plugin = {"html:target/cucumber-html-reports"})

public class TestRunner {

}
