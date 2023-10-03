package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;



public class ProductsPage extends  BasePage{

	    public ProductsPage (WebDriver driver) {
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
	    
	    
	    @FindBy(xpath = "//body/div[@id='jm']/main[1]/div[2]/div[3]/section[1]/div[1]/article[1]/footer[1]/form[1]")
	    public WebElement product1_add2cartbtn;
	    
	    @FindBy(xpath = "//body/div[@id='jm']/main[1]/div[2]/div[3]/section[1]/div[1]/article[1]/footer[1]/form[1]/button[2]")
	    public WebElement product1_increasequantitybtn;
	    
	  
	    
	    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/div[3]/section[1]/div[1]/article[1]/a[1]/div[2]/h3[1]")
	    public WebElement product1_title;

	    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/div[3]/section[1]/div[1]/article[2]/a[1]/div[2]/h3[1]")
	    public WebElement product2_title;
	    
	  
	    
	    


	    @FindBy(xpath = "//body/div[@id='jm']/main[1]/div[2]/div[3]/section[1]/div[1]/article[2]/footer[1]/form[1]")
	    public WebElement product2_add2cartbtn;
	    

	    
	    

	  




	    
	    
	    
	    public void bakeryinsupermarket() throws InterruptedException{

	        action.moveToElement(supermarket).build().perform();
	        Thread.sleep(3000);
	        bakery.click();
	        Thread.sleep(1000);
	    	closepopup_btn.click();

	      }
	    
	    public void Add2Cart() throws InterruptedException{

	        product1_add2cartbtn.click();
	        Thread.sleep(5000);

	        product1_increasequantitybtn.click();

	        Thread.sleep(3000);
	        product2_add2cartbtn.click();
	        Thread.sleep(1000);

	      }
	    
	   
	}

