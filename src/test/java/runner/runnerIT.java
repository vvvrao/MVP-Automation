package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/",
        // dryRun =true,
        plugin = {
                 },
        glue = "glue")

public class runnerIT extends AbstractTestNGCucumberTests {

    /**
     * This method indicates if you want to run your scenarios in parallel or not
     */
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
