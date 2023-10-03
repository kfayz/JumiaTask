package testcases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseTest {
    public  String baseUrl = "https://www.jumia.com.eg/";
    public WebDriver driver;

    @BeforeMethod
    public  void startSession() {
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterMethod
    public void endSession() {
        driver.quit();
    }
}