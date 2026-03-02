import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class SeleniumTest {

    // Navigate to this URL using another browser https://the-internet.herokuapp.com/
    // Navigate to this URL https://example.cypress.io/
    // Navigate to https://react-shopping-cart-67954.firebaseapp.com/
    // Selenium 4+ has built-in Selenium Manager, no need for WebDriverManager

    @Test
    public void safariTest() {
        WebDriver driver = new SafariDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.quit();
    }
    @Test
    public void cypressTest() throws InterruptedException {
        WebDriver driver = new SafariDriver();
        driver.get("https://example.cypress.io/");
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void shoppingCartTest() throws InterruptedException {
        WebDriver driver = new SafariDriver();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        Thread.sleep(3000);
        driver.quit();
    }
}
