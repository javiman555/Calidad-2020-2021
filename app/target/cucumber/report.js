$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HU_1SeniorJuega.feature");
formatter.feature({
  "line": 1,
  "name": "Play Games",
  "description": "As a Senior Citicen\nI want to have access to games\nBecause I want to play games",
  "id": "play-games",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Access Games",
  "description": "",
  "id": "play-games;access-games",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am Senior Citicen",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click play",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I access the games",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions_HU1.i_am_senior_citicen()"
});
formatter.result({
  "duration": 157887460,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions_HU1.i_click_play()"
});
formatter.result({
  "duration": 129239,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions_HU1.i_access_the_games()"
});
formatter.result({
  "duration": 90852,
  "status": "passed"
});
formatter.uri("HU_2BuscaminasInmortaTruel.feature");
formatter.feature({
  "line": 1,
  "name": "Buscaminas Invulnerability True",
  "description": "As a Buscaminas Player\nI want to get Invulnerability\nBecause I want to not lose",
  "id": "buscaminas-invulnerability-true",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Activate Invulnerability",
  "description": "",
  "id": "buscaminas-invulnerability-true;activate-invulnerability",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am playing Buscaminas",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click Invulnerability",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can\u0027t lose",
  "keyword": "Then "
});
formatter.match({
  "location": "InvulnerabilityTrueTest.i_am_playing_buscaminas()"
});
formatter.result({
  "duration": 1976755,
  "status": "passed"
});
formatter.match({
  "location": "InvulnerabilityTrueTest.i_click_invulnerability()"
});
formatter.result({
  "duration": 127709,
  "status": "passed"
});
formatter.match({
  "location": "InvulnerabilityTrueTest.i_cant_lose()"
});
formatter.result({
  "duration": 2038360,
  "status": "passed"
});
formatter.uri("HU_2BuscaminasInmortalFalse.feature");
formatter.feature({
  "line": 1,
  "name": "Buscaminas Invulnerability False",
  "description": "As a Invulnerable Buscaminas Player\nI want to not get Invulnerability\nBecause I want to lose",
  "id": "buscaminas-invulnerability-false",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Deactivate Invulnerability",
  "description": "",
  "id": "buscaminas-invulnerability-false;deactivate-invulnerability",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I play Buscaminas",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I am Invulnerable",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I will click Invulnerability",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I can lose",
  "keyword": "Then "
});
formatter.match({
  "location": "InvulnerabilityFalseTest.i_am_playing_buscaminas()"
});
formatter.result({
  "duration": 63594,
  "status": "passed"
});
formatter.match({
  "location": "InvulnerabilityFalseTest.i_am_invulnerable()"
});
formatter.result({
  "duration": 32836,
  "status": "passed"
});
formatter.match({
  "location": "InvulnerabilityFalseTest.i_click_invulnerability()"
});
formatter.result({
  "duration": 28560,
  "status": "passed"
});
formatter.match({
  "location": "InvulnerabilityFalseTest.i_can_lose()"
});
formatter.result({
  "duration": 47281,
  "status": "passed"
});
formatter.uri("HU_3ComprobarDentroCasillas.feature");
formatter.feature({
  "line": 1,
  "name": "Comprobar casillas",
  "description": "As a Buscaminas Player\nI want to check if i click propertly\nBecause I want to click well",
  "id": "comprobar-casillas",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Check casilla",
  "description": "",
  "id": "comprobar-casillas;check-casilla",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Two cells in 2,3 and in 4,3",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click in 3,3",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "i clicked in 2,3 but out of 4,3 cell",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions_HU3.two_cells_in_23_and_in_43()"
});
formatter.result({
  "duration": 153281,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions_HU3.i_click_in_33()"
});
formatter.result({
  "duration": 89692,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions_HU3.i_clicked_in_23_but_out_of_43_cell()"
});
formatter.result({
  "duration": 109001,
  "status": "passed"
});
formatter.uri("HU_4ComprobarRestaCasilla.feature");
formatter.feature({
  "line": 1,
  "name": "Comprobar resta casillas",
  "description": "As a Buscaminas Player\nI want to check if i can substract two cells\nBecause I want substract cells",
  "id": "comprobar-resta-casillas",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Check substract cell",
  "description": "",
  "id": "comprobar-resta-casillas;check-substract-cell",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Two cells in 3,3 and in 4,3",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I substract them",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "i receive a new cell 1,0",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions_HU4.two_cells_in_33_and_in_43()"
});
formatter.result({
  "duration": 69507,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions_HU4.i_substract_them()"
});
formatter.result({
  "duration": 42818,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions_HU4.i_receive_a_new_cell_10()"
});
formatter.result({
  "duration": 47050,
  "status": "passed"
});
});