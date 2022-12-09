Feature: Google Test

  Background:
    Given Launch Application
#  @Smoke
#  Scenario: Open Google Page
#    Given Launch Google Home Page
#
#    @Regression
#    Scenario: Open FaceBook
#      Given Open Facebook Page




  Scenario Outline: Login To Application
    Given User enters <username> and <password>
    When User clicks on submit button
    Then User is Navigated to home page
    Examples:
    | username | password |
    | abed | abed@123 |

