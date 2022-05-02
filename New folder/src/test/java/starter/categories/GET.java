package starter.categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET {
    protected static String url = "https://be-qa.alta.id/api";

    @Step("admin on postman app")
    public void AdminonPostmanApp(){
    }
    @Step("admin add url")
    public String adminAddUrl(){

        return url + "/cat";
    }

    @Step("input GET as a method")
    public void inputGETAsAMethod(){
        SerenityRest.given().get(adminAddUrl());

    }

    @Step("admin click send")
    public void adminClickSend() {
    }

    @Step("response shows = {int} Not Found")
    public void responseShowsNotFound(int arg0) {
        given().when().get(url).then().assertThat().statusCode(404);
    }

    @Step("I don't receive all categories")
    public void iDonTReceiveAllCategories() {
    }
}
