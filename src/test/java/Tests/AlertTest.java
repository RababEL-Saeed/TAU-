package Tests;

import Pages.AlertsPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTest  extends BaseTest {


@Test
    public void testAcceptAlert ()
{
    new HomePage(driver).clickOnAlertsPage().clickOnTheJsbButton().alert_toAccept();
   // Assert.assertTrue(driver.findElement(AlertsPage.resultMsg()).isDisplayed()); //another way to assert that alert is accepted
    Assert.assertEquals(driver.findElement(AlertsPage.resultMsg()).getText(),"You successfully clicked an alert");
}



@Test
    public void testAlertText ()
{
    String alertTEXT = new HomePage(driver).clickOnAlertsPage().clickOnTheConfirmButton().getAlertText();
    Assert.assertEquals(alertTEXT,"I am a JS Confirm");
}

@Test
    public void testDismissAlert ()
    {
        new HomePage(driver).clickOnAlertsPage().clickOnTheConfirmButton().alert_ToDismiss();
        Assert.assertEquals(driver.findElement(AlertsPage.resultMsg()).getText(),"You clicked: Cancel");
    }

    @Test
    public void testPrompt ()
    {
        new HomePage(driver).clickOnAlertsPage().clickOnJsPromptButton().sendKeysToPrompt("hello").promptToAccept();
        Assert.assertEquals(driver.findElement(AlertsPage.resultMsg()).getText(),"You entered: hello");
    }









}
