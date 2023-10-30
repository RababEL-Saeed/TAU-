package Pages;

import Pages.AlertsPackage.AlertsPage;
import Pages.AlertsPackage.FileUploadPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    WebDriver driver ;

    public HomePage (WebDriver driver )

    {
        this.driver = driver ;
    }

//elements
//   // public static By formAuthentcationLink ()
//    {
//        return By.xpath("//a[contains(.,\"Form Authentication\")]");
//    }
//actions

    public  void clickLinke (String Xpath )
    {
        driver.findElement(By.xpath(Xpath)).click();
    }
    public LoginPage clickFormAuthentication ()
    {
//        driver.findElement(formAuthentcationLink()).click();
        clickLinke ("//a[contains(.,\"Form Authentication\")]");
        return new LoginPage(driver);
    }

    public DropDownPage clickdropdown ()
    {
        clickLinke("//a[contains (.,\"Dropdown\")]");
        return new DropDownPage(driver);
    }



    public  ForgotPasswordPage clickForgotPass  ()
    {
        clickLinke("//a[contains(.,\"Forgot Password\")]");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickOnHoverLink ()
    {
        clickLinke("//a[contains(text(),\"Hovers\")]");
        return new HoversPage(driver);
    }

    public KeyPressPage clickOnKeyPressLink ()
    {
        clickLinke("//a[contains(.,\"Key Presses\")]");
        return new KeyPressPage(driver);
    }

    public HorizontalSlider clickOnHorizontalSliderLink ()
    {
        clickLinke("//a[contains(.,\"Horizontal Slider\")]");
        return new HorizontalSlider(driver);
    }

    public AlertsPage clickOnAlertsPage ()
    {
        clickLinke("//a[contains(.,\"JavaScript Alerts\")]");
        return new AlertsPage(driver);
    }


    public WYSIWYGEditorPage clickonWYSIWYGEditor ()
    {
        clickLinke("//a[contains( .,\"WYSIWYG Editor\")]");
        return new WYSIWYGEditorPage(driver);
    }
    public FileUploadPage clickOnFileUpload ()
    {
        clickLinke ("//a[contains(text(),\"File Upload\")]");
        return new FileUploadPage(driver);
    }





}
