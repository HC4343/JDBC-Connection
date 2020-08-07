package com.home.library.step_definitions;

import com.home.library.utilities.ConfigurationReader;
import com.home.library.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.restassured.RestAssured;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before(order = 0)
    public void setUpScenario() {
        System.out.println("set up browser");
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        Driver.getDriver().manage().window().fullscreen();
        RestAssured.baseURI = ConfigurationReader.getProperty("url");
    }

    @After
    public void teardown(Scenario scenario){
        //if test failed - do this
        if(scenario.isFailed()){
            System.out.println("Test failed!");
            byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }else{
            System.out.println("Cleanup!");
            System.out.println("Test completed!");
        }
        System.out.println("##############################");
        //after every test, we gonna close browser
        Driver.close();
    }







}

