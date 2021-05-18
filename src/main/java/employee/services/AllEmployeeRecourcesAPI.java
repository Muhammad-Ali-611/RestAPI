package employee.services;

import org.testng.Assert;

import javax.xml.ws.Response;

public class AllEmployeeResourcesAPI {

    String baseUrl = "http://info.venturepulse.org:8080/service-webapp";

    public void getAllEmployeeResourcesAPI(){
        Response response = given().when().get(baseUrl+"/api/AllEmployeeResources").then().statusCode(200).extract().response();
        int statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();
        response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, statusLine);
        Assert.assertEquals(statusCode, 200);
    }
}
