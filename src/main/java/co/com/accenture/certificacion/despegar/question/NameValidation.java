package co.com.accenture.certificacion.despegar.question;

import co.com.accenture.certificacion.despegar.userinterfaces.DespegarForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class NameValidation implements Question <String>{

	@Override
	public String answeredBy(Actor actor) {
		String nombre = Text.of(DespegarForm.TRAVELER_NAME).viewedBy(actor).asString();	
		return nombre;
	}
	
	public static NameValidation inTravelers () {
		return new NameValidation ();
	}

}
