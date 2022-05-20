package com.carsguide.steps;

import com.carsguide.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchFunctionalityTestSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        new HomePage().clickOnSearchCarsLink();
    }
    @When("^I mouse hover on 'buy\\+sell' tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverOnBuySellTab();
    }
    @And("^I click 'Used' used car link$")
    public void iClickUsedUsedCarLink() {
        new HomePage().clickOnUsedCarLink();
    }
    @Then("^I navigate to \"([^\"]*)\" used car page$")
    public void iNavigateToUsedCarPage(String carPage)  {
        new HomePage().clickOnUsedCarLink();
    }
    @And("^I click 'Search Cars' link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCarsLink();
    }
    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String navigatePage)  {
        new HomePage().clickOnUsedCarLink();
    }
    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {


    }
    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
    }
    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) throws Throwable {

        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
    }
    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make)  {

    }
}
