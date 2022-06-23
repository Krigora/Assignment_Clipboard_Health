package com.amazon.runnrs;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
       },
        features = "src/test/resources/features",
        glue = "com/amazon/step_def",
        dryRun = false,
      tags = "@Amazon"
)


public class CukesRunner {
}
