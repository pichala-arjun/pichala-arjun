package com.stepDefinations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class NaukriLoginSteps {
	
	
	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {
		 System.out.println("homepage");
	}
	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
	  System.out.println("Login");  
	}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
	    
	   
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
	    
	   
	}
	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	    
	}
	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    
	}
	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    
	}
	@Given("veryfy user is able to click on updateprofile")
	public void veryfy_user_is_able_to_click_on_updateprofile() {
	    
	   
	}
	@Then("user uplode the user resume")
	public void user_uplode_the_user_resume() {
	    
	   
	}
	@Then("user click on keyskills button")
	public void user_click_on_keyskills_button() {
	    
	   
	}


}
