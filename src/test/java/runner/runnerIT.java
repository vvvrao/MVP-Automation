package runner;






import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(plugin="com.hpe.alm.octane.OctaneGherkinFormatter:gherkin-results/OctaneGherkinResults.xml",
features ="src/test/java/resources",
        monochrome = true,
        glue ={"glue","hooks"})


public class runnerIT {


}



