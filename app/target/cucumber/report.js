$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/gradle/cucumber/HU_1SeniorJuega.feature");
formatter.feature({
  "name": "Play Games",
  "description": "  As a Senior Citicen\n  I want to have access to games\n  Because I want to play games",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Access Games",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am Senior Citicen",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions_HU1.i_am_senior_citicen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click play",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions_HU1.i_click_play()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I access the games",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions_HU1.i_access_the_games()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/gradle/cucumber/HU_2BuscaminasInmortaTruel.feature");
formatter.feature({
  "name": "Buscaminas Invulnerability True",
  "description": "  As a Buscaminas Player\n  I want to get Invulnerability\n  Because I want to not lose",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Activate Invulnerability",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am playing Buscaminas",
  "keyword": "Given "
});
formatter.match({
  "location": "InvulnerabilityTrueTest.i_am_playing_buscaminas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Invulnerability",
  "keyword": "When "
});
formatter.match({
  "location": "InvulnerabilityTrueTest.i_click_invulnerability()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can\u0027t lose",
  "keyword": "Then "
});
formatter.match({
  "location": "InvulnerabilityTrueTest.i_cant_lose()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/gradle/cucumber/HU_2BuscaminasInmortalFalse.feature");
formatter.feature({
  "name": "Buscaminas Invulnerability False",
  "description": "  As a Invulnerable Buscaminas Player\n  I want to not get Invulnerability\n  Because I want to lose",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Deactivate Invulnerability",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I play Buscaminas",
  "keyword": "Given "
});
formatter.match({
  "location": "InvulnerabilityFalseTest.i_am_playing_buscaminas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am Invulnerable",
  "keyword": "And "
});
formatter.match({
  "location": "InvulnerabilityFalseTest.i_am_invulnerable()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will click Invulnerability",
  "keyword": "When "
});
formatter.match({
  "location": "InvulnerabilityFalseTest.i_click_invulnerability()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can lose",
  "keyword": "Then "
});
formatter.match({
  "location": "InvulnerabilityFalseTest.i_can_lose()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/gradle/cucumber/HU_3ComprobarDentroCasillas.feature");
formatter.feature({
  "name": "Comprobar casillas",
  "description": "  As a Buscaminas Player\n  I want to check if i click propertly\n  Because I want to click well",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check casilla",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Two cells in 2,3 and in 4,3",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions_HU3.two_cells_in_23_and_in_43()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click in 3,3",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions_HU3.i_click_in_33()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i clicked in 2,3 but out of 4,3 cell",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions_HU3.i_clicked_in_23_but_out_of_43_cell()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/gradle/cucumber/HU_4ComprobarRestaCasilla.feature");
formatter.feature({
  "name": "Comprobar resta casillas",
  "description": "  As a Buscaminas Player\n  I want to check if i can substract two cells\n  Because I want substract cells",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check substract cell",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Two cells in 3,3 and in 4,3",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions_HU4.two_cells_in_33_and_in_43()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I substract them",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions_HU4.i_substract_them()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i receive a new cell 1,0",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions_HU4.i_receive_a_new_cell_10()"
});
formatter.result({
  "status": "passed"
});
});