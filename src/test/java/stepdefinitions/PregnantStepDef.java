package stepdefinitions;

import cucumber.api.java.en.Then;
import pageObjects.AllPageObjects;
import utilities.BaseClass;

public class PregnantStepDef extends BaseClass {
    AllPageObjects element = new AllPageObjects();

    @Then("users click one of the radio buttons that Are you pregnant or have you given birth in the last {int} months as {string}")
    public void usersClickOneOfTheRadioButtonsThatAreYouPregnantOrHaveYouGivenBirthInTheLastMonthsAs(int arg0, String arg1) {
        if(arg1.equalsIgnoreCase("N")){
            click(element.pregnantpo().noButton);

        }else {
            click(element.pregnantpo().yesButton);
        }
    }
}
