package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.util.Properties;


public class SeleniumUtility {


    public static WebDriver driver;
    public static String webURL;

    public SeleniumUtility() {

        // Allocate global driver reference to local driver
        this.driver =  new ChromeDriver();
        // Initialize Ajax page initialisation
        PageFactory.initElements(driver, this);
    }

    public void launchApplication() throws Exception {

        webURL = readPropertyfile("test.properties", "web_URL");
        System.out.println(webURL);
//        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webURL);
    }

    /*
     * method to get property value from key-value pair and specify the relative
     * path for properties file
     */
    public synchronized String getPropertyFile(String PropertyFilePath, String key) throws NoSuchFieldException {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(PropertyFilePath));
            return properties.getProperty(key).trim();
        } catch (Exception e) {
            throw new NoSuchFieldException("Cannot find key: " + key + " in property file.");
        }
    }

    /*
     * We have only test.properties in the project so we can use this method to get
     * value from given key
     */
    public synchronized String readPropertyfile(String filename, String key) throws NoSuchFieldException {
        String filePath = System.getProperty("user.dir") + "/src/test/java/resources/properties/" + filename;
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(filePath));
            return properties.getProperty(key).trim();
        } catch (Exception e) {
            throw new NoSuchFieldException("Cannot find key: " + key + " in property file.");
        }
    }

}


