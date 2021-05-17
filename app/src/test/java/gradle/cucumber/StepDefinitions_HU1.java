package gradle.cucumber;

//import com.getkeepsafe.relinker.ReLinker;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.logging.Logger;


//@RunWith(Cucumber.class)
public class StepDefinitions_HU1 {
    //@Test
    @Given("^I am Senior Citicen$")
    public void i_am_senior_citicen() throws Throwable {
        Logger.getLogger("Soy un ciudadano");
    }
    //@Test
    @When("^I click play$")
    public void i_click_play() throws Throwable {
        Logger.getLogger("Yo clico en el boton jugar");
    }
    //@Test
    @Then("^I access the games$")
    public void i_access_the_games() throws Throwable {
        Logger.getLogger("Accedo al menu de juegos");

    }

}
