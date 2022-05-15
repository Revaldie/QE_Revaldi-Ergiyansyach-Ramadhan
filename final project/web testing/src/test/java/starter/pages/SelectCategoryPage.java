package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SelectCategoryPage extends PageObject {
    private By seehomepage(){
        return By.xpath("//div[contains(@class,'v-main__wrap')]");
    }
    private By clickselectcategory(){
        return By.xpath("//div[contains(@class, 'v-select__selections')]");
    }

    private By userchoosehealtycategory(){
        return By.xpath("//div[contains(@class, 'v-list-item__title')]");

    }

    private By usersucsessclickcategory(){
        return By.xpath("//div[contains(@class, 'v-select__slot')]");
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
    public void validateclickselectcategory(){
        $(clickselectcategory()).click();
    }
    @Step
    public void userchoseehealtycategory(){
        $(userchoosehealtycategory()).click();
    }
    @Step
    public void userclickcategory(){
        $(usersucsessclickcategory()).click();
    }



}
