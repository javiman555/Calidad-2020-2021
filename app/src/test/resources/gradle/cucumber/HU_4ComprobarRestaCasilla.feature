Feature: Comprobar resta casillas
  As a Buscaminas Player
  I want to check if i can substract two cells
  Because I want substract cells
  Scenario: Check substract cell
    Given Two cells in 3,3 and in 4,3
    When I substract them
    Then i receive a new cell 1,0