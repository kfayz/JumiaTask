package testcases;
import org.testng.annotations.Test;

import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.CartPage;
import pages.ProductsPage;










public class Add2CartTest extends BaseTest {

    String email = "test5423251123@gmail.com";
    String password = "7U*LSowy*BwG7N";
    
    
    @Test (priority = 1)
    public void addtocartTest() throws InterruptedException  {
    	
    	LoginPage loginpage =new LoginPage(driver);
        Thread.sleep(1500);
        loginpage.Login(email,password);
               

        HomePage homePage = new HomePage(driver);
        Thread.sleep(7000);
        
        driver.navigate().refresh();
        

    	loginpage.account_btn.click();

        Thread.sleep(5000);
        String loginvalidation = loginpage.logut_btn.getText();
        Assert.assertTrue(loginpage.logut_btn.isDisplayed());
        Assert.assertTrue(loginvalidation.contains("LOGOUT"));
        System.out.println("Logged in successfully");
 
        Thread.sleep(1000);

		homePage.bakeryinsupermarket();
		
        Thread.sleep(5000);
        ProductsPage productspage = new ProductsPage(driver);   
        
        Thread.sleep(6000);

        productspage.Add2Cart();
        Thread.sleep(3000);

        
        // These are the product names from the products page
        
        String product1name = productspage.product1_title.getText();
        String product2name = productspage.product2_title.getText();
        
        CartPage cartpage = new CartPage(driver);   
        cartpage.cart();
        
        // These are the product names from the cart
        
        String cartproduct1name = cartpage.cartproduct1_title.getText();
        Thread.sleep(1000);

        String cartproduct2name = cartpage.cartproduct2_title.getText();
        Thread.sleep(3000);
        

        Assert.assertTrue(product1name.equals(cartproduct1name));
        

        Assert.assertTrue(product2name.equals(cartproduct2name));
        
        
        // Product 1 is added with quantity 2 to test assertion on different quantities
        
        // Product 2 is added with quantity 1

        
        String cartproduct1price = cartpage.cartproduct1_price.getText();
         
        Float cartproduct1qty = Float.parseFloat(cartpage.cartproduct1_qty.getText());
        
        float cartproduct1pricevalue = Float.parseFloat(cartproduct1price.replace("EGP ", ""));
        
        // Cart price of product 1 is equal to product price multiplied by quantity in cart
         
        Float cartproduct1priceXqty = (cartproduct1qty * cartproduct1pricevalue);
        
        String cartproduct2price = cartpage.cartproduct2_price.getText();
        String cartproduct2pricevalue = cartproduct2price.replace("EGP ", "");
        
        
        
        //This is the subtotal calculated by jumia
        
        String subtotalcalculated = cartpage.subtotal.getText();
        float subtotalcalculatedvalue = Float.parseFloat(subtotalcalculated.replace("EGP ", ""));
                

        //This is the subtotal of adding prices of products in cart element by element
        
        Float productssubtotal = (cartproduct1priceXqty + Float.parseFloat(cartproduct2pricevalue));
     
        System.out.print(productssubtotal);
        System.out.print(subtotalcalculatedvalue);


        
        Assert.assertTrue(subtotalcalculatedvalue==productssubtotal);
        





        
        
        

        
       

		
    	
    	
    	
    }}
       