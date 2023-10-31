package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {


    WebDriver driver ;

    public WYSIWYGEditorPage (WebDriver driver )
    {
        this.driver = driver ;
    }

    //elements

    public static By textArea ()
    {
        return By.id("tinymce");
    }

    public static By decreaseButton ()
    {
        return By.xpath("//button[@title=\"Decrease indent\"]");
    }

    //actions

    public void switchToIframe () // this function will switch the context from the page's DOM to the iframe DOM
                                  // now the only things we can access is inside the html tag of the iframe
    {
        driver.switchTo().frame("mce_0_ifr");
    }

    public WYSIWYGEditorPage exitFromIframe ()
    {
        driver.switchTo().parentFrame();
        return this ;
    }


    public WYSIWYGEditorPage clearTextArea ()
    {
        switchToIframe();
        driver.findElement(textArea()).clear();
        exitFromIframe();
        return this ;
    }

    public WYSIWYGEditorPage fillTextArea (String input)
    {
        switchToIframe();
        driver.findElement(textArea()).sendKeys(input);
        exitFromIframe();
        return this ;
    }


    public WYSIWYGEditorPage clickDecreaseButton ()
    {
        driver.findElement(decreaseButton()).click();
        return this ;
    }


    public String getTextFromTextArea ()
    {
        switchToIframe();
        String text = driver.findElement(textArea()).getText();
        exitFromIframe();
        return text ;
    }











}
