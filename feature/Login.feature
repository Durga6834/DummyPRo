Feature: validate the login functionality

  Scenario: 
    test the login functionality with vallid data

    Given login into users page with url
    When provide username and password
    And click on login
    Then user navigate to homepage
