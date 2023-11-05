package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPageElements {
    WebDriver driver ;
    public DynamicLoadingPageElements (WebDriver driver )
    {
        this.driver = driver ;
    }

    public By startButton ()
    {
        return By.xpath("//button[contains(.,'Start')]");
    }

    public By loadingIndicator ()
    {
        return By.id("loading");
    }

    public By finalText ()
    {
        return By.xpath("//H4[contains(.,'Hello World!')]");
    }


    public void clickOnStartButton () {
        driver.findElement(startButton()).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //it will wait up until of this time
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator())));
    }

    public String getFinalText ()
    {
        return driver.findElement(finalText()).getText();
    }

}
