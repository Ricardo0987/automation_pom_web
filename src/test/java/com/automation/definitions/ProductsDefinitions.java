package com.automation.definitions;

import com.automation.steps.ProductsSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductsDefinitions {


    @Steps
    ProductsSteps productsSteps;

    @Given("^I am on the products page$")
    public void iAmOnTheProductsPage() {
        productsSteps.validateHome();
    }

    @When("^I Sort products by \"([^\"]*)\"$")
    public void iSortProductsBy(String value) {
        productsSteps.sortByName(value);
    }

    @Then("^I should see the products ordered \"([^\"]*)\"$")
    public void iShouldSeeTheProductsOrdered(String productsOrdered) {
        productsSteps.validateOrder(productsOrdered);
    }

    @When("^I add product to the cart$")
    public void iAddProductToTheCart() {
        productsSteps.addProduct();
    }

    @Then("^I should see the products added to the cart$")
    public void iShouldSeeTheProductsAddedToTheCart() {
        productsSteps.validateProductAdded();
    }

    @Then("^I should see the shopping cart empty$")
    public void iShouldSeeTheShoppingCartEmpty() {
        productsSteps.validateEmptyCart();
    }

    @And("^I remove product to the cart$")
    public void iRemoveProductToTheCart() {
        productsSteps.removeProduct();

    }

}
