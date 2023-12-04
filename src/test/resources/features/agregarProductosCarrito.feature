#language: es
Característica: Agregar Productos al carrito de compras

  Escenario: Ingresar dos productos al carrito de compras de forma exitosa
    Dado que el usuario abre el navegador en la pagina sanangel
    Cuando el usuario debe seleccionar un producto con dos cantidades
    Y agregar otro producto con cinco cantidades
    Entonces el usuario validar que los productos se añadieron al carrito de compras
