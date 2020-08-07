Feature: Page navigation links
  @users
  Scenario: Go to the users page
    Given I am on the login page
    And I login as a librarian
    Then I click on the "Users" link
    And "Users" page should be displayed

