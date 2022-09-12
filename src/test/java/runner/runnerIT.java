package runner;




//import com.hpe.alm.octane.OctaneCucumber;

import io.cucumber.junit.Cucumber;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","junit:target/cucumber.xml"},
features ="src/test/java/resources",
        monochrome = true,
        glue ={"glue","hooks"})


public class runnerIT {


}



