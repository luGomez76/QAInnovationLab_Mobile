@CarritoCompras
 Feature: My Demo App

   @AgregarProducto
   Scenario Outline: Agrego producto
     Given estoy en la aplicación de SauceLabs
     And valido que carguen correctamente los productos en la galeria
     When agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
     Then valido el carrito de compra actualice correctamente

     Examples:
       | PRODUCTO                  | UNIDADES |
       | Sauce Labs Backpack       | 3        |