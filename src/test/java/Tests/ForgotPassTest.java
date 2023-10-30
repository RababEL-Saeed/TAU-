package Tests;

import Pages.HomePage;
import Pages.InternalServerError;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPassTest  extends  BaseTest{

    @Test
    public void testForgotPass ()
    {
        new HomePage(driver).clickForgotPass().navToInternalServerError("dd@gmail.com");
        Assert.assertTrue(driver.findElement(InternalServerError.errorMsg()).isDisplayed());
    }
}
