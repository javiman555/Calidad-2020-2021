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
  "duration": 168137852,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions_HU1.i_click_play()"
});
formatter.result({
  "duration": 112497,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions_HU1.i_access_the_games()"
});
formatter.result({
  "duration": 73486,
  "status": "passed"
});
formatter.uri("HU_2BuscaminasInmortal.feature");
formatter.feature({
  "line": 1,
  "name": "Buscaminas Invulnerability",
  "description": "As a Buscaminas Player\nI want to get Invulnerability\nBecause I want to not lose",
  "id": "buscaminas-invulnerability",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Activate Invulnerability",
  "description": "",
  "id": "buscaminas-invulnerability;activate-invulnerability",
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
  "location": "StepDefinitions_HU2.i_am_playing_buscaminas()"
});
formatter.result({
  "duration": 125066,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions_HU2.i_click_invulnerability()"
});
formatter.result({
  "duration": 110562,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions_HU2.i_cant_lose()"
});
formatter.result({
  "duration": 155168,
  "status": "passed"
});
});