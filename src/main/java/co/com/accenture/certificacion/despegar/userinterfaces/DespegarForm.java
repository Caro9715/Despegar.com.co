package co.com.accenture.certificacion.despegar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DespegarForm {
	
	public static final Target PSE = Target.the("PSE").locatedBy("//li[@class='payment-method-option']//label//span[contains(text(),'PSE')]");
	public static final Target BANK = Target.the("Bank").locatedBy("//select[@id='card-selector-0']");
	public static final Target NAME = Target.the("Name").locatedBy("//input[@id='invoice-first-name-0']");
	public static final Target LAST_NAME = Target.the("Last_Name").locatedBy("//input[@id='invoice-last-name-0']");
	public static final Target IDENTIFICATION = Target.the("Identification").locatedBy("//select[@id='invoice-fiscal-identification-type-0']");
	public static final Target IDENTIFICATION_NUMBER = Target.the("Identification number").locatedBy("//input[@id='invoice-fiscal-identification-number-0']");
	public static final Target STATE = Target.the("State").locatedBy("//select[@id='invoice-fiscal-address-state-0']");
	public static final Target CITY = Target.the("City").locatedBy("//input[@id='invoice-fiscal-address-city-CASH_TRANSFER_BOG-0']");
	public static final Target SELECT_CITY = Target.the("Select City").locatedBy("//li[@class='ui-menu-item']//div[contains(text(),'Medellín, Antioquia, Colombia')]");
	public static final Target ADDRESS = Target.the("Address").locatedBy("/html[1]/body[1]/div[2]/div[1]/div[1]/app[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/payment-component[1]/div[1]/div[3]/payment-method[1]/div[1]/prepaid-payment-container[1]/div[1]/selected-card-info-container[1]/span[1]/div[1]/invoice-component[1]/div[1]/div[3]/div[1]/invoice-default-component[1]/div[1]/address[1]/div[1]/div[4]/input-component-v2[1]/div[1]/div[1]/div[1]/input[1]");
	public static final Target NAMES = Target.the("Names").locatedBy("/html[1]/body[1]/div[2]/div[1]/div[1]/app[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/travelers[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/traveler[1]/div[1]/div[2]/div[1]/div[1]/div[1]/traveler-first-name-input[1]/input-component-v2[1]/div[1]/div[1]/div[1]/input[1]");
	public static final Target SURNAMES = Target.the("Surnames").locatedBy("/html[1]/body[1]/div[2]/div[1]/div[1]/app[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/travelers[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/traveler[1]/div[1]/div[2]/div[1]/div[1]/div[2]/traveler-last-name-input[1]/span[1]/input-component-v2[1]/div[1]/div[1]/div[1]/input[1]");
	public static final Target NATIONALITY = Target.the("Nationality").locatedBy("//select[@id='traveler-nationality-0']");
	public static final Target TRAVELER_IDENTIFICATION = Target.the("Traveler identification").locatedBy("//select[@id='traveler-identification-type-0']");
	public static final Target TRAVELER_IDENTIFICATION_NUMBER = Target.the("Traveler identification number").locatedBy("//input[@id='traveler-identification-number-0']");
	public static final Target BIRTHDAY_DAY = Target.the("Birthday day").locatedBy("//select[@id='traveler-birthday-day-0']");
	public static final Target BIRTHDAY_MONTH = Target.the("Birthday month").locatedBy("//select[@id='traveler-birthday-month-0']");
	public static final Target BIRTHDAY_YEAR = Target.the("Birthday year").locatedBy("//select[@id='traveler-birthday-year-0']");
	public static final Target GENDER = Target.the("Gender").locatedBy("//li[@class='product']//li//li[1]");
	public static final Target EMAIL = Target.the("Email").locatedBy("/html[1]/body[1]/div[2]/div[1]/div[1]/app[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/contact[1]/div[1]/div[1]/email-address[1]/div[1]/div[1]/input-component[1]/div[1]/div[1]/div[1]/input[1]");
	public static final Target CONFIRM_EMAIL = Target.the("Confirm email").locatedBy("/html[1]/body[1]/div[2]/div[1]/div[1]/app[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/contact[1]/div[1]/div[1]/email-address[1]/div[1]/div[1]/input-component[2]/div[1]/div[1]/div[1]/input[1]");
	public static final Target PHONE = Target.the("Phone").locatedBy("//select[@id='phone-type-0']");
	public static final Target CODE = Target.the("Code").locatedBy("//input[@id='xnefz5nb3hz7lrj60td59']");
	public static final Target AREA = Target.the("Area").locatedBy("//input[@class='input-tag phone-area-code ng-untouched ng-pristine ng-invalid']");
	public static final Target NUMBER = Target.the("Number").locatedBy("//input[@class='input-tag phone-number-code ng-untouched ng-pristine ng-invalid']");
	public static final Target TRAVELER_NAME = Target.the("Traveler name").locatedBy("//div[@class='traveler']//div[1]//span");
	public static final Target TRAVELER_LAST_NAME = Target.the("Traveler last name").locatedBy("//div[@class='traveler']//div[2]//span");
}
