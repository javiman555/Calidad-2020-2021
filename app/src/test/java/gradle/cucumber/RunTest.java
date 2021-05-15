package gradle.cucumber;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/gradle/cucumber",
        plugin = {"pretty",
                "html:target/cucumber",
                "json:target/cucumber.json",
                "html:build/cucumber-html-report",
                //"json-pretty:build/cucumber-report.json"
        })
public class RunTest {
    //¿Hay que dejar vacía la clase RunTest o hay que poner lo que sigue?


}
