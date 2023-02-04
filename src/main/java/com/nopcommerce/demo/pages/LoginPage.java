package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailfield = By.id("Email");
    By passwordField=By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By logout = By.xpath("//a[@class='ico-logout']");
    By errorMsg = By.xpath("//div[@class='message-error validation-summary-errors']");

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email){
        sendTextToElement(emailfield,email);
    }

    public  void enterPassword(String Password){
        sendTextToElement(passwordField,Password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getlogOut(){
        return getTextFromElement(logout);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMsg);
    }

}
