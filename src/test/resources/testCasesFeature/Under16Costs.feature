@nhsTask1
  Feature: As a user, I should be able to know what help I can get with my NHS costs

    Scenario: Verify that the user can get a result of whether he/she will get help

      When  users click on the Start now button on the Costs Checker page
      Then users click one of the radio buttons that Which country you live in as "England"
      And users click on the Next button
      Then users click one of the radio buttons that Is your GP practice in Scotland or Wales as "<GPYesNo>"
      And users click on the Next button
      Then users click one of the radio buttons that Which country is your dental practice in as "<Dental Country>"
      And users click on the Next button
      Then users enter valid date of birth into the Day as "<Day>" , Month as "<Month>" , and Year as "<Year>" input boxes
      And users click on the Next button

      And Child should get free options as follows:
    | NHS prescriptions      |
    | NHS dental check-ups and treatment|
    | sight tests                      |
    | NHS wigs and fabric supports     |
      And Child should get money off as follows:
    |new glasses or contact lenses     |
    |repairing or replacing your glasses or contact lenses|
      And Child don't automatically get help towards the cost of:
    | travel for NHS treatment                            |


