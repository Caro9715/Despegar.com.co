package co.com.accenture.certificacion.despegar.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features =  "src\\test\\resources\\co\\com\\accenture\\certificacion\\despegar\\features\\reserva_vuelo.feature",
        glue = {"co.com.accenture.certificacion.despegar.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
        )

public class ReservaVueloRunner {

}
