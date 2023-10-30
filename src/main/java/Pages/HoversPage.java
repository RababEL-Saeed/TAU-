package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    WebDriver driver ;

    public HoversPage (WebDriver driver )
    {
        this.driver = driver ;
    }

//    public static By firstImgLocator()
//    {
//        return By.xpath("(//img[@alt=\"User Avatar\"])[1] ");
//    }
//    public static By secondImgLocator()
//    {
//        return By.xpath("(//img[@alt=\"User Avatar\"])[2] ");
//    }
//
//    public static By thirdImgLocator()
//    {
//        return By.xpath("(//img[@alt=\"User Avatar\"])[3] ");
//    }

    public static By firstImgText()
    {
        return By.xpath("//h5[contains(.,\"name: user1\")]");
    }

    public static By firstImgLink()
    {
        return By.xpath("(//a[contains(.,\"View profile\")])[1]");
    }

    public void hoverOverImage () // the int index here just to know which img you want to hover over
                                            //because we have three imgs in the page
    {
        Actions actions = new Actions( driver );
        actions.moveToElement(driver.findElement(By.xpath("(//img[@alt=\"User Avatar\"])[1]"))).perform();
    }



}
