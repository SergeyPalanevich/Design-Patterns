package patterns.decorator.test;

import patterns.decorator.Decarator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CustomDriverTest {
    @Test
    public void testSingIn(){
        WebDriver driver = new FirefoxDriver();
        WebDriver custom = new Decarator(driver);
        custom.navigate().to("http://github.com");
        custom.findElement(By.xpath("//a[text()='Sign in']")).click();
    }
}
