package gradle.cucumber;

import com.example.reinventatecovid.Casilla;

import org.junit.Assert;

import java.util.logging.Logger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//@RunWith(Cucumber.class)
public class StepDefinitions_HU3 {
    Casilla cellIn = new Casilla();
    Casilla cellOut = new Casilla();
    int clickX,clickY;
    int clickX2,clickY2;

    @Given("^Two cells in 2,3 and in 4,3$")
    public void two_cells_in_23_and_in_43() throws Throwable {
        cellIn.fijarxy(2,3,1);
        cellOut.fijarxy(4,3,1);
        Logger.getLogger("Casillas creadas de 1 de ancho en (2,3) y (4,3)");
    }

    @When("^I click in 3,3$")
    public void i_click_in_33() throws Throwable {
        clickX = 3;
        clickY = 3;
        clickX2 = 5;
        clickY2 = 3;
        Logger.getLogger("Yo clico en las coordenadas 3,3");
    }

    @Then("^i clicked in 2,3 but out of 4,3 cell$")
    public void i_clicked_in_23_but_out_of_43_cell() throws Throwable {
        Assert.assertTrue(cellIn.dentro(clickX,clickY));
        Assert.assertFalse(cellOut.dentro(clickX,clickY));
        Assert.assertTrue(cellOut.dentro(clickX2,clickY2));
        Assert.assertFalse(cellIn.dentro(clickX2,clickY2));
        Logger.getLogger("Accedo al menu de juegos");
    }

}

