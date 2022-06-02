@tag
Feature: verify naukri edit profile page
  

  @Resume
  Scenario: verify user is able to edit profile by updating the resume
   When user is on login page
    Then user entered user name 
    And user entered password
    Then user click on login button
    Then veryfy user is on home page
    When user clicks on update profile
    Then verify user is on edit profile page
    Then user submits the resume
    Then verify resume is update message should display
    
 
 Scenario: verify user is able to edit profile by updating the Resume headline
   When user is on login page
    Then user entered user name 
    And user entered password
    Then user click on login button
    Then veryfy user is on home page
    When user clicks on update profile
    Then verify user is on edit profile page
    Then user clicks on edit button on resume headlines section
    Then verify resume headlines got uploaded
     
  