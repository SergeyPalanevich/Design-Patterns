package patterns.singleton.test;

import patterns.singleton.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SiteTest {

    @Test
    public void testGitHub() {
        WebDriver driver = WebDriverSingleton.getInstance();
        driver.navigate().to("http://github.com/");
    }


    @Test
    public void testStackOverflow() {
        WebDriver driver = WebDriverSingleton.getInstance();
        driver.navigate().to("http://stackoverflow.com/");
    }

    @AfterClass
    public void terrDown() {
        WebDriverSingleton.closeDriver();
    }
}
