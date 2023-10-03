package testcases;
import org.testng.annotations.Test;

import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterationPage;







public class RegisterTest extends BaseTest {


    String email = "test542323251123@gmail.com";
    String password = "7U*LSowy*BwG7N";
    String firstname = "James";
    String lastname = "Bond";
    String phone = "01211837090";
    String day = "12";
    String month = "05";
    String year = "1993";


    @Test (priority = 1)
    public void Register() throws InterruptedException  {
       
    	
    	
 
        HomePage homePage = new HomePage(driver);
		homePage.RegisterationPage();
        Thread.sleep(1500);
        
        RegisterationPage registerationpage = new RegisterationPage(driver);
        registerationpage.register(email, password, password, firstname,
                 lastname, phone, day, month, year);
        Assert.assertTrue(registerationpage.success_btn.isDisplayed());
    }

    
    
    
    @Test (priority = 2)
    public void LoginTest() throws InterruptedException {
	
    	LoginPage loginpage =new LoginPage(driver);
        Thread.sleep(1500);
        loginpage.Login(email,password);
        Thread.sleep(5000);
        loginpage.closepopup_btn.click();

    	loginpage.account_btn.click();
        Thread.sleep(5000);


        
        String loginvalidation = loginpage.logut_btn.getText();
        Assert.assertTrue(loginpage.logut_btn.isDisplayed());
        Assert.assertTrue(loginvalidation.contains("LOGOUT"));
        System.out.println("Logged in successfully");


    }}
    
    
    
    
    
    
    
    
    
    