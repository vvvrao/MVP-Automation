package runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.Pickle;
import io.cucumber.testng.TestNGCucumberRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;

import static utility.SeleniumUtility.driver;

import java.util.function.Predicate;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/resources",
            plugin = {"html:target/cucumber.html","json:target/cucumber.json"},
        monochrome = true,
        glue ={"glue"})


public class runnerIT {

	private static final Predicate<Pickle> isSequential = pickle -> pickle.getTags().contains("@sequential");

	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
}

