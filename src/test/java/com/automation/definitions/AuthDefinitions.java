package com.automation.definitions;

import com.automation.steps.AuthSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AuthDefinitions {


    @Steps
    AuthSteps authSteps;

    @Given("^I am on the site$")
    public void iAmOnTheSite() {
        authSteps.openSite();
    }

    @When("^I login with my \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iLoginWithMyAnd(String username, String password) {
        authSteps.loginWithCredentials(username, password);
    }

    @Then("^I should see the product page$")
    public void iShouldSeeTheProductPage() {
        authSteps.validateHome();
    }

    @Then("^I should see the error (.+)$")
    public void iShouldSeeTheError(String errorMsg) {
        authSteps.validateErrorMsg(errorMsg);
    }

    @And("^I logout from the page$")
    public void iLogoutFromThePage() {
        authSteps.logout();
    }

    @Then("^I should see the login page$")
    public void iShouldSeeTheLoginPage() {
        authSteps.validateExistenceFieldsLogin();
    }

    @When("^i am trying to enter the url (.+)$")
    public void iAmTryingToEnterTheUrl(String url) {
        authSteps.tryEnterManualUrl(url);
    }
}
