package com.home.library.step_definitions;

import com.home.library.pages.UseersPage;
import com.home.library.utilities.BrowserUtils;
import com.home.library.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PageNaavigatonStepDefinitions {
    UseersPage useersPage = new UseersPage();

    @Then("I click on the {string} link")
    public void i_click_on_the_link(String string) {
        switch (string.toLowerCase()){
            case "dashboard":
                break;
            case "users":
                break;
            case "books":
                break;

        }

    }

    @Then("{string} page should be displayed")
    public void page_should_be_displayed(String string) {
        BrowserUtils.wait(3);
        Assert.assertTrue(Driver.get().getCurrentUrl().endsWith(string.toLowerCase()));
        switch (string.toLowerCase()){
            case "users":
                String actual = useersPage.usersPagelink.getText();
                //Assert.assertEquals();
        }

    }



}
