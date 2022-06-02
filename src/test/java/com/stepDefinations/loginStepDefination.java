package com.stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import core.utility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefination{
	
	
	LoginPage C = new LoginPage();

@When("user is on login page")
public void user_is_on_login_page() throws InterruptedException {
	
  
     
  	
  	Thread.sleep(5000);
  
   
}



@Then("user entered user name")

public void user_entered_user_name() throws InterruptedException {
	C.enteredusername();
	
   
}
@Then("user entered password")
public void user_entered_password( ) throws InterruptedException {
	
	C.userenteredpassword();
}
@Then("user click on login button")
public void user_click_on_login_button() throws InterruptedException {
	C.clickonlogin();
}
@Then("veryfy user is on home page")
public void veryfy_user_is_on_home_page() {
	
	
	
   
}
@Then("user entered {string} user name")
public void user_entered_user_name(String username) throws InterruptedException {
	
}
@Then("user entered {string} password")
public void user_entered_password(String password) {
	 
}

@Then("verify status of the login functionality {string}")
public void verify_status_of_the_login_functionality(String status) throws InterruptedException {
	
	}
	
	
	


}
