package step.defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GetSingleEmployeeResoucesAPI {

    String baseUrl = "";
    String resourcePath = "";
    int statusCode = 0;

    @Given("baseUrl and InValid resourcePath")
    public void baseurl_and_InValid_resourcePath() {
        baseUrl = "http://info.venturepulse.org:8080/service-webapp";
        resourcePath = "/api/SingleEmployeeResourcesBadRequest/5ff7b9652fc21306c59859d6";
    }

    @When("Make a InValid GET Call")
    public void make_a_InValid_GET_Call() {
        statusCode = GetSingleEmployeeResoucesAPI.getSingleEmployeeInvalidRequest(baseUrl,resourcePath);
    }



    @Then("I should receive status code 404")
    public void i_should_receive_status_code() {
        Assert.assertEquals(statusCode,404);
    }
}
