package com.nttdata.steps;

import com.nttdata.screens.CarritoScreen;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class CarritoSteps {
    CarritoScreen carrito;
    public void validoQueCarguenProductos() {
        Assert.assertTrue("No hay elementos",carrito.getCountElements()>0);
    }
    public void clickProducto(String prd) {
        carrito.btnBackpack();
    }
    public void agregarProducto(int cnt) {
        if (cnt > 1){
            for (int i=1; i<=cnt-1; i++){
                carrito.btnAddPrd();
            }
            carrito.btnAddToCart();
        }else {carrito.btnAddToCart();}

        String num = carrito.getNumCarrito();
        String cntStr = Integer.toString(cnt);

        Assert.assertTrue("Cantidades no corresponden",num.equals(cntStr));
    }

}
