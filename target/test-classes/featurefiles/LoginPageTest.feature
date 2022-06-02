@tag
Feature: verify login page functionality

  @tag2
  Scenario Outline: Verify login page with different credentials
    When user is on login page
     Then user entered "<username>" user name 
     And user entered "<password>" password 
     Then user click on login button
    Then verify status of the login functionality "<status>"
    Examples: 
      | name  | username                        | password         |status|
      | name2 |     snmbsdbsmvbmsvmsmvnsbvdsmbmd | jjjbkbkbjkbkj    |fail|
      | name1 |     arjunreddyabd8660@gmail.com | Amareswar@1234   |pass    |
      
 
   