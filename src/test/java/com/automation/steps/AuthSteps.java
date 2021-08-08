package com.automation.steps;

import com.automation.pageObjects.LoginPage;
import com.automation.pageObjects.ProductsPage;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;


public class AuthSteps extends PageObject {
    private LoginPage loginPage;
    private ProductsPage productsPage;


    public void openSite() {
        loginPage.open();
    }

    public void loginWithCredentials(String username, String password) {
        loginPage.getUserNameField().sendKeys(username);
        loginPage.getPasswordField().sendKeys(password);
        loginPage.getLoginBtn().click();
    }

    public void validateHome() {
        assertThat(productsPage.getLocationLabel().getText(), Matchers.is("PRODUCTS"));
    }

    public void validateErrorMsg(String errorMsg) {
        assertThat(loginPage.getErrorMsg().getText(), Matchers.is(errorMsg));
    }

    public void logout() {
        productsPage.getMenuBtn().click();
        productsPage.getLogoutLink().click();
    }

    public void validateExistenceFieldsLogin() {
        assertThat(loginPage.getUserNameField().isDisplayed(), Matchers.is(true));
        assertThat(loginPage.getPasswordField().isDisplayed(), Matchers.is(true));
        assertThat(loginPage.getLoginBtn().isDisplayed(), Matchers.is(true));

    }

    public void tryEnterManualUrl(String url) {
        getDriver().get(url);
    }
}
