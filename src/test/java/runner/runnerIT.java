package runner;


import com.hpe.alm.octane.OctaneCucumber;

import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;




        @RunWith(OctaneCucumber.class)
        @CucumberOptions(features ="src/test/java/resources",
        plugin = {"pretty","junit:target/cucumber.xml",
        "html:target/cucumber.html","json:target/cucumber.json",
                "com.hpe.alm.octane.OctaneGherkinFormatter:target/OctaneGherkinResults.xml"},
        monochrome = true,
        glue ={"glue","hooks"},
        publish=true)


public class runnerIT {


}



