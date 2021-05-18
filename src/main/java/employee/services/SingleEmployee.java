package employee.services;

import org.junit.Assert;

import javax.xml.ws.Response;

public class SingleEmployee {


    public void getAllEmployeeRecourcesAPIValidCall() {
        Response response = given().when().get(baseUrl + "+/AllEmployeeResources").then().statusCode(200);
        int statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();
        response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, statusLine);
        Assert.assertEquals(statusCode, 200);


    }

    public void getAllEmployeeRecourcesAPIInValidCall() {
        Response response = given().when().get(baseUrl + "+/AllEmployeeResources").then().statusCode(200);
        int statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();
        response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, statusLine);
        Assert.assertEquals(statusCode, 200);

    }
}