package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.pages.CalculatorPage;

public class PembagianSteps {

    @Steps
    CalculatorPage calculatorPage;

    protected static Integer firstnumber;
    protected static Integer secondnumber;
    protected static Integer result;


    @Given("user on calculator page")
    public void useroncalculatorpage() {
        Assert.assertTrue(calculatorPage.useronpage());
    }

    @And("user tap {string}")
    public void Usertapsign(String sign) {
        calculatorPage.tapSign(sign);
    }

    @Then("user see the result")
    public void userseetheresultofsum() {
        result = firstnumber / secondnumber;
        System.out.println(result);
    }

    @And("User choose first number {int}")
    public void userChooseFirstNumber(int number) {
        calculatorPage.tapNumber(number);
        firstnumber = number;
    }

    @And("User choose second number {int}")
    public void userChooseSecondNumber(int number) {
        calculatorPage.tapNumber(number);
        secondnumber = number;
    }
}
