Feature: Buscaminas Invulnerability False
  As a Invulnerable Buscaminas Player
  I want to not get Invulnerability
  Because I want to lose
  Scenario: Deactivate Invulnerability
    Given I play Buscaminas
    And I am Invulnerable
    When I will click Invulnerability
    Then I can lose