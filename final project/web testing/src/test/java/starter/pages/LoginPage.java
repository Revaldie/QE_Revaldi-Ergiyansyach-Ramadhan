package starter.pages;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By usernameField(){

        return By.xpath("//label[contains(text(),'Email')]/following-sibling::input");
    }
    private By passwordField(){

        return By.xpath("//label[contains(text(),'Password')]/following-sibling::input");
    }

    private By LoginButton(){

        return By.xpath("//span[contains(text(),'Login')]/parent::button");
    }
    private By LoginIcon(){
        return By.xpath("(//button[contains(@class,'v-btn v-btn--icon v-btn--round theme--dark v-size--default')])[2]");
    }
    @Step
    public void openPage(){

        open();
    }

    @Step
    public void validateonLoginPage(){
        $(LoginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String email){
        $(usernameField()).type(email);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginIcon(){

        $(LoginIcon()).click();
    }
@Step
    public void clickloginButton() {
        $(LoginButton()).click();
    }
}
