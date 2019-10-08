package com;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Users/bittech/eclipse-workspace/bddprojectbtc190613e/login.feature"},tags= {"@Smoke"},
plugin ={"pretty" , "html:login"},glue= {"com"})
public class RUNNER {

	
	
	
	
	
	
}
