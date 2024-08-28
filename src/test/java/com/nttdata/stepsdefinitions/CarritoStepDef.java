package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CarritoStepDef {
    private WebDriver driver;
    @Steps
    CarritoSteps carrito;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
        //espera explícita
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")));
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenProductos() {
        carrito.validoQueCarguenProductos();
    }
    @When("agrego {int} del siguiente producto {string}")
    public void agregoUnidadesDelSiguienteProducto(int und, String prd) {
        carrito.clickProducto(prd);
        carrito.agregarProducto(und);
        //DENTRO DE AGREGAR PRODUCTO SE VALIDA LA CANTIDAD AÑADIDA
    }
    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        //DENTRO DE AGREGAR PRODUCTO SE VALIDA LA CANTIDAD AÑADIDA
    }
}
