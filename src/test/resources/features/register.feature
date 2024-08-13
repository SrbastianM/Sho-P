Feature: Register User's
   I as user need to register one user to put my products

  Scenario Outline: Register one user
    Given the user is on the page
    When the user selects user modal
    And the user selects register anchor element
    And the user sees "Create an Account" page
    When the user put the correct credentials
    And the user selects the register button
    And the user can see "Account Created" message
    And the user is registered in the app
    Then the user is redirected to login page

    Examples:
      | Role     | First Name | Last Name | Email             | Password |
      | customer | Jhon Paco  | Federer   | sho-p@yopmail.com | Ater3xio |