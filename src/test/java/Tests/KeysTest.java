package Tests;

import Pages.HomePage;
import Pages.KeyPressPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeysTest  extends BaseTest {

    @Test
    public void testBackspace ()
    {
        new HomePage(driver).clickOnKeyPressLink().sendAdditionalKeys("rabab " + Keys.BACK_SPACE);
        Assert.assertEquals(new KeyPressPage(driver).getResult(), "You entered: BACK_SPACE" );
    }

    @Test
    public void testBi ()
    {
        new HomePage(driver).clickOnKeyPressLink().sendAdditionalKeys(Keys.chord(Keys.ALT,"227"+"=3.14"));
        Assert.assertEquals(new KeyPressPage(driver).getResult(), "You entered: 4" );


    }
}
