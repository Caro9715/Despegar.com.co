package co.com.accenture.certificacion.despegar.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.accenture.certificacion.despegar.question.LastNameValidation;
import co.com.accenture.certificacion.despegar.question.NameValidation;
import co.com.accenture.certificacion.despegar.tasks.FillForm;
import co.com.accenture.certificacion.despegar.tasks.OpenBrowser;
import co.com.accenture.certificacion.despegar.tasks.SearchFlight;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;





public class ReservaVueloStepDefinitions {
	
	@Managed(driver = "chrome")
    public WebDriver driver;

    private Actor carolina = Actor.named("Carolina");;

    @Before
    public void setUp() {
         carolina.can(BrowseTheWeb.with(driver));
    }

	
	@Given("^that Carolina wants search and reserve a flight$")
	public void thatCarolinaWantsSearchAndReserveAFlight() {
		carolina.wasAbleTo(OpenBrowser.on());
	    
	}


	@When("^enter the data$")
	public void enterTheData(List<String>list) {
		String Nombre = list.get(0);
		String Apellido = list.get(1);
		String Cedula = list.get(2);
		String Ciudad = list.get(3);
		String Direccion = list.get(4);
		String Email = list.get(5);
		String Area = list.get(6);
		String Numero = list.get(7);
		carolina.attemptsTo(SearchFlight.inThePage());
		carolina.attemptsTo(FillForm.theFlight(Nombre, Apellido, Cedula, Ciudad, Direccion, Email, Area, Numero));
	    
	}

	@Then("^I should see the data correctly on the screen$")
	public void iShouldSeeTheDataCorrectlyOnTheScreen() {
		carolina.should(seeThat(NameValidation.inTravelers(), equalTo("Carolina")));
		carolina.should(seeThat(LastNameValidation.inTravelers(), equalTo  ("Pareja")));
		
		
	    
	}

}
