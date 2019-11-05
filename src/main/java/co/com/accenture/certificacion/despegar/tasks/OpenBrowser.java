package co.com.accenture.certificacion.despegar.tasks;

import co.com.accenture.certificacion.despegar.userinterfaces.DespegarHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenBrowser implements Task{
	DespegarHomePage DespegarHomePage;
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(DespegarHomePage));
    }
    public static OpenBrowser on() {
        return Tasks.instrumented(OpenBrowser.class);
    }
}
