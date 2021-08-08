package com.automation.steps;

import com.automation.pageObjects.CartPage;
import com.automation.pageObjects.CheckOutPage;
import com.automation.pageObjects.ProductsPage;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.Matchers;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;


public class CheckOutSteps extends PageObject {
    ProductsPage productsPage;
    CartPage cartPage;
    CheckOutPage checkOutPage;

    public void purchaseProduct(List<String> data) {
        productsPage.getCartBtn().click();
        cartPage.getCheckoutBtn().click();
        checkOutPage.getFirstNameField().sendKeys(data.get(0));
        checkOutPage.getLastNameField().sendKeys(data.get(1));
        checkOutPage.getPostalCodeField().sendKeys(data.get(2));
        checkOutPage.getContinueBtn().click();
        checkOutPage.getFinishBtn().click();
    }

    public void validateThanksPage() {
        assertThat(checkOutPage.getThanksContainer().isPresent(), Matchers.is(true));
        checkOutPage.getBackProductsBtn().click();

    }
}
