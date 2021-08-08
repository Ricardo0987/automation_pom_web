package com.automation.steps;

import com.automation.pageObjects.CartPage;
import com.automation.pageObjects.ProductsPage;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.Matchers;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;


public class ProductsSteps extends PageObject {
    ProductsPage productsPage;
    CartPage cartPage;


    public void validateHome() {
        assertThat(productsPage.getLocationLabel().getText(), Matchers.is("PRODUCTS"));
    }

    public void sortByName(String value) {
        productsPage.getSortBtn().click();
        switch (value) {
            case "name_asc":
                productsPage.getSortOptionByNameAsc().click();
                break;
            case "name_desc":
                productsPage.getSortOptionByNameDsc().click();
                break;
            case "price_asc":
                productsPage.getSortOptionByPriceAsc().click();
                break;
            case "price_desc":
                productsPage.getSortOptionByPriceDsc().click();
                break;
        }
    }

    public void validateOrder(String productsOrdered) {
        String firstProduct = productsOrdered.split(",")[0];
        String lastProduct = productsOrdered.split(",")[1];
        assertThat(productsPage.getFirstProductLabel().getText(), Matchers.is(firstProduct));
        assertThat(productsPage.getLastProductLabel().getText(), Matchers.is(lastProduct));
    }

    public void addProduct() {
        productsPage.getBackPackProductAddBtn().click();
        productsPage.getCartBtn().click();
    }

    public void removeProduct() {
        productsPage.getBackPackProductRmBtn().click();
        productsPage.getCartBtn().click();
    }

    public void validateProductAdded() {
        assertThat(cartPage.getFistItemCart().isDisplayed(), Matchers.is(true));
        cartPage.getContinueShoppingBtn().click();
    }

    public void validateEmptyCart() {
        assertThat(cartPage.getFistItemCart().isPresent(), Matchers.is(false));

    }
}
