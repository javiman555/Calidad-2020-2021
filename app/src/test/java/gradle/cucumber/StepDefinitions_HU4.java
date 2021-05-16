package gradle.cucumber;

import android.telecom.CallScreeningService;

import com.example.reinventatecovid.Casilla;

import org.junit.Assert;
import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class StepDefinitions_HU4 {
    Casilla a = new Casilla();
    Casilla b = new Casilla();
    Casilla c;

    @Given("^Two cells in 3,3 and in 4,3$")
    public void two_cells_in_33_and_in_43() throws Throwable {
        a.fijarxy(3,3,1);
        b.fijarxy(4,3,1);
    }

    @When("^I substract them$")
    public void i_substract_them() throws Throwable {
        c = b.substract(a);
    }

    @Then("^i receive a new cell 1,0$")
    public void i_receive_a_new_cell_10() throws Throwable {
        Assert.assertEquals(c.x,1,0);
        Assert.assertEquals(c.y,0,0);
    }

}

