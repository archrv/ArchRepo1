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
@regression
Feature: LinkedIn login functionality
  
  @validLogin
  Scenario: To test login functionality in LinkedIn page with valid credentials 
    Given user is on login page
    When user enters valid credentials as
    | 			email							|		password		|
    | arcrubyv@gmail.com			|	almightyli9!	|
    | otttesting123@gmail.com	| testot123			|
    
    And clicks on Signin button
    Then user should be navigate to profile page which displays username
