package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    WebDriver driver ;

    public DynamicLoadingPage (WebDriver driver )
    {
        this.driver = driver ;
    }

    public static By example1Link ()
    {
        return By.xpath("//a[contains (text(),\"Example 1: Element on page that is hidden\")]");

    }


    public DynamicLoadingPageElements clickOnExample1 ()
    {
        driver.findElement(example1Link()).click();
        return new DynamicLoadingPageElements(driver);
    }
}
