package com.simplilearn.bddtest.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource/Features/static-login.feature", 
	glue = {"com/simplilearn/bddtest/stepdefinitions"},
    plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"})
public class StaticLoginTestRunner {

}