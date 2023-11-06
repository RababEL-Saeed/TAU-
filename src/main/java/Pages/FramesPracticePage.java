package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPracticePage {
    WebDriver driver ;

    public FramesPracticePage (WebDriver driver )
    {
        this.driver = driver ;
    }

    public By nestedFramesLink ()
    {
        return By.xpath("//a[contains(.,\"Nested Frames\")]");
    }

    public NestedFramesPage clickOnNestedFramesLink ()
    {
        driver.findElement(nestedFramesLink()).click();
        return new NestedFramesPage(driver);
    }
}
