package com.automation.definitions;

import com.automation.steps.CheckOutSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class CheckOutDefinitions {


    @Steps
    CheckOutSteps checkOutSteps;

    @Then("^I should see the thank you page$")
    public void iShouldSeeTheThankYouPage() {
        checkOutSteps.validateThanksPage();
    }

    @And("^I am trying to purchase the product with my personal data \"([^\"]*)\"$")
    public void iAmTryingToPurchaseTheProductWithMyPersonalData(List<String> data)  {
        checkOutSteps.purchaseProduct(data);
    }
}
