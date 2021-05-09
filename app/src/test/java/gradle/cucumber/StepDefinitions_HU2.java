package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinitions_HU2 {

    @Given("^I am playing Buscaminas$")
    public void i_am_playing_buscaminas() throws Throwable {
        throw new PendingException();
    }

    @When("^I click Invulnerability$")
    public void i_click_invulnerability() throws Throwable {
        throw new PendingException();
    }

    @Then("^I can't lose$")
    public void i_cant_lose() throws Throwable {
        throw new PendingException();
    }

}
