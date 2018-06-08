#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: LogOut
  Testing logout function

  @chrome
  Scenario: Clicking on logout button, user should be able to logout
    Given I on the CRM homepage
    When  I enter user name and password
    And   I click on login button
    Then  I should be logged into my account page
    When I click on logout
    Then I should be logged out from my account. Should be rerouted to homepage 
    
    
    
  @firefox
  Scenario: Clicking on logout button, user should be able to logout
    Given I on the CRM homepage
    When  I enter user name and password
    And   I click on login button
    Then  I should be logged into my account page
    When I click on logout
    Then I should be logged out from my account. Should be rerouted to homepage 
    
    
