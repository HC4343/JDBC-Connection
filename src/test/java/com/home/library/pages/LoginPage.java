package com.home.library.pages;

import com.home.library.utilities.ConfigurationReader;
import com.home.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement email;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(tagName = "button")
    public WebElement submit;

    public void login(String email, String password){
       this.email.sendKeys(email);
       this.password.sendKeys(password);
       submit.click();

    }




}
