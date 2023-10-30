package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class LoginPage {
    WebDriver driver ;

    public LoginPage (WebDriver driver )
    {
        this.driver = driver ;
    }

    //elements

    public final String URL = "https://the-internet.herokuapp.com/";

    public static By userNameFiled ()
    {
        return By.id("username");
    }

    public static By passField ()
    {
        return By.id("password");
    }

    public static By loginButton ()
    {
        return By.className("radius");
    }

    public void openWebsite ()
    {
        driver.navigate().to(URL);
    }

    public SecureAreaPage performLogin (String username , String pass)
    {
        driver.findElement(userNameFiled()).sendKeys(username);
        driver.findElement(passField()).sendKeys(pass);
        driver.findElement(loginButton()).click();
        return new SecureAreaPage(driver);
    }









}
