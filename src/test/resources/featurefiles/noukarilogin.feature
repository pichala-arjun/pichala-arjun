
Feature: Login Feature
  Verify if user is able to Login in to the site

@tags
  Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed
    
    @arjun
    Scenario: veryfy user is able to login to the application
    When user is on login page
    Then user entered user name 
    And user entered password
    Then user click on login button
    Then veryfy user is on home page
    
     @arjun1
     Scenario: veryfy user is able to login to the application
    When user is on login page
    Then user entered user name 
    And user entered password
    Then user click on login button
    Then veryfy user is on home page
    Given veryfy user is able to click on updateprofile
    Then user uplode the user resume
    Then user click on keyskills button
    