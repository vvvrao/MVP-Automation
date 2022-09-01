package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;




        @RunWith(Cucumber.class)
        @CucumberOptions(features ="src/test/java/resources",
        plugin = {"pretty","junit:target/cucumber.xml",
        "html:target/cucumber.html","json:target/cucumber.json"
               },
        monochrome = true,
        glue ={"glue","hooks"},
        publish=true)


public class runnerIT {


}



