package com.LimeRoad_TestRunner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.LimeRoad_Example.BaseClassLimeRoad;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/java/com/LimeRoad_Feature/LimeRoad.feature",
                 glue="com.LimeRoad_StepDefinition",
                 dryRun= false,
                 strict = true,
                 monochrome = true,
                 plugin= {"pretty","html:Resources/limeroad.html",
                		 "json:Resources/limeroad.json",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
                 
public class TestRunner{

	
}
