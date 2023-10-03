package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;



public class CartPage extends  BasePage{

	    public CartPage (WebDriver driver) {
		super(driver);
		this.driver = driver;
		action = new Actions(driver);
	}

	    
	    @FindBy(xpath = "//label[normalize-space()='Account']")
	    public WebElement account_btn;
	    
	    @FindBy(xpath = "//section[@class='cw']/button")
	    public WebElement closepopup_btn ;


	    @FindBy(xpath = "//*[@id=\"jm\"]/header/section/div[2]/a")
	    WebElement cart_btn;



	    @FindBy(xpath = "//*[@id=\"jm\"]/main/div/div[1]/article/article[1]/footer/button")
	    public WebElement removeproduct1_btn;
	    
	    @FindBy(xpath = "//*[@id=\"jm\"]/main/div/div[1]/article/article[2]/footer/button")
	    public WebElement removeproduct2_btn;
	    
	    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/article[1]/article[1]/a[1]/div[2]/h3[1]")
	    public WebElement cartproduct1_title;
	    
	    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/article[1]/article[2]/a[1]/div[2]/h3[1]")
	    public WebElement cartproduct2_title;
	    
	    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/article[1]/article[1]/a[1]/div[3]/div[1]")
	    public WebElement cartproduct1_price;
	    
	    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/article[1]/article[2]/a[1]/div[3]/div[1]")
	    public WebElement cartproduct2_price;
	    
	    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/article[1]/div[1]/p[2]")
	    public WebElement subtotal;
	    
	    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/article[1]/article[1]/footer[1]/form[1]/span[1]")
	    public WebElement cartproduct1_qty ;
	    
	    
	    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/article[1]/article[2]/footer[1]/form[1]/span[1]")
	    public WebElement cartproduct2_qty ;
	    
	    
	    
	    
	    
	    
	    
	    

	    

	    


	    
	    

	  




	    
	    
	    
	    public void cart() throws InterruptedException{
	    	
	    	
	    	cart_btn.click();

	

	      }
	    

	    
	   
	}
