Feature: Login application

  Scenario: Login in to application
    Given User is on kite app
    When User login into application 
    Then Workspace name list is dispalyed