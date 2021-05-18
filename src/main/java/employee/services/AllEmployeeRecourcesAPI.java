package employee.services;

import org.junit.Assert;

import javax.xml.ws.Response;

public class AllEmployeeRecourcesAPI {

    String base = "";

    public void getAllEmployeeRecourcesAPI(){
        Response response = given().when().get(baseUrl+"+/AllEmployeeResources").then().statusCode(200);
        int statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();
        response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, statusLine);
        Assert.assertEquals(statusCode, 200);
    }
}
