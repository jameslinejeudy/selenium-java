package advanced.tips;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTest {
    private WebDriver driver;

    @Test
    public void checkPageLoad() {
        driver = getDriver();
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    private WebDriver getDriver() {
        //Selenium 4+ has built-in Selenium Manager, no need for WebDriverManager
        return new ChromeDriver();
    }
}
