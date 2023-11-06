package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    WebDriver driver ;

    public NestedFramesPage (WebDriver driver )
    {
        this.driver = driver ;
    }

    public  static By frameAreaLeft ()
    {
        return By.xpath("//body[contains(.,\"LEFT\")]");
    }

    public  static By frameAreaBottom ()
    {
        return By.xpath("//body[contains(.,\"BOTTOM\")]");
    }

    public NestedFramesPage leftFrame ()
    {
        driver.switchTo().frame("frame-left");
        driver.findElement(frameAreaLeft()).getText();
        driver.switchTo().parentFrame();
        return this ;
    }

    public void bottomFrame ()
    {
        driver.switchTo().frame("frame-bottom");
        driver.findElement(frameAreaBottom()).getText();
        driver.switchTo().parentFrame();
    }




}
