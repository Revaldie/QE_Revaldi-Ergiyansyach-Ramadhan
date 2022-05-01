package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;

public class RegisterSteps {
    @Steps
    RegisterPage registerPage;

    @Steps
    LoginPage loginPage;

    @Given("user on register page")
    public void ontheLoginPage(){
        registerPage.openPage();
        registerPage.clickLoginIcon();
        registerPage.clickRegister();
        registerPage.clickRegisterIcon();
        registerPage.validateonLoginPage();
    }

    @When("user input full name")
    public void ValidFullname(){
        registerPage.inputFullName("aldi");

    }

    @And("user input email")
    public void ValidEmail(){
        registerPage.inputEmail("revaldier@gmail.com");
    }

    @And("user input password")
    public void ValidPassword(){
        registerPage.inputPassword("aldi1312");

    }
    @And("click register button")
    public void RegisterButton(){
        registerPage.clickRegisterbutton();

    }
    @Then("user redirected to login page")
    public void LoginPage(){
       registerPage.validateonLoginPage();
    }
}
