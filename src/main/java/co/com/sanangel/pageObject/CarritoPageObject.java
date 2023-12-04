package co.com.sanangel.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoPageObject extends PageObject {
  By btnValidar = By.name("woocommerce_checkout_place_order");

  public By getBtnValidar() {
    return btnValidar;
  }
}
