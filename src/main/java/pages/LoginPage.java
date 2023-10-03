package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends  BasePage{

	    public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	    
	    @FindBy(xpath = "//*[@id=\"jm\"]/header/section/div[2]/div[1]/label")
	    public WebElement account_btn;
	    
	    @FindBy(xpath = "//a[normalize-space()='Sign In']")
	    public WebElement signin_Btn;
	    
	    @FindBy(id = "input_identifierValue")
	    WebElement email_field;
	   
	    @FindBy(xpath = "//button[@type='submit']//span[@class='mdc-button__touch']")
	    WebElement continue_btn;
	    
	    @FindBy(name = "password")
	    WebElement password_field;
	    
	    @FindBy(xpath = "/html/body/div/div[4]/form/div/div[4]/div[2]/button")
	    WebElement login_btn;
	    
	    
	    @FindBy(xpath = "/html/body/div/div[4]/form/div/div[2]/div[5]/div/button/span[3]")
	    WebElement continue_btn3;
	    
	    @FindBy(xpath = "//*[@id=\"jm\"]/header/section/div[2]/div[1]/label")
	    public WebElement username_btn;
	    
	    @FindBy(xpath = "//*[@id=\"dpdw-login-box\"]/div/form/button")
	    public WebElement logut_btn;
	    
	    @FindBy(xpath = "//section[@class='cw']/button")
	    public WebElement closepopup_btn ;
	    
	    @FindBy(xpath = "//button[@id='confirmBtn']//span[@class='mdc-button__touch']")
	    WebElement cont_btn4;
	    
	    
	    @FindBy(id = "acceptTC")
	    WebElement terms_btn;
	    
	    public void Login(String email ,String Password) throws InterruptedException {
	        
	    	closepopup_btn.click();
	    	account_btn.click();
	        Thread.sleep(3000);

	        signin_Btn.click();
	        Thread.sleep(3000);
	        email_field.sendKeys(email);
	        continue_btn.click();
	        password_field.sendKeys(Password);
	        login_btn.click();
	        //continue_btn3.click();
	        //terms_btn.click();
	        //cont_btn4.click();
	        



	    }
	    
	    
	    
	    
	    
}