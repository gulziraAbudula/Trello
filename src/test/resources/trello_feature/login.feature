@login

  Feature: Login

    Scenario: User should be able to successfully log in to Trello home page
      Given User goes to trello.com
      When User enters valid username and password
      Then user should log in successfully