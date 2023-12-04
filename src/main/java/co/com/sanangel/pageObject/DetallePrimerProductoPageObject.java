package co.com.sanangel.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetallePrimerProductoPageObject extends PageObject {

  By txtCantidad = By.name("quantity");
  By btbAgregarCarrito = By.name("add-to-cart");

  By btnHome = By.xpath("//img[@src='https://sanangel.com.co/wp-content/uploads/2022/10/cropped-logo-san-angel-1.png'][1]");

  public By getTxtCantidad() {
    return txtCantidad;
  }

  public By getBtbAgregarCarrito() {
    return btbAgregarCarrito;
  }
  public By getBtnHome() {
    return btnHome;
  }
}
