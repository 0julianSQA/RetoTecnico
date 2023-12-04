package co.com.sanangel.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetalleSegundoProductoPageObject extends PageObject {
  By txtCantidad = By.name("quantity");
  By btbAgregarCarrito = By.name("add-to-cart");

  public By getTxtCantidad() {
    return txtCantidad;
  }

  public By getBtbAgregarCarrito() {
    return btbAgregarCarrito;
  }
}
