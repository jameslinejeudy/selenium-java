package atda;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class AcceptanceTestDrivenAutomationTest {
    WebDriver driver;
    @Before
    public void setup()
    {
        driver = getDriver();
    }
    @After
    public void cleanup()
    {
        driver.quit();
    }
    @Test
    public void shouldOpen()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());
    }

    @Test
    public void shouldLogin()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());

        loginPage.login("standard_user", "secret_sauce");
        assertTrue(new ProductsPage(driver).isLoaded());
    }

    private WebDriver getDriver() {
        //Selenium 4+ has built-in Selenium Manager, no need for WebDriverManager
        return new ChromeDriver();
    }
}
