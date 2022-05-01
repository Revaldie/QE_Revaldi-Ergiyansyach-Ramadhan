package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;


    @Steps
    HomePage homePage;

    @Given("user on login page")
    public void ontheLoginPage(){
        loginPage.openPage();
        loginPage.clickLoginIcon();
        loginPage.validateonLoginPage();
    }
    @When("user input valid email")
    public void ValidEmail(){
        loginPage.inputEmail("blabla@gmail.com");

    }
    @And("user input valid password")
    public void ValidPassword(){
        loginPage.inputPassword("1111");

    }
    @And("click login button")
    public void LoginButton(){
        loginPage.clickloginButton();

    }
    @Then("I am on the home page ")
    public void HomePage(){
        homePage.validateHomePage();
    }

}
