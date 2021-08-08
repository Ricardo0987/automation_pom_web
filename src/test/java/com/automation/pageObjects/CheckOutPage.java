package com.automation.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckOutPage extends PageObject {


    @FindBy(xpath = "//*[@data-test='firstName']")
    private WebElementFacade firstNameField;
    @FindBy(xpath = "//*[@data-test='lastName']")
    private WebElementFacade lastNameField;
    @FindBy(xpath = "//*[@data-test='postalCode']")
    private WebElementFacade postalCodeField;
    @FindBy(xpath = "//*[@data-test='continue']")
    private WebElementFacade continueBtn;
    @FindBy(xpath = "//*[@data-test='finish']")
    private WebElementFacade finishBtn;
    @FindBy(id = "checkout_complete_container")
    private WebElementFacade thanksContainer;
    @FindBy(xpath = "//*[@data-test='back-to-products']")
    private WebElementFacade backProductsBtn;

    public WebElementFacade getFirstNameField() {
        return firstNameField;
    }

    public WebElementFacade getLastNameField() {
        return lastNameField;
    }

    public WebElementFacade getPostalCodeField() {
        return postalCodeField;
    }

    public WebElementFacade getContinueBtn() {
        return continueBtn;
    }

    public WebElementFacade getFinishBtn() {
        return finishBtn;
    }

    public WebElementFacade getThanksContainer() {
        return thanksContainer;
    }

    public WebElementFacade getBackProductsBtn() {
        return backProductsBtn;
    }


}
