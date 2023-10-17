package stepdefinitions;

import cucumber.api.java.en.Then;
import pageObjects.AllPageObjects;
import utilities.BaseClass;

public class MedicalConditionsStepDef extends BaseClass {
    AllPageObjects element = new AllPageObjects();

    @Then("users click one of the radio buttons that To check what help you can get with NHS charges, we need to know if you're affected by any of these conditions as {string}")
    public void usersClickOneOfTheRadioButtonsThatToCheckWhatHelpYouCanGetWithNHSChargesWeNeedToKnowIfYouReAffectedByAnyOfTheseConditionsAs(String arg0) {
        scrollDown(element.mcpo().noButton);
        click(element.mcpo().noButton);
    }
}
