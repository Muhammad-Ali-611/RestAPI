package step.defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GetSingleEmployeeValidCall {
    String baseUrl = "";
    String resourcePath = "";
    int statusCode = 0;

    @Given("baseUrl and valid resourcePath")
    public void baseUrlAndResourcePath(){
        baseUrl = "http://info.venturepulse.org:8080/service-webapp";
        resourcePath = "/api/SingleEmployeeResources/5ff7b9652fc21306c59859d6";
    }

    @When("Make a valid GET Call")
    public void makeAValidGETCall(){
        statusCode = GeSingleEmployeeResourcesAPI.getSingleEmployeeWithValidRequest(baseUrl,resourcePath);
    }

    @Then("I should receive status code 200")
    public void IShouldReceiveStatusCode200(){
        Assert.assertEquals(statusCode,200);
    }
}
