package com.home.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UseersPage extends BasePage{

     @FindBy(xpath = "//span[@class='title'][.='Users']")
    public WebElement usersPagelink;




}
