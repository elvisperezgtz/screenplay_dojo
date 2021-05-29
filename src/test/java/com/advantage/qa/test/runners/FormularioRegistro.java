package com.advantage.qa.test.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/formulario_registro.feature",
        glue = "com.advantage.qa.test.stepsdefinitions")
public class FormularioRegistro {

}
