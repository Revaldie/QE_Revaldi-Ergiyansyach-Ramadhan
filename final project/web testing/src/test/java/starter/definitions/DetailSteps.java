package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DetailPage;

public class DetailSteps {
    @Steps
    DetailPage detailPage;


    @Given("User on home page")
    public void  useronhomepage(){
        detailPage.openPage();
        detailPage.homepage();
    }

    @When("User click detail tensi darah elektrik")
    public void userclickdetailtensidarahelektrik(){
        detailPage.validateclickdetailtensidarahlistrik();

    }

    @And("user can see detail and rating of product")
    public void usercanseedetailandratingofproduct(){
    }

    @Then("user sucsess see detail and rating of product")
    public void usersucsessseedetailandratingofproduct(){
    }
}
