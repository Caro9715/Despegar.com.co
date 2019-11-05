package co.com.accenture.certificacion.despegar.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;

@DefaultUrl("https://www.despegar.com.co/")

public class DespegarHomePage extends PageObject{
	
	public static final Target FLIGHT = Target.the("Flight").locatedBy("//a[@class='shifu-3-button-circle FLIGHTS ']//div[@class='button-circle-icon']");
	public static final Target ORIGIN = Target.the("Origin").locatedBy("//div[@class='sbox-3-input -md sbox-3-validation -top-right -icon-left sbox-origin-container places-inline sbox-bind-error-flight-roundtrip-origin-empty']//input[@placeholder='Ingresa desde dónde viajas']");
	public static final Target DESTINATION = Target.the("Destination").locatedBy("//*[@class=\"input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-destination-input sbox-secondary sbox-places-second places-inline\"]");
	public static final Target GOING = Target.the("Going").locatedBy("//div[@class='input-container sbox-bind-event-click-start-date']//input[@placeholder='Ida']");
	public static final Target CALENDAR_GOING = Target.the("Calendar going").locatedBy("/html[1]/body[1]/div[4]/div[1]/div[5]/div[2]/div[4]/span[1]");
	public static final Target RETURN = Target.the("Return").locatedBy("//*[@class=\"input-tag sbox-bind-disable-end-date sbox-bind-value-end-date sbox-bind-reference-flight-end-date-input\"]");
	public static final Target CALENTAR_RETURN = Target.the("Calendar return").locatedBy("/html[1]/body[1]/div[4]/div[1]/div[5]/div[2]/div[4]/span[8]/span[1]");
	public static final Target RIDER = Target.the("Rider").locatedBy("//input[@class='sbox-distri-tag sbox-flights-double-distribution-picker sbox-bind-disable-passengers-input sbox-bind-reference-flight-roundtrip-passengers-input sbox-bind-reference-flight-plus-hotel-passengers-right-input -gradient']");
	public static final Target SEARCH = Target.the("Search").locatedBy("//div[@class='sbox-button -ml3-l -mt5-l']//em[@class='btn-text'][contains(text(),'Buscar')]");
	public static final Target SELECT = Target.the("Select").locatedBy("//span[1]//span[1]//cluster[1]//div[1]//div[1]//div[2]//fare[1]//span[1]//span[1]//div[1]//buy-button[1]//a[1]//div[1]//em[1]");
	public static final Target CONTINUE_WITHOUT_LUGGAGE = Target.the("Select CONTINUAR SIN EQUIPAJE button").locatedBy("//*[@class='eva-3-btn-ghost -lg btn-no ubp-button-continue']");
    
   /* public static final Target TYPE = Target.the("select pyment type ").located(By.id("9jmh80w7347skxqdzplmq"));
    public static final Target PAYMENT_TYPE = Target.the("select pyment type ").locatedBy(    "//*[@for=\"payment-method-2\"]");
    public static final Target NAME = Target.the("Select the name").locatedBy("//*[@class='input-tag traveler-first-name ng-untouched ng-pristine ng-invalid']");*/		
}
