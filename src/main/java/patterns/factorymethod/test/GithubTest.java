package patterns.factorymethod.test;

import patterns.factorymethod.FirefoxDriverCreator;
import patterns.factorymethod.WebDriverCreator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GithubTest {

    @Test
    public void testGitHub(){
        WebDriverCreator creator = new FirefoxDriverCreator();
        WebDriver driver = creator.setupWebDriver();
        driver.navigate().to("http://github.com/");
    }
}
