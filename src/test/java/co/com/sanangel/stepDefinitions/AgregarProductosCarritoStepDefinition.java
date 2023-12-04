package co.com.sanangel.stepDefinitions;

import co.com.sanangel.pageObject.DetalleSegundoProductoPageObject;
import co.com.sanangel.steps.CarritoStep;
import co.com.sanangel.steps.DetallePrimerProductoStep;
import co.com.sanangel.steps.DetalleSegundoProductoStep;
import co.com.sanangel.steps.PaginaInicialStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class AgregarProductosCarritoStepDefinition {

  @Steps
  PaginaInicialStep paginaInicialStep;
  @Steps
  DetallePrimerProductoStep detallePrimerProductoStep;
  @Steps
  DetalleSegundoProductoStep detalleSegundoProductoStep;

  @Steps
  CarritoStep carritoStep;


  @Dado("que el usuario abre el navegador en la pagina sanangel")
  public void queElUsuarioAbreElNavegadorEnLaPaginaSanangel() {
    paginaInicialStep.abrirNavegador();
  }
  @Cuando("el usuario debe seleccionar un producto con dos cantidades")
  public void elUsuarioDebeSeleccionarUnProductoConDosCantidades() {
    paginaInicialStep.seleccionarPrimerProducto();
    detallePrimerProductoStep.llenarCantidad();
    detallePrimerProductoStep.agregarAlCarrito();
  }
  @Cuando("agregar otro producto con cinco cantidades")
  public void agregarOtroProductoConCincoCantidades() {
    paginaInicialStep.seleccionarSegundoProducto();
    detalleSegundoProductoStep.llenarCantidad();
    detalleSegundoProductoStep.agregarAlCarrito();
  }
  @Entonces("el usuario validar que los productos se añadieron al carrito de compras")
  public void elUsuarioValidarQueLosProductosSeAñadieronAlCarritoDeCompras() {
    carritoStep.validarMensajeResumen();
  }
}
