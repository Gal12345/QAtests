package com.cucumber.StepDefinitions;

import java.net.MalformedURLException;

import com.cucumber.Selenium.SeleniumFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubLoginSD {

    SeleniumFunctions sf = new SeleniumFunctions();

    @Given("^user is on Facebook homepage$")
    public void user_is_on_facbook_homepage() throws MalformedURLException,
            InterruptedException {
        sf.createDriver();
        sf.ishomepageDisplayed();
    }

    @When("^user clicks on Forgot Account in button$")
    public void user_clicks_on_forgot_account() {
        sf.clickLink();
    }

    @Then("^user enters an account$")
    public void user_is_enters_an_account() {
        sf.enterAccount();
        sf.teardown();
    }
}