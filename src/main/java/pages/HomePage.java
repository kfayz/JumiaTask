package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;



public class HomePage extends  BasePage{

	    public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		action = new Actions(driver);
	}

	    
	    @FindBy(xpath = "//label[normalize-space()='Account']")
	    public WebElement account_btn;
	    
	    @FindBy(xpath = "//section[@class='cw']/button")
	    public WebElement closepopup_btn ;

	    @FindBy(xpath = "//a[normalize-space()='Sign In']")
	     public WebElement signin_btn;
	    
	    @FindBy(xpath = "//body/div[@id='jm']/main[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	    WebElement supermarket;
	    
	    @FindBy(xpath = "//*[@id=\"jm\"]/main/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/a[7]")
	    WebElement bakery;
	    
	    

	  



	    public void RegisterationPage() {
	        
	    	closepopup_btn.click();
	    	account_btn.click();
	        signin_btn.click();
	    }
	    
	    
	    
	    public void bakeryinsupermarket() throws InterruptedException{

	        action.moveToElement(supermarket).build().perform();
	        Thread.sleep(3000);
	        bakery.click();
	        Thread.sleep(1000);

	      }
	   
	}














































