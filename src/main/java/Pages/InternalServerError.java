package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternalServerError {

    WebDriver driver ;

    public InternalServerError (WebDriver driver )  
    {
        this.driver = driver ;
    }

    public static By errorMsg ()
    {
        return By.xpath("//h1[contains(text(),\"Internal Server Error\")]");
    }
}
