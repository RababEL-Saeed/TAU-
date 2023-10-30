package Tests;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

public WebDriver driver ;
@BeforeMethod
    public void init ()
    {
        driver = new ChromeDriver();
        new LoginPage(driver).openWebsite();

    }
//
//@AfterMethod
//    public void flush ()
//    {
//        driver.quit();
//    }

}
