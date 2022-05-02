package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.categories.GET;

public class CategoriesSteps {
    @Steps
    GET get;
    @Given("admin on postman app")
    public void AdminonPostmanApp(){

    }

    @When("admin add url")
    public void adminAddUrl() {

        get.adminAddUrl();
    }

    @And("input GET as a method")
    public void inputGETAsAMethod() {

        get.inputGETAsAMethod();
    }

    @And("admin click send")
    public void adminClickSend() {

        get.adminClickSend();
    }

    @Then("response shows = {int} Not Found")
    public void responseShowsNotFound(int arg0) {
        get.responseShowsNotFound(404);
    }

    @And("I don't receive all categories")
    public void iDonTReceiveAllCategories() {
        get.iDonTReceiveAllCategories();
    }


}
