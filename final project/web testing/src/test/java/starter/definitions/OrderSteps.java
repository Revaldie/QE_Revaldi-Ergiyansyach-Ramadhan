package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.OrderPage;

public class OrderSteps {
    @Steps
    OrderPage orderPage;
    @Given("User on Home page")
    public void useronhomepage(){
        orderPage.homepage();
    }
    @When("As a user click beli pepaya")
    public void userclickbelipepaya(){
        orderPage.validateclickpepaya();
    }
    @Then("as user click basket")
    public void userclickbasket(){
        orderPage.userClickBasket();
    }
    @And("User Pay pepaya")
    public void paypepaya(){
        orderPage.clickbayar();
    }

}
