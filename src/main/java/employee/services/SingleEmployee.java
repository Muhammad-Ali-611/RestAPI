package employee.services;

import org.testng.Assert;

import javax.xml.ws.Response;

public class SingleEmployee {

    String baseUrl = "http://info.venturepulse.org:8080/service-webapp";

    public void getSingleEmployeeResourcesValidCall(){
        Response response = given().when().get(baseUrl+"/api/SingleEmployeeResources/59ac2f0cc09dea2660451c9a").then().statusCode(200).extract().response();
        int statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();
        response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, statusLine);
        Assert.assertEquals(statusCode,200);
    }

    public void getSingleEmployeeResourcesInValidCall(){
        Response response = given().when().get(baseUrl+"/api/SingleEmployeeResources-demo/59ac2f0cc09dea2660451c9a");
        int statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();
        response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, statusLine);
        Assert.assertEquals(statusCode,404);

}