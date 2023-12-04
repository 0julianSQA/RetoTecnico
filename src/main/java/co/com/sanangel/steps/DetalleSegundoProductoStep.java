package co.com.sanangel.steps;

import co.com.sanangel.pageObject.DetallePrimerProductoPageObject;
import co.com.sanangel.pageObject.DetalleSegundoProductoPageObject;
import co.com.sanangel.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

public class DetalleSegundoProductoStep {

  DetalleSegundoProductoPageObject detalleSegundoProductoPageObject = new DetalleSegundoProductoPageObject();
  EsperaImplicita esperaImplicita = new EsperaImplicita();

  @Step
  public void llenarCantidad(){
    esperaImplicita.esperaImplicita(2);
    detalleSegundoProductoPageObject.getDriver().findElement(detalleSegundoProductoPageObject.getTxtCantidad()).clear();
    detalleSegundoProductoPageObject.getDriver().findElement(detalleSegundoProductoPageObject.getTxtCantidad()).sendKeys("5");
    esperaImplicita.esperaImplicita(2);
  }
  @Step
  public void agregarAlCarrito(){
    detalleSegundoProductoPageObject.getDriver().findElement(detalleSegundoProductoPageObject.getBtbAgregarCarrito()).click();
    esperaImplicita.esperaImplicita(2);
  }
}
