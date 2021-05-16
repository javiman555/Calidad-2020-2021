Feature: Comprobar casillas
  As a Buscaminas Player
  I want to check if i click propertly
  Because I want to click well
  Scenario: Check casilla
    Given Two cells in 2,3 and in 4,3
    When I click in 3,3
    Then i clicked in 2,3 but out of 4,3 cell