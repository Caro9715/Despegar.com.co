package co.com.accenture.certificacion.despegar.question;

import co.com.accenture.certificacion.despegar.userinterfaces.DespegarForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LastNameValidation implements Question <String>{

	@Override
	public String answeredBy(Actor actor) {
		String apellido = Text.of(DespegarForm.TRAVELER_LAST_NAME).viewedBy(actor).asString();
		return apellido;
	}
	
	public static LastNameValidation inTravelers () {
		return new LastNameValidation ();
	}

}
