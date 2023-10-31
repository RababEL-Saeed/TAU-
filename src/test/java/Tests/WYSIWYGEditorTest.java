package Tests;

import Pages.HomePage;
import Pages.WYSIWYGEditorPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WYSIWYGEditorTest extends BaseTest {


    @Test
    public void testTextArea ()
    {
        new HomePage(driver).clickonWYSIWYGEditor().clearTextArea()
                .fillTextArea("hello").clickDecreaseButton().fillTextArea("world");
        Assert.assertEquals(new WYSIWYGEditorPage(driver).getTextFromTextArea(),"helloworld");

    }


}
