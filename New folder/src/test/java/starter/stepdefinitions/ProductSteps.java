package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.Get;

public class ProductSteps {
    @Steps
    Get get;

    @And("Response shows all products")
    public void ResponseShowsAllProducts(){
        get.responseshowallproducts();

    }

    @When("admin added url")
    public void adminAddedUrl() {
        get.adminaddedurl();
    }

    @Then("response shows = {int} OK")
    public void responseShowOK(int arg0) {
        get.responseshowOK();
    }

    @And("input get as a methoded")
    public void inputgetasamethoded(){

        get.inputGetasamethoded();
    }
}
