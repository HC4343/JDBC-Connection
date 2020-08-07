package com.home.library.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "rerun:target/rerun"
        },
        features = "src/test/resources/features",
        glue = "com/home/library/step_definitions",
        dryRun =false,
        tags ="@users"


)
public class CukesRunner {
}
