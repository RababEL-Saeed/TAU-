package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {

    WebDriver driver ;

    public DropDownPage (WebDriver driver)
    {
        this.driver = driver ;
    }

    //elements
public static By dropDownMenu ()
{
    return By.id("dropdown");
}

public void selectOptionFromTheMenu ( String option )

{
    //Select dropdownelement = new Select(driver.findElement(dropDownMenu()));
   // dropdownelement.selectByVisibleText( option );
    findDropdownElement().selectByVisibleText(option); // this line is instead of the above  two other lines
                                                       // i do not need to create variable for the option to save it in
                                                      //as i am using it only one time
}

public List<String> getSelectedOptions ()
{
    List <WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
    return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
}

private Select findDropdownElement ()  // this function is instead of creating
                                       //object of the select each time i need to use it
{
    return new Select(driver.findElement(dropDownMenu()));
}

    
}
