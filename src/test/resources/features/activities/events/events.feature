@events
Feature: Events

  Scenario: Login as a driver, navigate to Calendar Events and create event
    Given user is on the landing page
    When user logs in as a "driver"
    Then user clicks "Activities" in top menu and "Calendar Events" from drop down menu
    Then user clicks Create Calendar Event button

