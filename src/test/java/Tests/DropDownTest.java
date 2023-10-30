package Tests;

import Pages.DropDownPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest  extends BaseTest {


@Test
    public void testSelectOption ()
{

    new HomePage(driver).clickdropdown().selectOptionFromTheMenu("Option 1");
    var selectedoptions = new DropDownPage(driver).getSelectedOptions();
    Assert.assertEquals(selectedoptions.size(), 1, " incorrect y rabab ");
    Assert.assertTrue(selectedoptions.contains("Option 1"));
}
}
