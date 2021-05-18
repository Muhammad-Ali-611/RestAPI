package testapi.GetASingleEmployeeInvalidCall;

import gherkin.ast.Feature;
import gherkin.ast.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;

public class feature {
    Feature: Rest API Test InValid
    Scenario: Get Single Employee Info with InValid Get Request

    Given baseUrl and InValid resourcePath
    When Make a InValid GET Call
    Then I should receive status code 404
            © 2021 GitHub, Inc.
}
