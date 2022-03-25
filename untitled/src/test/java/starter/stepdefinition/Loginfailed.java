package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Loginfailed {
        @Then("the user fails to enter the home page")
        public void researchingThings() {

            System.out.println("the user fails to enter the home page");
        }
        @And("user can't see my home page")
        public void usercantseemyhomepage() {
            System.out.println("user can't see my home page");
         }
    }


