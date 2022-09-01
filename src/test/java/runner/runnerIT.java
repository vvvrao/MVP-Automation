package runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


import org.junit.AfterClass;
import org.junit.runner.RunWith;


import static utility.SeleniumUtility.driver;

import java.util.function.Predicate;



@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/resources",
            plugin = {"junit:target/cucumber-reports/Cucumber.xml",
                    "html:target/cucumber.html","json:target/cucumber.json"},
        monochrome = true,
        glue ={"glue"})


public class runnerIT {

@AfterClass
    public static void teardown(){

    driver.quit();
}
	
}

