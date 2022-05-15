package starter.pages;

import net.serenitybdd.core.pages.WithLocator;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class OrderPage extends PageObject {
    private By seehomepage(){
        return By.xpath("//div[contains(@class,'v-main__wrap')]");
    }

    private By clicktensidarahelektrik(){
        return By.xpath("(//span[text()= 'Beli']/parent::button)[1]");
    }
    private By userclickbasket(){
        return By.xpath("(//button[contains(@class,'v-btn v-btn--icon v-btn--round theme--dark v-size--default')])[1]");
    }
    private By userpaytensidarahelektrik(){
        return By.xpath("//button[contains(@class,'v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--large primary')]");
    }
    @Step
    public void openPage(){
        open();
    }
    @Step
    public void homepage(){
        $(seehomepage()).isDisplayed();
    }
    @Step
    public void validateclicktensidarahlistrik(){
        $(clicktensidarahelektrik()).click();
    }
    @Step
    public void userClickBasket(){
        $(userclickbasket()).click();
    }
    @Step
    public void paypepaya(){
        $(userpaytensidarahelektrik()).click();
    }

}
