
@MESK-333
Feature: As a user, I should be able to login

  @MESK-323
  Scenario:1- User can login with valid username and password
    Given Navigate to login page
    When Enter  username "Employee73" into username inputbox
    And Enter  password "Employee123" into password inputbox
    And  Click on the login button on the login page
    Then Verify that user can login files page successfully

@MESK-324
  Scenario Outline:2.1 User can not login with any invalid credentials
    Given Navigate to login page
    When  Enter  username "<username>" into username inputbox
    And Enter  password "<password>" into password inputbox
    And Click on the login button on the login page
    Then  Verify that user can not login and see the Notice Message :Wrong username or password.

    Examples: usernames
      | username   | password |
      | Employee73 | hellow   |
      | Employee73 | ola      |

@MESK-325
  Scenario Outline:2.2 User can not login with any invalid credentials
    Given Navigate to login page
    When  Enter  username "<username>" into username inputbox
    And Enter  password "<password>" into password inputbox
    And Click on the login button on the login page
    Then  Verify that user can not login and see the Notice Message :Wrong username or password.

    Examples: usernames
      | username | password    |
      | Ola      | Employee123 |
      | Hello    | Employee123 |

@MESK-326
  Scenario:2.3-User can not login with valid username and blank password

    Given Navigate to login page
    When Enter  username "Employee73" into username inputbox
    And  Enter the  password  "" into  password inputbox.
    And Click on the login button on the login page
    Then Verify that user can not login and see the notice message:Please fill out this field

@MESK-327
  Scenario:2.4-User can not login with blank username and  valid password
    Given Navigate to login page
    When Enter  username "" into username inputbox
    And  Enter  password "Employee123" into password inputbox
    And Click on the login button on the login page
    Then Verify that user can not login and see the notice message:Please fill out this field

@MESK-329
  Scenario: 3-User can see the password in a form of dots by default
    Given Navigate to login page
    When Enter  username "Employee73" into username inputbox
    And Enter  password "Employee123" into password inputbox
    Then  check if password appeare in the form of dots

@MESK-330
  Scenario: 4-User can see the password explicitly
    Given Navigate to login page
    When  Enter  username "Employee73" into username inputbox
    And Enter  password "Employee123" into password inputbox
    And Click on the eye sign after entering the password
    Then Verify that user can see the password explicitly

@MESK-331
  Scenario: 5-User can see the "Forgot password?" and "Reset Password"
    Given Navigate to login page
    When Verify that user can see the Forgot password? link
    And Click on the Forgot password? link
    Then Verify that user can see the Reset Password button

@MESK-332
  Scenario: 6-User can see valid placeholders on Username and Password fields
    When Navigate to login page
    And Verify that user can see valid placeholders on Username inputbox
    Then Verify that user can see valid placeholders on Password inputbox













