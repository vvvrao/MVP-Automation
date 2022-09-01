package runner;



import com.hpe.alm.octane.OctaneCucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



import org.junit.runner.RunWith;


import static utility.SeleniumUtility.driver;

import java.util.function.Predicate;

@RunWith(OctaneCucumber.class)
@CucumberOptions(features ="src/test/java/resources",
            plugin = {"html:target/cucumber.html","json:target/cucumber.json"},
        monochrome = true,
        glue ={"glue"})


public class runnerIT {


	
}

