package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

@Test
    public void verifyValidLogin ()
{
    new HomePage(driver).clickFormAuthentication();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    new LoginPage(driver).performLogin("tomsmith", "SuperSecretPassword!");
    Assert.assertTrue(driver.findElement(SecureAreaPage.statusAlert()).isDisplayed());

}

}
