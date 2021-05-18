package testapi;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "step/definitions",
        plugin = {"pretty","html:test-output"})
public class RunCucumberTest {
}
