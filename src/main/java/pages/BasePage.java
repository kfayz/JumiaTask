package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;
    
    public Actions action ;

    public BasePage(WebDriver driver)

    {
        PageFactory.initElements(driver, this);
    }

}