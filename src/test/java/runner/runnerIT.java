package runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import com.hpe.alm.octane.OctaneCucumber;

@RunWith(OctaneCucumber.class)
@CucumberOptions(features ="src/test/java/resources",
        plugin = {"pretty","json:target/cucumber.json","html:target/cucumber.html"},
        monochrome = true,
        glue ={"glue","hooks"})




public class runnerIT {


}



