package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailPage extends PageObject {
    private By seehomepage(){
        return By.xpath("//div[contains(@class,'v-main__wrap')]");
    }
    private By clickdetailtensidarahlistrik(){
        return By.xpath("(//span[text()= 'Detail']/parent::button)[1]");
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
    public void validateclickdetailtensidarahlistrik(){
        $(clickdetailtensidarahlistrik()).click();
    }



}
