package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
    WebDriver driver ;

    public  KeyPressPage (WebDriver driver)
    {
        this.driver = driver ;
    }

    public static By inputKey ()
    {
        return By.id("target");
    }

    public static By result ()
    {
        return By.id("result");
    }

    public String getResult()
    {
       return driver.findElement(result()).getText();
    }


    public void sendAdditionalKeys (String input)
    {
        driver.findElement(inputKey()).sendKeys(input);
    }
}
