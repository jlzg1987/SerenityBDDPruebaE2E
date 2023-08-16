package com.ecommer.tasks;

import com.ecommer.userinterfaces.PurchesePageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PurchaseFormPage implements Performable {

    public final String name;
    public final String country;
    public final String city;
    public final String creditcard;
    public final String month;
    public final String year;

    public PurchaseFormPage(String name, String country, String city, String creditcard, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.creditcard = creditcard;
        this.month = month;
        this.year = year;
    }

public static Performable withData(String name, String country, String city, String creditcard, String month, String  year){
        return instrumented(PurchaseFormPage.class, name, country, city, creditcard, month,year);
}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PurchesePageInterface.IMP_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(name).into(PurchesePageInterface.IMP_NAME),
                WaitUntil.the(PurchesePageInterface.IMP_COUNTRY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(country).into(PurchesePageInterface.IMP_COUNTRY),
                WaitUntil.the(PurchesePageInterface.IMP_CITY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(city).into(PurchesePageInterface.IMP_CITY),
                WaitUntil.the(PurchesePageInterface.IMP_CREDIT_CARD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(creditcard).into(PurchesePageInterface.IMP_CREDIT_CARD),
                WaitUntil.the(PurchesePageInterface.IMP_MONTH, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(month).into(PurchesePageInterface.IMP_MONTH),
                WaitUntil.the(PurchesePageInterface.IMP_YEAR, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(year).into(PurchesePageInterface.IMP_YEAR),
                WaitUntil.the(PurchesePageInterface.BTN_PURCHASE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchesePageInterface.BTN_PURCHASE)
        );
    }
}
