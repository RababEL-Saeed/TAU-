package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    WebDriver driver ;
    public SecureAreaPage  (WebDriver driver)
    {
        this.driver = driver ;
    }
    //elements
    public static By statusAlert ()
    {
        return By.id("flash");
    }





}
