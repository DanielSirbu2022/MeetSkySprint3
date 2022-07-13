

Feature: As a user, I should be able to log out.


  Scenario:1-User can log out and ends up in log in page

    Given Navigate to login page
    When  Enter  username "Employee73" into username inputbox
    And Enter  password "Employee123" into password inputbox
    And  Click on the login button on the login page
    And  Verify that user can login files page successfully
    And Click on the profile icon
    And Verify that user can see the Log out link
    And Click on the Log out link
    Then Verify that user can log out on the files page and see log in page


  Scenario:2-User can not go to home page again by clicking step back button after successfully logged out.
    Given Navigate to login page
    When  Enter  username "Employee73" into username inputbox
    And Enter  password "Employee123" into password inputbox
    And  Click on the login button on the login page
    And  Verify that user can login files page successfully
    And Click on the profile icon
    And Verify that user can see the Log out link
    And Click on the Log out link
    And Click on the step back button
    Then Verify that user can NOT go to home page again



































