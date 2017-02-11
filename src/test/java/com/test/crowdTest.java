package com.test;

import org.testng.annotations.Test;

import com.test.crowd.crowdPage;

public class crowdTest {
	
  @Test
  public void theTest() {
	  
	  crowdPage signUp = new crowdPage();
	  signUp.inputEmail("uu5675@tester.com");
	  signUp.clickSignUp();
	  signUp.fillInPersonal();
	  signUp.selectDate("12", "12", "1992");
	  signUp.selectAddress();
	  signUp.navigateToDress();
	  signUp.pickDress();
	  signUp.pay();
	  signUp.backToOrders();
	
	  
	  
  }
}
