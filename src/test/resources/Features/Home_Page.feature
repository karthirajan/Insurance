#Author: your.email@your.domain.com
Feature: Insurance Quote for new Customer

  Scenario: Getting Quote
    Given User launches the browser
    When User filling up the basic details
    And User clicks start quote button
    Then User is displayed with next page
    And User clicks the continue button
    When User entering all the details in tell about page
    And User clicks Yes,start quote button
    Then User is displayed with confirm pop-up and clicks Yes,start quote button
    Then User clicks the contiue button after entering the email address
    When User giving all the details in the Condo Basics page
    And User clicking the continue button
    When User gives all the details in the Condo Interior Page
    And User clicks contiue button
    When User enters the details in the Condo Exterior page
    And User click the continue button
