# Autor: Oscar Eliezer Salsedo Quiroz
# language:en
@stories
Feature: Academy Choucair
  As a user, I want to learn to automate in screamplay at Choucair Academy with automation course
  @scenario1
  Scenario: Search for a automation course
    Given than Oscar wants to learn automation at the Academy Choucair
    |  strUser  |   strPassword |
    |  TuUsuario|   TuClave     |
    When he search for the course on the Chourcair Academy platform
    | strCourse               |
    |Metodologia Bancolombia  |
    Then he finds the course called
    |strCourse                |
    |Metodologia Bancolombia  |
