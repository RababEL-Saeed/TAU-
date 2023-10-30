package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    WebDriver driver ;
    public AlertsPage (WebDriver driver )
    {
        this.driver = driver ;
    }

    public static By jsAlertButton ()
    {
        return By.xpath("//button[contains(text() ,\"Click for JS Alert\")]");
    }

    public static By resultMsg ()
    {
        return By.id("result");
    }

    public static By confirmAlertButton ()
    {
        return By.xpath("//button [text()=\"Click for JS Confirm\"]");
    }

    public static By jsPromptButton ()
    {
        return By.xpath("//button [contains (text(),\"Click for JS Prompt\")]");
    }



    public AlertsPage clickOnTheJsbButton ()
    {
        driver.findElement(jsAlertButton()).click();
        return this ;
    }

    public void alert_toAccept ()
    {
        driver.switchTo().alert().accept();
    }


    public AlertsPage clickOnTheConfirmButton ()
    {
        driver.findElement(confirmAlertButton()).click();
        return  this ;
    }

    public String getAlertText()
    {
        return driver.switchTo().alert().getText();
    }

    public void alert_ToDismiss ()
    {
        driver.switchTo().alert().dismiss();
    }

    public AlertsPage clickOnJsPromptButton ()
    {
        driver.findElement(jsPromptButton()).click();
        return this ;

    }

    public AlertsPage sendKeysToPrompt (String input )
    {
        driver.switchTo().alert().sendKeys( input );
        return this ;


    }

    public void promptToAccept ()
    {
        driver.switchTo().alert().accept();


    }


}
