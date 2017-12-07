package patterns.factorymethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

public class ChromeDriverCreator extends WebDriverCreator {

    private static final String PATH_TO_DRIVER = "D:\\drivers\\chromedriver.exe";

    @Override
    public WebDriver setupWebDriver() {
        ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable( new File(PATH_TO_DRIVER)).build();

        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver = new ChromeDriver(service);
        return driver;
    }
}
