Feature: Navigation menu options
  As user I want to use top menu for navigation

  @driver
Scenario: Login as a driver and navigate to the vehicles
Given user is on the landing page
When user logs in as a "driver"
Then user clicks "Fleet" in top menu and "Vehicles" from drop down menu
  And user verifies that "Cars" page name is displayed