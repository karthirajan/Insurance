Feature: User enters detail to get a quote

  Scenario: User Enters the details
    Given User navigate to the url
    When User selects auto+home from dropdown
    And User gives the zipcode
    And user clicks start quote
    And User closes the popup
    And User validates whether the radiobutton is selected and clicks on continue quote
    And User fills all the details and clicks start my quote
