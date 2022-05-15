package starter.pages;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class Loginpages extends BasePageObject {
    private By homepage(){
        return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");

    }
    private By loginpage(){
        return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");

    }

    private By emailfield() {
        return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");

    }

    private By passwordfield(){
        return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");

    }

    private By loginbutton(){
        return By.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    private By loginicon(){
        return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

    }

    @Step
    public boolean onHomepage(){
        return waitUntilVisible(homepage()).isDisplayed();
    }
    @Step
    public boolean onLoginpage(){
        return waitUntilVisible( loginpage()).isDisplayed();
    }

    @Step
    public void inputEmail(){
       onType(emailfield(), email);
    }
    @Step
    public void inputPassword(){
       onType(passwordfield(), password);
    }
    @Step
    public void clickLoginIcon(){
        onClick(loginicon());
    }
    @Step
    public void clickloginButton() {
      onClick(loginbutton());
    }

}



