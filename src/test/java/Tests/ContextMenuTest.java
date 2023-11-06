package Tests;

import Pages.ContextMenuPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    public void validateAlertText() {
        String alertText = new HomePage(driver).clickOnContextMenuLink().clickOnBlackBox().getAlertText();
        new ContextMenuPage(driver).alertToAccept();  // is it normal to use two objects in one test ?
        Assert.assertEquals(alertText, "You selected a context menu");
    }


}
