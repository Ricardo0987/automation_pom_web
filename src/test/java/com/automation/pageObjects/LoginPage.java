package com.automation.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//*[@data-test='username']")
    private WebElementFacade userNameField;

    @FindBy(xpath = "//*[@data-test='password']")
    private WebElementFacade passwordField;

    @FindBy(xpath = "//*[@data-test='login-button']")
    private WebElementFacade loginBtn;

    @FindBy(xpath = "//*[@data-test='error']")
    private WebElementFacade errorMsg;

    public WebElementFacade getUserNameField() {
        return userNameField;
    }

    public WebElementFacade getPasswordField() {
        return passwordField;
    }

    public WebElementFacade getLoginBtn() {
        return loginBtn;
    }

    public WebElementFacade getErrorMsg() {
        return errorMsg;
    }
}
