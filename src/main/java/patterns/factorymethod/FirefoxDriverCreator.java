package patterns.factorymethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

public class FirefoxDriverCreator extends WebDriverCreator{

    @Override
    public WebDriver setupWebDriver() {
        FirefoxBinary binary = new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox46\\firefox.exe"));
        FirefoxProfile profile = new FirefoxProfile();
        WebDriver driver = new FirefoxDriver(binary, profile);
        return driver;
    }
}
