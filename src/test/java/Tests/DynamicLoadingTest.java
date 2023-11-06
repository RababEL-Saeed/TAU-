package Tests;

import Pages.DynamicLoadingPageElements;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingTest extends BaseTest {

    @Test
    public void validateFinalText ()
    {
        new HomePage(driver).clickOnDynamicLoadingLink().clickOnExample1().clickOnStartButton();
        Assert.assertEquals(new DynamicLoadingPageElements(driver).getFinalText(),"Hello World!");
    }



}
