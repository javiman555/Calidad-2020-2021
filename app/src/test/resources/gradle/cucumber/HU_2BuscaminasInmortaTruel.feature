Feature: Buscaminas Invulnerability True
  As a Buscaminas Player
  I want to get Invulnerability
  Because I want to not lose
  Scenario: Activate Invulnerability
    Given I am playing Buscaminas
    When I click Invulnerability
    Then I can't lose