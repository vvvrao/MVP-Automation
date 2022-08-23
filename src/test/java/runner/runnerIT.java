package runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import static utility.SeleniumUtility.driver;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/resources",
		plugin = {"json:target/cucumber.json","html:target/cucumber-reports.html"},
		monochrome = true,
		glue ={"glue"})


public class runnerIT {


	@BeforeClass
	public static void setup(){

		System.out.println("before class");
	}

	@AfterClass
	public static void teardown() {
		driver.quit();
	}

}