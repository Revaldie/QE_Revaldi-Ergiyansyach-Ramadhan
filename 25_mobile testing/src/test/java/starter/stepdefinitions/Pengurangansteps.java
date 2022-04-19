package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.pages.Calculatorpage;

public class Pengurangansteps {

    @Steps
    Calculatorpage calculatorpage;


    protected static Integer firstnumber;
    protected static Integer secondnumber;
    protected static Integer resulst;


    @Given("user on calculator page")
    public void  useroncalculatorpage(){
        Assert.assertTrue(calculatorpage.isOncalculatorpage());

    }
    @And("User tap {string}")
    public void Usertapnumber(String sign){
        calculatorpage.tapsign(sign);

    }

    @Then("user see the result of sum")
    public void userseetheresultofsum(){
        resulst=firstnumber-secondnumber;
        System.out.println(resulst);

    }

    @And("User choose first number {int}")
    public void userChooseFirstNumber(int number) {
        calculatorpage.tapnumber(number);
        firstnumber= number;
    }

    @And("User choose second number {int}")
    public void userChooseSecondNumber(int number) {
        calculatorpage.tapnumber(number);
        secondnumber=number;
    }
}
