@Smoke
Feature: Smoke Age Determination

  Background:
    Given I am on the age determination website

  Scenario: User gets correct age result for random date of birth
    When I type random user name
    And I type random date of birth
    And I click submit button
    Then I see the correct age result

  Scenario Outline: User gets correct name in age result
    When I type "<name>" in username
    And I type random date of birth
    And I click submit button
    Then I see correct "<name>" in age result
    Examples:
      |  name  |
      | Maitri |
      | Alisa  |
      | Iryna  |

  Scenario: User gets correct message when name field is empty with random date of birth
    When I type random date of birth
    And I click submit button
    Then I see "incorrect symbols" error message

  Scenario: User gets correct message when date field is empty with random user name
    When I type random user name
    And I click submit button
    Then I see "wrong date" error message for date

  Scenario: User can see Top Heading(UI)
    Then I see "How old are you?" on home page