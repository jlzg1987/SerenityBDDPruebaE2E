package com.ecommer.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class PurchesePageInterface {
    public  static  final Target IMP_NAME = Target.the("Input Name").located(By.xpath("//*[@id='input-payment-Name']*"));

    public  static  final Target IMP_COUNTRY = Target.the("Input Country").located(By.xpath("//*[@id='input-payment-Country']*"));
    public  static  final Target IMP_CITY = Target.the("Input City").located(By.xpath("//*[@id='input-payment-City']*"));
    public  static  final Target IMP_CREDIT_CARD = Target.the("Input Credit card").located(By.xpath("//*[@id='input-payment-Credit card']*"));
    public  static  final Target IMP_MONTH = Target.the("Input Month").located(By.xpath("//*[@id='input-payment-Month']*"));
    public  static  final Target IMP_YEAR = Target.the("Input Year").located(By.xpath("//*[@id='input-payment-Year']*"));
    public  static  final Target BTN_PURCHASE = Target.the("Input Purchase").located(By.xpath("//*[@id='button-Purchase']*"));

    public  static  final Target BTN_OK= Target.the("Input OK").located(By.xpath("//*[@id='button-OK']*"));
}
