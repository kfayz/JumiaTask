package testcases;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterationPage;
import utilities.ReadXLSData;







public class RegisterDDT extends BaseTest {


    String email = "test542323251123@gmail.com";
    String password = "7U*LSowy*BwG7N";
    String firstname = "James";
    String lastname = "Bond";
    String phone = "01211837090";
    String day = "12";
    String month = "05";
    String year = "1993";
    
    
    // This is data driven testing using data entered below
    
    @DataProvider(name="testdata")
    public String[][] createData1() {
    	 return new String[][] {
    	   {"test5423251123@gmail.com", "7U*LSowy*BwG7N"},
    	   {"test54232761123@gmail.com", "7U*LSowasdy*BwG7N"}

    	   

    	};
    	 
    };
    	 
    	 
    	 
    // This is data driven testing using excel sheet provided in testdata folder 
    
    
    @DataProvider(name="testexceldata")
    	    public String[][] createData2() throws IOException {
    	
    		String path=".\\src\\test\\java\\testdata\\testdata.xlsx";
    		ReadXLSData readxlsdata = new ReadXLSData(path);
    		
    		int totalrows = readxlsdata.getRowCount("login");
    		int totalcols = readxlsdata.getCellCount("login", 1);
    		
    		String loginData[][]=new String[totalrows][totalcols];
			
    		
    		for(int i=1;i<=totalrows;i++) //1
    		{
    			for(int j=0;j<totalcols;j++) //0
    			{
    				loginData[i-1][j]=readxlsdata.getCellData("login", i, j);
    			}	 
    	
    	
    		}
    	
    		return loginData;
    

    	    	   

    	 
    	}

    
    
    
    
    
    
    
    


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

    
    
    
    @Test (priority = 2, dataProvider="testexceldata")
    
    
    public void LoginTest(String username, String password) throws InterruptedException {
	
    	LoginPage loginpage =new LoginPage(driver);
        Thread.sleep(1500);
        loginpage.Login(username,password);
        Thread.sleep(5000);
        loginpage.closepopup_btn.click();

    	loginpage.account_btn.click();
        Thread.sleep(5000);


        
        String loginvalidation = loginpage.logut_btn.getText();
        Assert.assertTrue(loginpage.logut_btn.isDisplayed());
        Assert.assertTrue(loginvalidation.contains("LOGOUT"));
        System.out.println("Logged in successfully");


    }
    
    
    
    



}