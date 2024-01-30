package devaltetxtAutomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class altTextAutomation {

    WebDriver driver;

  @BeforeMethod
public void setup() {
    WebDriverManager.chromedriver().setup();z

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    options.setBinary("/usr/bin/google-chrome"); // Replace with the actual path
    driver = new ChromeDriver(options);
    
}

    @Test
    public void myFunction() {
        try {
            driver.get("http://www.ebay.com");
            Thread.sleep(3000);
            System.out.println("Test passed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
