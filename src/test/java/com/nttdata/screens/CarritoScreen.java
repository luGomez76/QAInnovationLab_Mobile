package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CarritoScreen extends PageObject {
    //ELEMENTOS
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"Scrollview manages views in given screen size\"]")
    private List<WebElement> itemsHome;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement btnBackpack;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement btnBike;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-shirt\"]")
    private WebElement btnBolt;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Fleece Jacket\"]")
    private WebElement btnJacket;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement btnAddPrd;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAddToCart;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/cartTV\"]")
    private WebElement numCarrito;

    //METODOS
    public int getCountElements(){
        return itemsHome.size();
    }
    public void btnBackpack(){btnBackpack.click();}
    public void btnAddPrd(){btnAddPrd.click();}
    public void btnAddToCart(){btnAddToCart.click();}
    public String getNumCarrito(){
        return numCarrito.getAttribute("text");
    }
}
