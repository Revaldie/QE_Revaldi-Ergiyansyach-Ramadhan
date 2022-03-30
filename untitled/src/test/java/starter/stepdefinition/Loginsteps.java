package starter.stepdefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
    @Given("user on login page")
    public void researchingThings() {

        System.out.println("user on login page");
    }

    @When("user input valid ussername")
    public void  userinputvalidussername(){

        System.out.println("user inpud valid ussername");
    }
    @And("user input valid password")
    public void userinputvalidpassword(){
        System.out.println("user input valid password");
    }
    @And("user click login button")
    public void userclickloginbutton(){
        System.out.println("user click login button");
    }
    @Then("user succes login")
    public void usersucceslogin(){
        System.out.println("user succes login");
    }
    @And("user see home page")
    public void userseehomepage(){
        System.out.println("user see home page");
    }
