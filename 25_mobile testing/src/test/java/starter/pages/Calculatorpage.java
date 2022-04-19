package starter.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class Calculatorpage extends BasePageObject {
    private By one(){
        return MobileBy.AccessibilityId("1");
    }
    private By two(){
        return MobileBy.AccessibilityId("2");
    }
    private By three(){
        return MobileBy.AccessibilityId("3");
    }
    private By Four(){
        return MobileBy.AccessibilityId("4");
    }
    private By five(){
        return MobileBy.AccessibilityId("5");
    }
    private By six(){
        return MobileBy.AccessibilityId("6");
    }
    private By seven(){
        return MobileBy.AccessibilityId("7");
    }
    private By eight(){
        return MobileBy.AccessibilityId("8");
    }
    private By nine(){
        return MobileBy.AccessibilityId("9");
    }
    private By zero(){
        return MobileBy.AccessibilityId("0");
    }
    private By doublezero(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"00\"]");
    }
    private By triplezero(){
        return  MobileBy.xpath("//android.view.View[@content-desc=\"000\"]");
    }

    private By minussign(){
        return MobileBy.xpath("//android.view.View[@content-desc=\" - \"]");
    }

    private By equalsign(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"=\"]");
    }

    private By Tittle(){
        return MobileBy.AccessibilityId("calculator");
    }

    @Step
    public boolean isOncalculatorpage(){
        return waitUntilVisible(Tittle()).isDisplayed();
    }
    @Step
    public void tapnumber(Integer number){
        System.out.println(number);
        switch (number){
            case 1:
                onClick(one());
                break;
            case 2:
                onClick(two());
                break;
            case 3:
                onClick(three());
                break;
            case 4:
                onClick(Four());
                break;
            case 5:
                onClick(five());
                break;
            case 6:
                onClick(six());
                break;
            case 7:
                onClick(seven());
                break;
            case 8:
                onClick(eight());
                break;
            case 9:
                onClick(nine());
                break;
            case 0:
                onClick(zero());
                break;


        }
    }

    @Step
    public void tapsign(String sign){
        System.out.println(sign);
        switch (sign){
            case "minus":
                onClick(minussign());
                break;
            case "equal":
                onClick(equalsign());
                break;
        }
    }
}
