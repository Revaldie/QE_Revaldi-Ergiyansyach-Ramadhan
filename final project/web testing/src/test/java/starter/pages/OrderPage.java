package starter.pages;

import net.serenitybdd.core.pages.WithLocator;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class OrderPage extends PageObject {
    private By seehomepage(){
        return By.xpath("//div[contains(@class,'v-main__wrap')]");
    }

    private By clickpepaya(){
        return By.xpath("//div[contains(@class,'v-card__actions d-block')]");
    }
    private By userclickbasket(){
        return By.xpath("(//button[contains(@class,'v-btn v-btn--icon v-btn--round theme--dark v-size--default')])[1]");
    }
    private By userclickbayar(){
        return By.xpath("//button[contains(@class,'v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--large primary')]");
    }

    @Step
    public void homepage(){
        $(seehomepage()).isDisplayed();
    }
    @Step
    public void validateclickpepaya(){
        $(clickpepaya()).click();
    }
    @Step
    public void userClickBasket(){
        $(userclickbasket()).click();
    }
    @Step
    public WithLocator clickbayar(){
        $(clickbayar()).click();
        return null;
    }

}
