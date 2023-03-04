@test2
Feature: BB_Favorites
  Scenario: Check favorites buttons
    Given Open BB
    When Log In
    Then Press Easy Transfer
    And Press Close
    Then Press Favorite
    Then Press Easy Transfer
    And Press Close
    Then Press Payments
    And Press Home