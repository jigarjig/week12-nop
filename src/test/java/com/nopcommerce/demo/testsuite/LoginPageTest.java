package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    @Test
    public void userShouldNavigateToLoginPageSuccessFully(){
        homePage.clickOnLoginLink();
        String actualMessage=loginPage.getWelcomeText();
        String expectedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMessage,expectedMessage,"Login page verfied");
    }
    @Test
    public void verifyErrorWithInValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("rraj@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        String actual=loginPage.getErrorMessage();
        String expected= "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actual,expected,"error message with inavalid credentials");
    }
    @Test
    public void verifyLoginSuccessFullyWithValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("raj@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        String actual = loginPage.getlogOut();
        String expected = "Log out";
        Assert.assertEquals(actual, expected, "Log out");
    }
    @Test
    public void verifyUserLogoutSuccessFully() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("raj@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        loginPage.getlogOut();
        String actual = loginPage.getlogOut();
        String expected = "Log out";
        Assert.assertEquals(actual, expected, "Log out");
    }





}
