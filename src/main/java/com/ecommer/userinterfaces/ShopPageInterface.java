package com.ecommer.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopPageInterface {
    public static final Target BTN_ADD_TO_CART_1 = Target.the("Button add to cart Product 1").located(By.xpath("//*[@id='content']/div[2]/div[1]/div[1]"));
    public static final Target BTN_ADD_TO_CART_2 = Target.the("Button add to cart Product 2").located(By.xpath("//*[@id='content']/div[2]/div[2]/div[2]"));
    public static final Target BTN_CART = Target.the("Button Cart").located(By.xpath("//*[@id='cart']/button"));
    public static final Target BTN_VIEW_CART = Target.the("Button View Cart").located(By.xpath("//*[@id='cart']/ul/li[2]/div/p/a[1]"));
    public static final Target BTN_CHECKOUT = Target.the("Button Checkout").located(By.xpath("//*[@id='content']/div[3]/div[2]/a"));
    public static final Target BTN_QUEST_CHECKOUT = Target.the("Button QuestCheckout").located(By.xpath("//*[@id='collapse-checkput-option']/div/div/"));
    public static final Target BTN_OK = Target.the("Button OK").located(By.xpath("//*[@id='button-account']"));

}

