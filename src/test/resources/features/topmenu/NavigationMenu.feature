@navigation
Feature: Navigation menu options
  As user I want to use top menu for navigation

  Background:
    Given user is on the landing page
    When user logs in as a "driver"

  Scenario: Login as a driver and navigate to the Vehicles
    Then user clicks "Fleet" in top menu and "Vehicles" from drop down menu
    And user verifies that "Cars" page name is displayed

  Scenario: Login as a driver and navigate to the Vehicle Odometer
    Then user clicks "Fleet" in top menu and "Vehicle Odometer" from drop down menu
    And user verifies that "Vehicles Odometers" page name is displayed