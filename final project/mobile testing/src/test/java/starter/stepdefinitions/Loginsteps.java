package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.pages.Loginpages;

public class Loginsteps {
    @Steps
    Loginpages loginpages;

    @Given("as user on loading screen home")
    public void asuseronloadingscreenhome(){
        Assert.assertTrue(loginpages.isOnPage());

    }
    @When("as a user input register account")
    public void asauserinputregisteraccount(){
        loginpages.inputEmail("revaldi132@gmail.com");
    }
    @And("user input paswword")
    public void userinputpassword(){
        loginpages.inputPassword("aldi1312");

    }
    @And("android user tap login button")
    public void androidusertaploginbutton(){
        loginpages.tapLoginButton();

    }

    @Then("android user see message is displayed")
    public void androiduserseemessageisdisplayed(){

    }


}
