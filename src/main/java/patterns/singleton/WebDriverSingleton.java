package patterns.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSingleton {
    private static WebDriver driver;

    private WebDriverSingleton(){}

    public static WebDriver getInstance(){
        if(driver == null) {
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}
