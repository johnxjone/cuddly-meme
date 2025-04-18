Feature: Title of your feature

  @tag1
  Scenario: i want to valadate the website of Swag Lab
    Given login the url of Swag lab"https://www.saucedemo.com/"
    And user name of"standard_user"and Password"secret_sauce"
    When Click submmit buttom

  Scenario Outline: i want to valadate the website of Swag Lab
    Given login the url of Swag lab"<URL>"
    And user name of"<Username>"and Password"<Password>"
    When Click submmit buttom

    Examples: 
      | URL                        | Username                | Password     |
      | https://www.saucedemo.com/ | standard_user           | secret_sauce |
      | https://www.saucedemo.com/ | locked_out_user         | secret_sauce |
      | https://www.saucedemo.com/ | problem_user            | secret_sauce |
      | https://www.saucedemo.com/ | performance_glitch_user | secret_sauce |
      | https://www.saucedemo.com/ | visual_user             | secret_sauce |
