package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Loginpages;

public class Loginsteps {
    @Steps
    Loginpages loginpages;

    @Given("as user on the home page")
    public void asuseronthehomepage() {
        loginpages.onHomepage();

    }

    @When("as a user click icon on the right product")
    public void asauserclickiconontherightproduct() {
        loginpages.clickLoginIcon();

    }

    @When("user on the login page")
    public void userontheloginpage() {
        loginpages.onLoginpage();

    }


    @Then("user click login and user succses login")
    public void userclickloginandusersuccseslogin() {
    }

    @And("user input {string} on password field")
    public void userInputOnPasswordField(String arg0) {
        loginpages.inputPassword();
    }

    @And("user input {string} on email field")
    public void userInputOnEmailField(String arg0) {
        loginpages.inputEmail();
    }
}
