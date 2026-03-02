import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.junit.Test;//import this so the @test works
import static org.junit.Assert.assertEquals;


public class NewSeleniumTest{
    @Test
    public void smartetest(){
    
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until element is visible, then interact
        WebElement username = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))
        );
        username.sendKeys("standard_user");
    }   
}