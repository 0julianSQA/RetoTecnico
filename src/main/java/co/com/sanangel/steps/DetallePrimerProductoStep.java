package co.com.sanangel.steps;

import co.com.sanangel.pageObject.DetallePrimerProductoPageObject;
import co.com.sanangel.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

public class DetallePrimerProductoStep {
  DetallePrimerProductoPageObject detallePrimerProductoPageObject = new  DetallePrimerProductoPageObject();

  EsperaImplicita esperaImplicita = new EsperaImplicita();

  @Step
  public void llenarCantidad(){
    esperaImplicita.esperaImplicita(2);
    detallePrimerProductoPageObject.getDriver().findElement(detallePrimerProductoPageObject.getTxtCantidad()).clear();
    detallePrimerProductoPageObject.getDriver().findElement(detallePrimerProductoPageObject.getTxtCantidad()).sendKeys("2");
    esperaImplicita.esperaImplicita(2);
  }
  @Step
  public void agregarAlCarrito(){
    detallePrimerProductoPageObject.getDriver().findElement(detallePrimerProductoPageObject.getBtbAgregarCarrito()).click();
    esperaImplicita.esperaImplicita(2);
    detallePrimerProductoPageObject.getDriver().findElement(detallePrimerProductoPageObject.getBtnHome()).click();
  }

}
