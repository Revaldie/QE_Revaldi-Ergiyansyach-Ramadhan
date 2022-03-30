package starter.pageproject;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class loginpage extends PageObject {
    private By loginbutton(){
        return By.id("login-button");
    }
    @Step
    public void openpage(){
        open();
    }
    @Step
    public boolean validateLoginButtonIsDisplayed(){
        return $(loginbutton()).isDisplayed();
    }

}

