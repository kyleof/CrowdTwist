package com.test.crowd;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class crowdPage {

		private WebDriver driver;
	    private WebElement element;
	    private WebDriverWait wait;
	    private String dateString;
	    
	    public crowdPage()
	    {
	    	//constructor to initialise the drivers etc.
	    	driver = new ChromeDriver(); 
		    driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account"); 
		    wait = new WebDriverWait(driver,120);
	    }
	    
	    public void inputEmail(String name)
	    {
	    	driver.findElement(By.id("email_create")).sendKeys(name);
	    }
	    
	    public void clickSignUp()  
	    {
	    	driver.findElement(By.id("SubmitCreate")).click();
	    }
	    
	    //fills in personal information
	    public void fillInPersonal()
	    {
	    	wait.until(ExpectedConditions.elementToBeClickable(By.className("radio")));
	    	
	    	driver.findElement(By.id("id_gender2")).click();
	    	
	    	driver.findElement(By.id("customer_firstname")).sendKeys("Walter");
	    	
	    	driver.findElement(By.id("customer_lastname")).sendKeys("White");
	    	
	    	driver.findElement(By.id("passwd")).sendKeys("Test12345");
	    	
	
	  
	    }
	    //selects date from dropdowns by values 
	    public void selectDate(String day, String month, String year)
	    {
	    	
	    	new Select(driver.findElement(By.id("days"))).selectByValue(day);
	    	
	    	new Select(driver.findElement(By.id("months"))).selectByValue(month);

	    	new Select(driver.findElement(By.id("years"))).selectByValue(year);
	    	
	    }
	    //inputs information for address
	    public void selectAddress()
	    {
	    	
	    	driver.findElement(By.id("company")).sendKeys("Test1234");
	    	
	    	driver.findElement(By.id("address1")).sendKeys("Test1234");
	    	
	    	driver.findElement(By.id("address2")).sendKeys("Test233");
	    	
	    	driver.findElement(By.id("city")).sendKeys("Test233");
	    	
	    	new Select(driver.findElement(By.id("id_state"))).selectByValue("32");
	    	
	    	driver.findElement(By.id("postcode")).sendKeys("10000");
	    	
	    	driver.findElement(By.id("phone")).sendKeys("917917917");
	    	
	    	driver.findElement(By.id("alias")).sendKeys("alias123");
	    	
	    	driver.findElement(By.name("submitAccount")).click();
	    }
	    //navigates to new dress page
	    public void navigateToDress()
	    {
	    	driver.get("http://automationpractice.com/index.php?id_category=8&controller=category"); 
		    wait = new WebDriverWait(driver,120);
	    }
	    
	    public void pickDress()
	    {
 
	    	//click add to cart
	    	driver.findElement(By.cssSelector("a.button.ajax_add_to_cart_button.btn.btn-default")).click();
	    	
	    	//wait 
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.btn.btn-default.button.button-medium")));
	    	
	    	//click proceed to checkout
	    	driver.findElement(By.cssSelector("a.btn.btn-default.button.button-medium")).click();
	    	
	    	//wait
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.button.btn.btn-default.standard-checkout.button-medium")));
	    	
	    	//click proceed to checkout on Summary Page
	    	driver.findElement(By.cssSelector("a.button.btn.btn-default.standard-checkout.button-medium")).click();
	    	
	    	//Proceed on address page
	    	driver.findElement(By.name("processAddress")).click();
	    	
	    	//accept terms & conditions
	    	driver.findElement(By.name("cgv")).click();
	    	
	    	//Proceed on to checkout on shipping tab
	    	driver.findElement(By.name("processCarrier")).click();
	    	
	    
	    	
	    }
	    
	    public void pay()
	    {
	    	//click pay by bank wire
	    	driver.findElement(By.className("bankwire")).click();
	    	
	    	//select confirm order using xpath
	    	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	    	
	    }
	    
	    public void backToOrders()
	    {
	    	driver.findElement(By.cssSelector("a.button-exclusive.btn.btn-default")).click();
	   	
	    }
}
