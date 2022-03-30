package starter.stepdefinition;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.pageproject.loginpage;

public class Loginstep {
    @Steps
    loginpage loginpage;

    @Given("user on login page")
    public void onloginpage(){
        loginpage.open();
        loginpage.validateLoginButtonIsDisplayed();

    }
}
