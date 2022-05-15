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
    public void UserOnHomePage(){
        orderPage.openPage();
        orderPage.homepage();

    }

    @When("User click tensi darah elektrik")
    public void clickProduct(){
        orderPage.validateclickproduct();

    }
    @And("User click cart")
    public void ClickCart(){
        orderPage.userClickCart();

    }
    @And("User click Bayar")
    public void ClickBayar(){
        orderPage.clickbayar();

    }
    @Then("User see all the transaction")
    public void seeAllTransactions(){
        orderPage.seeAllTransactions();

    }




}
