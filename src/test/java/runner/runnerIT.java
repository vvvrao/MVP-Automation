package runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


import org.junit.AfterClass;
import org.junit.runner.RunWith;


import static utility.SeleniumUtility.driver;

import java.util.function.Predicate;

import com.hpe.alm.octane.OctaneCucumber;

@RunWith(OctaneCucumber.class)
@CucumberOptions(features ="src/test/java/resources",
            plugin = {"html:target/cucumber.html","json:target/cucumber.json"},
        monochrome = true,
        glue ={"glue"})


public class runnerIT {

@AfterClass
    public static void teardown(){

    driver.quit();
}
	
}

