package com.co.sho_p.stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.RegisterModel;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

public class RegisterStepDefinitions {

    @DataTableType
    public RegisterModel convert(Map<String, String> entry) {
        RegisterModel register = new RegisterModel();
        register.setEmail(entry.get("email"));
        register.setPassword(entry.get("password"));
        return register;
    }


    @Given("the user is on the page")
    public void theUserIsOnThePage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user selects user modal")
    public void theUserSelectsUserModal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user selects register anchor element")
    public void theUserSelectsRegisterAnchorElement() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user sees {string} page")
    public void theUserSeesPage(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user put the correct credentials")
    public void theUserPutTheCorrectCredentials(@NotNull List<RegisterModel> registerModelList) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user selects the register button")
    public void theUserSelectsTheRegisterButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user can see {string} message")
    public void theUserCanSeeMessage(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user is registered in the app")
    public void theUserIsRegisteredInTheApp() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user is redirected to login page")
    public void theUserIsRedirectedToLoginPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
