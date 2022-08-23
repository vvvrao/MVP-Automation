package runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;


import static utility.SeleniumUtility.driver;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/resources",
	plugin = {"json:target/cucumber.json"},
        monochrome = true,
        glue ={"glue"})


public class runnerIT {


//    @BeforeClass
//    @AfterClass
//    public static void teardown() {
//        driver.quit();
//    }

}
