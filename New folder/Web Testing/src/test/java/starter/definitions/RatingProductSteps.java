package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RatingProductPage;

public class RatingProductSteps {
    @Steps
    RatingProductPage ratingProductPage;


    @Given("User on home page")
    public void  useronhomepage(){
        ratingProductPage.openPage();
        ratingProductPage.homepage();
    }

    @When("User click detail tensi darah elektrik")
    public void userclickdetailtensidarahelektrik(){
        ratingProductPage.validateclickdetailtensidarahlistrik();

    }

    @And("user can see detail and rating of product")
    public void usercanseedetailandratingofproduct(){
    }

    @Then("user sucsess see detail and rating of product")
    public void usersucsessseedetailandratingofproduct(){
    }
}
