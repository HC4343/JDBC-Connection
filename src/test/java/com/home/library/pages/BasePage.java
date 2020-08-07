package com.home.library.pages;

import com.home.library.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class BasePage {



    @FindBy(xpath="//span[@class='title'][text()='Users']")
    public WebElement users;

    @FindBy(xpath = "//span[@class='title'][.='Dashboard']")
    public WebElement pageTitle;

    public String pageTitle(){
        BrowserUtils.waitForVisibility(pageTitle,5);
        return pageTitle.getText();


    }


}
