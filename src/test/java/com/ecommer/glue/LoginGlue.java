package com.ecommer.glue;

import com.ecommer.tasks.AddProductPager;
import com.ecommer.tasks.OpenPage;
import com.ecommer.tasks.PurchaseFormPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginGlue {
    private  static  final  String ACTOR_NAME="User";
    @Before
    public  void setThenStag(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("*(.*) estoy en la pagina del carrito")
    public void login (String actor){
        theActorCalled(actor).attemptsTo(OpenPage.loadPageWithUrl("https://www.demoblaze.com/"));}

    @When("seleccion un producto")
public  void selectproct(){
        when(OnStage.theActorInTheSpotlight()).attemptsTo(
                AddProductPager.addProductsToCart());
    }

    @Then("Agregar al carrito")
    public  void addproduct(){

    }

    @And("veo el carrito")
    public  void  viewcart(){

    }

    @When("* ingresar datos (.*?) (.*?) (.*?) (.*?) (.*?) (.*?)$")
    public void form(String Name, String Country, String City , String CreditCart, String Month, String Year ){
        theActorInTheSpotlight().attemptsTo(
                PurchaseFormPage.withData(Name,Country, City, CreditCart, Month,Year)
        );
    }
    @Then("veonuevo formulario")
    public  void    next(){

    }

}
