package com.stepDefinations;

import org.openqa.selenium.By;

import core.utility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class editProfileStepDef extends utility{
	@When("user clicks on update profile")
	public void user_clicks_on_update_profile() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='updateProfile']")).click();
		Thread.sleep(6000);
		
		Thread.sleep(6000);
		//driver.findElements(By.xpath("//div[@class='keySkills']/div/div/div/span[1]"));
		//driver.findElement(By.xpath("//span[@class='profileComScore']")).click();
		//driver.findElement(By.xpath("	//span[@class='add']']")).click();
		
	   
	}
	@Then("verify user is on edit profile page")
	public void verify_user_is_on_edit_profile_page() {
	   
	   
	}
	@Then("user submits the resume")
	public void user_submits_the_resume() {
	  
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("C:\\Users\\cyb er\\Desktop\\ARJUN RESUME.docx");
	}
	@Then("verify resume is update message should display")
	public void verify_resume_is_update_message_should_display() {
	   
	   
	}


}
