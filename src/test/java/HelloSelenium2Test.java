import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Selenium 4+ has built-in Selenium Manager, no need for WebDriverManager
public class HelloSelenium2Test {
    @Test
    public void smarterTest()
    {                           //can be safari
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.quit();
    }
}
