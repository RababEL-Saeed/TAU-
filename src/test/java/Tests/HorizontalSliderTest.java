package Tests;

import Pages.HomePage;
import Pages.HorizontalSlider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTest  extends BaseTest {

    @Test
    public void testSlider ()
    {
        new HomePage(driver).clickOnHorizontalSliderLink().sentKeysToSlider();
        Assert.assertEquals(new HorizontalSlider(driver).resultText(),"4");
    }
}
 