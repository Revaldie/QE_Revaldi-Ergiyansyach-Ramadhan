package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.SelectCategoryPage;

public class SelectCategorySteps {
    @Steps
    SelectCategoryPage selectCategoryPage;

    @Given("as a user on home page")
    public void  useronhomepage(){
        selectCategoryPage.openPage();
        selectCategoryPage.homepage();

    }

    @When("as a user click select category")
    public void userclickselectcategory(){
        selectCategoryPage.validateclickselectcategory();

    }

    @And("user choose healty category")
    public void userchoosehealtycategory(){
        selectCategoryPage.userchoseehealtycategory();

    }

    @Then("User sucsess click healty category")
    public void sucsessclickhealtycategory(){
        selectCategoryPage.userclickcategory();

    }
}
