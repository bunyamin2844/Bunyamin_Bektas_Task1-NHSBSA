package stepdefinitions;

import cucumber.api.java.en.Then;
import pageObjects.AllPageObjects;
import utilities.BaseClass;

public class DateOfBirthStepDef extends BaseClass {
    AllPageObjects element=new AllPageObjects();

    @Then("users enter valid date of birth into the Day as {string} , Month as {string} , and Year as {string} input boxes")
    public void usersEnterValidDateOfBirthIntoTheDayAsMonthAsAndYearAsInputBoxes(String arg0, String arg1, String arg2) {

        try {
            click(element.dbpo().day);
            enterText(element.dbpo().day,arg0);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            click(element.dbpo().month);
            enterText(element.dbpo().month,arg1);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            click(element.dbpo().year);
            enterText(element.dbpo().year,arg2);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
