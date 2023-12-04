package co.com.sanangel.steps;

import co.com.sanangel.pageObject.PaginaInicialPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaInicialStep {

  PaginaInicialPageObject paginaInicialPageObject = new PaginaInicialPageObject();
  @Step
  public void abrirNavegador(){
    paginaInicialPageObject.open();
  }
  @Step
  public void seleccionarPrimerProducto(){
    paginaInicialPageObject.getDriver().findElement(paginaInicialPageObject.getLblProductoUno()).click();
  }
  public void seleccionarSegundoProducto(){
    paginaInicialPageObject.getDriver().findElement(paginaInicialPageObject.getLblProductoDos()).click();
  }
}
