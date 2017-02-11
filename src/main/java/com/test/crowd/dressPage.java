package com.test.crowd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dressPage {
	
	private WebDriver driver;
    private WebElement element;
    private WebDriverWait wait;
    
    public dressPage()
    {
    	//constructor to initialise the drivers etc.
    	driver = new ChromeDriver(); 
	    driver.get("http://automationpractice.com/index.php?id_category=8&controller=category"); 
	    wait = new WebDriverWait(driver,120);
    }
    
    public void pickDress()
    {
//    	new Actions(driver).moveToElement("Add to cart")
    	
    	driver.findElement(By.cssSelector("a.button.ajax_add_to_cart_button.btn.btn-default")).click();
    	
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.btn.btn-default.button.button-medium")));
    	
    	driver.findElement(By.cssSelector("a.btn.btn-default.button.button-medium")).click();
    	
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.button.btn.btn-default.standard-checkout.button-medium")));
    	
    	driver.findElement(By.cssSelector("a.button.btn.btn-default.standard-checkout.button-medium")).click();
    	
    	driver.findElement(By.name("processAddress")).click();
    	
    	
    }

}
