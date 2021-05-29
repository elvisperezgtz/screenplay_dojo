package com.advantage.qa.test.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormularioRegistroSteps {
    @Managed
    WebDriver driver;
    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
}
    @Given("^El se encuentra el la zona de registro de la pagina Advantage$")
    public void el_se_encuentra_el_la_zona_de_registro_de_la_pagina_Advantage() {
        theActorCalled("James").whoCan(BrowseTheWeb.with(driver));
        theActorInTheSpotlight().attemptsTo(Open.url("https://www.advantageonlineshopping.com/#/register"));
    }

    @When("^El completa el registro con la informacion requerida por el formulario$")
    public void el_completa_el_registro_con_la_informacion_requerida_por_el_formulario(DataTable arg1) {

    }

    @Then("^El deberia poder ver el mensaje de creacion exitosa del usuario$")
    public void el_deberia_poder_ver_el_mensaje_de_creacion_exitosa_del_usuario() {

    }
}
