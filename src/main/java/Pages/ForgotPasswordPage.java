package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    WebDriver driver ;

    public  ForgotPasswordPage (WebDriver driver )
    {
        this.driver = driver ;
    }

    //elements

    public static By email_input ()
    {
        return By.id("email");
    }

    public static  By retrieve_pass_button ()
    {
        return By.xpath("//i[contains(text(),\"Retrieve password\")]");
    }


    public InternalServerError navToInternalServerError (String email)
    {
    driver.findElement(email_input()).sendKeys(email);
    driver.findElement(retrieve_pass_button()).click();
    return new InternalServerError(driver);

    }
}
