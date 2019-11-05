package co.com.accenture.certificacion.despegar.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import co.com.accenture.certificacion.despegar.userinterfaces.DespegarHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;




public class SearchFlight implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(DespegarHomePage.FLIGHT),
				Enter.theValue("Medellin").into(DespegarHomePage.ORIGIN),
				Hit.the(Keys.ENTER).into(DespegarHomePage.ORIGIN),
				Enter.theValue("Bogota").into(DespegarHomePage.DESTINATION),
				Hit.the(Keys.ENTER).into(DespegarHomePage.DESTINATION),
				Click.on(DespegarHomePage.GOING),
				Click.on(DespegarHomePage.CALENDAR_GOING),
				/*Click.on(DespegarHomePage.RETURN),*/
				Click.on(DespegarHomePage.CALENTAR_RETURN),
				Click.on(DespegarHomePage.RIDER),
				Click.on(DespegarHomePage.SEARCH),
				Click.on(DespegarHomePage.SELECT),
				Click.on(DespegarHomePage.CONTINUE_WITHOUT_LUGGAGE)
				/*Scroll.to(DespegarHomePage.TYPE)*/
			
				);
		
	}
	
	public static SearchFlight inThePage() {
		return instrumented(SearchFlight.class);
	}

}
