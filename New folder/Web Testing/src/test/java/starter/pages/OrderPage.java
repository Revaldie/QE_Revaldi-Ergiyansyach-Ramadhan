package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class OrderPage extends PageObject {
    private By seehomepage(){
        return By.xpath("//div[contains(@class,'v-main__wrap')]");
    }

    private By clickproduct(){
        return By.xpath("(//span[text()= 'Beli']/parent::button)[1]");
    }
    private By userclickcart(){
        return By.xpath("(//button[contains(@class,'v-btn v-btn--icon v-btn--round theme--dark v-size--default')])[1]");
    }
    private By userclickbayar(){
        return By.xpath("//button[contains(@class,'v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--large primary')]");
    }

    @Step
    public void openPage(){
        open();
    }
    @Step
    public void homepage(){ $(seehomepage()).isDisplayed();
    }
    @Step
    public void validateclickproduct(){ $(clickproduct()).click();
    }
    @Step
    public void userClickCart(){ $(userclickcart()).click();
    }
    @Step
    public void clickbayar(){ $(userclickbayar()).click();
    }
    @Step
    public void seeAllTransactions(){

    }
}
