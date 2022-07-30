@ZULL-1024
Feature: Login to employees profile

  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.


  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the webpage

  @ZULL-1116
  Scenario: Login as marketing user
    When user enters marketing username
    And user enters marketing password
    Then user should see the dashboard

  @ZULL-1119
  Scenario: User should be able to see the employee list in the Employees tab.
    Given user is logged in as Marketing employee
    Then user navigates to Employees link
    And user clicks on the Find Employee
    Then user sees Employee List

  @ZULL-1120
  Scenario: User should be able to see the inactive employees by clicking the Inactive tab
    Given user is logged in as Marketing employee
    Then user navigates to Employees link
    And user clicks on the Find Employee
    And user clicks on the inactive tab
    Then user should see Inactive employees tab

  @ZULL-1121
  Scenario: User should be able to find employees by search by Alphabet.
    Given user is logged in as Marketing employee
    Then user navigates to Employees link
    And user clicks on the Find Employee
    And the user clicks on the Search by Alphabet tab
    Then verify that search by alphabet function is displayed

  @ZULL-1122
  Scenario: User should be able to find employees by search box
    Given user is logged in as Marketing employee
    Then user navigates to Employees link
    And user clicks on the Find Employee
    And the user clicks on search box on the page
    Then verify that search box is displayed


