package com.home.library.step_definitions;

import com.home.library.pages.LoginPage;
import com.home.library.utilities.ConfigurationReader;
import com.home.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps1 {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.get().get(ConfigurationReader.getProperty("url"));

    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        String email = ConfigurationReader.getProperty("librarian_email");
        String password = ConfigurationReader.getProperty(("librarian_password"));
        loginPage.login(email,password);



    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {

        System.out.println("Verifing dashboard page");
        WebDriverWait wait = new WebDriverWait(Driver.get(),5);
        wait.until(ExpectedConditions.urlContains("dashboard"));
        String actualTitle = Driver.get().getCurrentUrl();
        Assert.assertTrue(actualTitle.contains("dashboard"));


    }

    @When("I login as a student")
    public void i_login_as_a_student() {
       String email = ConfigurationReader.getProperty("student_email");
       String password = ConfigurationReader.getProperty("student_password");
       loginPage.login(email,password);
    }

    @When("I login as a admin")
    public void i_login_as_a_admin() {
        //String email = ConfigurationReader.getProperty("")
    }



}





