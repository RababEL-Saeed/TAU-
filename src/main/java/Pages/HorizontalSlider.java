package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {
    WebDriver driver ;

    public HorizontalSlider (WebDriver driver)
    {
        this.driver = driver ;
    }

    public static By slider ()
    {
        return By.xpath("//input[@type=\"range\"]");
    }


    public static By resultOfSlider ()
    {
        return By.id("range");
    }

    public String resultText ()
    {
        return driver.findElement(resultOfSlider()).getText();
    }

    public void sentKeysToSlider ()
    {
        driver.findElement(slider()).sendKeys(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT);
    }
}
