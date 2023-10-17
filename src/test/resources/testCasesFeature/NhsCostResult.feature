@nhsTask1
Feature: As a user, I should be able to know what help I can get with my NHS costs
  Scenario Outline: Verify that the user can get a result of whether he/she will get help
    When  users click on the Start now button on the Costs Checker page
    Then users click one of the radio buttons that Which country you live in as "<Country>"
    And users click on the Next button
    Then users click one of the radio buttons that Is your GP practice in Scotland or Wales as "<GPYesNo>"
    And users click on the Next button
    Then users click one of the radio buttons that Which country is your dental practice in as "<Dental Country>"
    And users click on the Next button
    Then users enter valid date of birth into the Day as "<Day>" , Month as "<Month>" , and Year as "<Year>" input boxes
    And users click on the Next button
    Then users click one of the radio buttons that Do you live with a partner as "<YesNo>"
    And users click on the Next button
    Then users click one of the radio buttons that Do you or your partner claim any benefits or tax credits as "<YesNoTax>"
    And users click on the Next button
    Then users click one of the radio buttons that Are you pregnant or have you given birth in the last 12 months as "<PregnantYesNo>"
    And users click on the Next button
    Then users click one of the radio buttons that Do you have an injury or illness caused by serving in the armed forces as "<InjuryYesNo>"
    And users click on the Next button
    Then users click one of the radio buttons that Do you have diabetes as "<DiabetesYesNo>"
    And users click on the Next button
    Then users click one of the radio buttons that To check what help you can get with NHS charges, we need to know if you're affected by any of these conditions as "<ConditionsYesNo>"
    And users click on the Next button
    Then users click one of the radio buttons that Do you or a family member have glaucoma? as "<GlaucomaYesNo>"
    And users click on the Next button
    Then users click one of the radio buttons that Do you or your partner live permanently in a care home? as "<CareHomeYesNo>"
    And users click on the Next button
    Then users click one of the radio buttons that Do you and your partner have more than  in savings, investments or property? as "<SavingsYesNo>"
    And users click on the Next button
    Then verify that users can see the result successfully

    Examples:
    |Country|GPYesNo|Dental Country|Day|Month|Year|YesNo|YesNoTax|PregnantYesNo|InjuryYesNo|DiabetesYesNo|ConditionsYesNo|GlaucomaYesNo|CareHomeYesNo|SavingsYesNo|
    |England|Y      |England     |10 |10   |2000|N    |N       |N            |N          |N            |N              |N            |N            |N           |

