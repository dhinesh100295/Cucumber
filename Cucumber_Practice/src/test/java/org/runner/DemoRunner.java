package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace-Cucumber\\Cucumber_Practice\\featurefiles\\Demo.feature",
glue="org.step_Definitions")
public class DemoRunner {

}
