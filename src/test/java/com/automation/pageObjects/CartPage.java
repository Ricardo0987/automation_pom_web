package com.automation.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {

    @FindBy(xpath = "(//div[@class='inventory_item_name'])[1]")
    private WebElementFacade fistItemCart;
    @FindBy(xpath = "//*[@data-test='continue-shopping']")
    private WebElementFacade continueShoppingBtn;

    public WebElementFacade getContinueShoppingBtn() {
        return continueShoppingBtn;
    }

    public WebElementFacade getFistItemCart() {
        return fistItemCart;
    }


}
