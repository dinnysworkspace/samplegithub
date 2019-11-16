package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\dines\\Documents\\Selenium Workplace\\CucumberFramework\\src\\main\\java\\Features",glue={"stepDefinition"},={})



public class LoginTestRunner {

}
