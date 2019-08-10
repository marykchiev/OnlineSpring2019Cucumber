@vehicles
Feature: Vehicles
  As user I want to see list of all vehicles

  Scenario: Login as a driver and navigate to the vehicles
    Given user is on the landing page
    When user logs in as a "driver"
    Then user clicks "Fleet" in top menu and "Vehicles" from drop down menu
    And user verifies that "Cars" page name is displayed
    And user verifies that default page number is 1