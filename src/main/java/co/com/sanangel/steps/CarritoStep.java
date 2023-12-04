package co.com.sanangel.steps;

import co.com.sanangel.pageObject.CarritoPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class CarritoStep {

  CarritoPageObject carritoPageObject = new CarritoPageObject();

  @Step
  public void validarMensajeResumen(){
    Assert.assertThat(carritoPageObject.getDriver().findElement(carritoPageObject.getBtnValidar())
            .isDisplayed(), Matchers.is(true));
  }
}
