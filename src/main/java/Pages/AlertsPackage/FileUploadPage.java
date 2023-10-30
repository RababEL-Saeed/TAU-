package Pages.AlertsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    WebDriver driver ;

    public FileUploadPage (WebDriver driver )
    {
        this.driver = driver ;
    }

    //elements
     public static By chooseFileButton ()
     {
         return By.id("file-upload");
     }

    public static By uploadFileButton ()
    {
        return By.id("file-submit");
    }

    //actions

    public void uploadFile ( String fileUrl )
    {
        driver.findElement(chooseFileButton()).sendKeys(fileUrl);
        driver.findElement(uploadFileButton()).submit();
        if (driver.getPageSource().contains("File Uploaded!"))
        {
            System.out.println("file uploaded successfully ");
        }
    }





}
