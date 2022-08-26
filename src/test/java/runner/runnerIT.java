package runner;




import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;


import static utility.SeleniumUtility.driver;

import java.util.function.Predicate;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/resources",
            plugin = {"html:target/cucumber.html","json:target/cucumber.json"},
        monochrome = true,
        glue ={"glue"})




public class runnerIT {

	private static final Logger logger = LogManager.getLogger(runnerIT.class); 
	
}

