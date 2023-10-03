package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class RegisterationPage extends BasePage {

    public RegisterationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(id = "input_identifierValue")
    WebElement email_phone;

    @FindBy(xpath = "//button[@type='submit']//span[@class='mdc-button__touch']")
    WebElement continue_btn;

    @FindBy(name = "password")
    WebElement password_field;

    @FindBy(xpath = "/html/body/div/div[4]/form/div/div[1]/div[4]/label/input")
    WebElement confirm_pass_field;

    @FindBy(xpath = "//*[@id=\"card_password\"]/div[5]/div/button")
    WebElement cont_btn2;

    @FindBy(id = "input_first_name")
    WebElement firstname_field;
    @FindBy(id = "input_last_name")
    WebElement lastname_field;

    @FindBy(name = "phone[number]")
    WebElement phone_field;

    @FindBy(xpath = "/html/body/div/div[4]/form/div/div[2]/div[5]/div/button/span[3]")
    WebElement continue_btn3;

    @FindBy(id = "gender")
    WebElement gender;

    @FindBy(xpath = "//span[normalize-space()='Male']")
    WebElement select_gender;

    @FindBy(id = "input_birth_date")
    WebElement birthdate_field;
   

    @FindBy(id = "acceptTC")
    WebElement terms_btn;
    @FindBy(xpath = "//button[@id='confirmBtn']//span[@class='mdc-button__touch']")
    WebElement cont_btn4;

    @FindBy(xpath = "//*[@id=\"form_success\"]/div/div/div[2]/div/button/span[3]")
    public WebElement success_btn;
    @FindBy(xpath = "//*[@id=\"form_success\"]/div/div/div[1]/h2")
    public WebElement success_msg;

    @FindBy(xpath = "//*[@id=\"jm\"]/header/section/div[2]/div[1]/label")
    public WebElement username_btn;


    @FindBy(xpath = "//*[@id=\"dpdw-login-box\"]/div/form/button")
    public WebElement logout_btn;
    
    public void register (String email, String password, String confirmpass, String firstname,
            String lastname, String phone, String day, String month, String year) throws InterruptedException {
    	
    	email_phone.sendKeys(email);
        continue_btn.click();
        Thread.sleep(3000);
        password_field.sendKeys(password);
        
        Thread.sleep(2000);

        confirm_pass_field.sendKeys(password);
        Thread.sleep(2000);
        cont_btn2.click();
        Thread.sleep(2000);
        firstname_field.sendKeys(firstname);
        lastname_field.sendKeys(lastname);
        phone_field.sendKeys(phone);
        continue_btn3.click();
        Thread.sleep(1000);
        gender.click();
        select_gender.click();
        birthdate_field.sendKeys(day, month, Keys.ARROW_RIGHT, year);
        terms_btn.click();
        Thread.sleep(1000);
        cont_btn4.click();
        Thread.sleep(5000);


    	
    	
    	
    	
    	
    }}



	    
    

    
    
    
    
    
    