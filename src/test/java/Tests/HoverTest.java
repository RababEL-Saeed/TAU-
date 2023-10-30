package Tests;

import Pages.HomePage;
import Pages.HoversPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest  extends BaseTest {




    @Test
    public void validateHover()
    {
        new HomePage(driver).clickOnHoverLink().hoverOverImage();
        Assert.assertTrue(driver.findElement(HoversPage.firstImgText()).isDisplayed());
        Assert.assertTrue(driver.findElement(HoversPage.firstImgLink()).isDisplayed());

    }
}
