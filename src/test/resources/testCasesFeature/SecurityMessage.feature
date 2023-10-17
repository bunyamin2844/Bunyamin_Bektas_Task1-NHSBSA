
@nhsTask1
Feature: As a user, I should be able to know what help I can get with my NHS costs

  Scenario: Verify that the user can get a result of whether he/she will get help
    When  users click on the Start now button on the Costs Checker page
    Then users click one of the radio buttons that Which country you live in as "England"

    And users click on the Next button
    Then if user do not perform any action for certain  period should see the message "Your application will time out soon"
