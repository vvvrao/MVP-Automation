package runner;




import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","json:target/cucumber.json","html:target/cucumber.html","junit:target/cucumber.xml"},
features ="src/test/java/resources/",
        monochrome = true,
        glue ={"glue","hooks"},
tags= "@TID12001REV0.7.0 or @TID13001REV0.5.0 or @TID12002REV0.9.0")




public class runnerIT {


}



