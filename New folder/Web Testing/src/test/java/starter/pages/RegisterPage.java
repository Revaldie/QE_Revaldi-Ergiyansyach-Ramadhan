package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    private By usernameField(){

        return By.xpath("//label[contains(text(),'Nama Lengkap')]/following-sibling::input");
    }
    private By emailField() {

        return By.xpath("//label[contains(text(),'Email')]/following-sibling::input");
    }
    private By passwordField(){

        return By.xpath("//label[contains(text(),'Password')]/following-sibling::input");
    }
    private By LoginIcon(){
        return By.xpath("(//button[contains(@class,'v-btn v-btn--icon v-btn--round theme--dark v-size--default')])[2]");
    }

    private By Register(){
        return By.xpath("//a[contains(text(),'Register')]");
    }

    private By RegisterIcon(){
        return By.xpath("//button[contains(@class,'v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary')]");
    }

    private By RegisterButton(){

        return By.xpath("//span[contains(text(),'Register')]/parent::button");
    }

    @Step
    public void openPage(){

        open();
    }

    @Step
    public void validateonLoginPage(){
        $(RegisterButton()).isDisplayed();
    }

    @Step
    public void inputFullName(String fullname){
        $(usernameField()).type(fullname);
    }
    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
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
    public void clickRegister (){
        $(Register()).click();
    }

    @Step
    public void clickRegisterIcon(){

        $(RegisterIcon()).click();
    }

    @Step
    public void clickRegisterbutton(){
        $(RegisterButton()).click();
    }
}
