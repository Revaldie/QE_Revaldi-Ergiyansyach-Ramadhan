package starter.product;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get {
    protected static String url = "https://be-qa.alta.id/api";

    @Step("admin on postman app")
    public void adminonPostmanapp(){

    }
    @Step("admin added url")
    public String adminaddedurl(){
        return url + "/products";
    }
    @Step("input GET as a method")
    public void inputGetasamethoded(){
        SerenityRest.given().get(adminaddedurl());
    }
    @Step("admin click send")
    public void adminclicksend(){

    }
    @Step("response shows = {int} OK")
    public void responseshowOK(){
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("Response shows all products")
    public void responseshowallproducts(){
        Response response = SerenityRest.lastResponse();

        String name = response.getBody().jsonPath().get("data.Name[0]");
        Assert.assertEquals(name, "Teleskop");

        int ID = response.getBody().jsonPath().get("data.ID[0]");
        Assert.assertEquals(ID, 187);
    }
}
