Feature: testing login feature

  @standardUser
  Scenario Outline: positive testing - standard user
    Given user is in the login page
    When user insert valid standard "<username>"
    When user insert valid password "<password>"
    And user click on login button
    Then user is on the product page

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | locked_out_user         | secret_sauce |
      | performance_glitch_user | secret_sauce |

  Scenario: positive testing - lockedout user
    Given user is in the login page
    When user insert valid lockedout username
    When user insert valid password
    And user click on login button
    Then user is on the product page
