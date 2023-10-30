package Tests.AlertsTests;

import Pages.HomePage;
import Tests.BaseTest;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {

@Test
    public void testfileupload ()
{
    new HomePage(driver).clickOnFileUpload().uploadFile("\"C:\\Users\\Rabab\\Desktop\\TAU last git\\TAU-\\src\\test\\java\\Tests\\AlertsTests\\automation.avif\"");
}
}
