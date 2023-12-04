package co.com.sanangel.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://sanangel.com.co/")
public class PaginaInicialPageObject extends PageObject {

  By lblProductoUno = By.xpath("//h2[text()='Riviera']");
  By lblProductoDos = By.xpath("//h2[text()='Manarola']");

  public By getLblProductoUno() {
    return lblProductoUno;
  }

  public By getLblProductoDos() {
    return lblProductoDos;
  }
}
