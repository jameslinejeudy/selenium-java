import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//make sure to import

public class HelloSeleniumTest {
    //add annotation (if error add maven dependency?)
    @Test
    public void firstTest()
    {
        //Selenium 4+ has built-in Selenium Manager, no need to set driver path manually

        //Next create a brand new driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");//
        driver.quit(); // kill driver after your done
    }
}
