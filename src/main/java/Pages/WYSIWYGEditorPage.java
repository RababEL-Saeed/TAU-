package Pages;

import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {


    WebDriver driver ;

    public WYSIWYGEditorPage (WebDriver driver )
    {
        this.driver = driver ;
    }

    //elements


    public void switchToIframe () // this function will switch the context from the page's DOM to the iframe DOM
                                  // now the only things we can access is inside the html tag of the iframe
    {
        driver.switchTo().frame("mce_0_ifr");
    }









}
