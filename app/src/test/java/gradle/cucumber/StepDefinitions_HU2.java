package gradle.cucumber;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

import com.example.reinventatecovid.Buscaminas;

import java.util.logging.Logger;


public class StepDefinitions_HU2 {
    //Buscaminas buscaminas = new Buscaminas();
    //@Test
    @Given("^I am playing Buscaminas$")
    public void i_am_playing_buscaminas() throws Throwable {
        //if(buscaminas instanceof Buscaminas){
            //Si es de tipo buscaminas
        //}else{
            //No es de tipo buscaminas
        //}
        Logger.getLogger("Yo estoy jugando al juego Buscaminas");
    }
    //@Test
    @When("^I click Invulnerability$")
    public void i_click_invulnerability() throws Throwable {
        //buscaminas.setInmortal(true);
        Logger.getLogger("Yi clico sobre el botón Invulnerable");
    }
    //@Test
    @Then("^I can't lose$")
    public void i_cant_lose() throws Throwable {
        //Assert.assertEquals(true,buscaminas.getInmortal());
        Logger.getLogger("No puedo perder");
    }



}
