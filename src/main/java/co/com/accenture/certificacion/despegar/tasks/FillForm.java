package co.com.accenture.certificacion.despegar.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import co.com.accenture.certificacion.despegar.userinterfaces.DespegarForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class FillForm implements Task{
	
	private String Nombre;
	private String Apellido;
	private String Cedula;
	private String Ciudad;
	private String Direccion;
	private String Email;
	private String Area;
	private String Numero;
	
	public FillForm (String Nombre, String Apellido, String Cedula, String Ciudad, String Direccion, String Email, String Area, String Numero) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Cedula = Cedula;
		this.Ciudad = Ciudad;
		this.Direccion = Direccion;
		this.Email = Email;
		this.Area = Area;
		this.Numero = Numero;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Scroll.to(DespegarForm.PSE),
				Click.on(DespegarForm.PSE),
				SelectFromOptions.byVisibleText("Bancolombia").from(DespegarForm.BANK),
				Enter.theValue(Nombre).into(DespegarForm.NAME),
				Scroll.to(DespegarForm.NAME),
				Enter.theValue(Apellido).into(DespegarForm.LAST_NAME),
				Enter.theValue(Cedula).into(DespegarForm.IDENTIFICATION_NUMBER),
				SelectFromOptions.byVisibleText("Antioquia").from(DespegarForm.STATE),
				Enter.theValue(Ciudad).into(DespegarForm.CITY),
				Click.on(DespegarForm.SELECT_CITY),
				Enter.theValue(Direccion).into(DespegarForm.ADDRESS),
				Scroll.to(DespegarForm.NAMES),
				Enter.theValue(Nombre).into(DespegarForm.NAMES),
				Enter.theValue(Apellido).into(DespegarForm.SURNAMES),
				SelectFromOptions.byVisibleText("Colombia").from(DespegarForm.NATIONALITY),
				Enter.theValue(Cedula).into(DespegarForm.TRAVELER_IDENTIFICATION_NUMBER),
				SelectFromOptions.byVisibleText("15").from(DespegarForm.BIRTHDAY_DAY),
				SelectFromOptions.byVisibleText("1").from(DespegarForm.BIRTHDAY_MONTH),
				SelectFromOptions.byVisibleText("1997").from(DespegarForm.BIRTHDAY_YEAR),
				Click.on(DespegarForm.GENDER),
				Scroll.to(DespegarForm.EMAIL),
				Enter.theValue(Email).into(DespegarForm.EMAIL),
				Enter.theValue(Email).into(DespegarForm.CONFIRM_EMAIL),
				Scroll.to(DespegarForm.PHONE),
				Enter.theValue(Area).into(DespegarForm.AREA),
				Enter.theValue(Numero).into(DespegarForm.NUMBER)
				
				
				);
	}
	
	public static FillForm theFlight(String Nombre, String Apellido, String Cedula, String Ciudad, String Direccion, String Email, String Area, String Numero) {
		return instrumented (FillForm.class, Nombre, Apellido, Cedula, Ciudad, Direccion, Email, Area, Numero);
	}

}
