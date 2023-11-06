package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ContextMenuPage {

    WebDriver driver ;

    public ContextMenuPage (WebDriver driver )
    {
        this.driver = driver ;
    }


    public static By blackBox ()
    {
        return By.id("hot-spot");
    }

    public ContextMenuPage clickOnBlackBox ()
    {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(blackBox())).perform();
        return this ;
    }

    public ContextMenuPage alertToAccept ()
    {
        driver.switchTo().alert().accept();
        return this ;
    }

    public String getAlertText ()
    {
        return driver.switchTo().alert().getText();
    }




}
