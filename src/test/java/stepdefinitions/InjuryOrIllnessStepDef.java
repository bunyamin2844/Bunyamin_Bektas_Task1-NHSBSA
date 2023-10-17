package stepdefinitions;

import cucumber.api.java.en.Then;
import pageObjects.AllPageObjects;
import utilities.BaseClass;

public class InjuryOrIllnessStepDef extends BaseClass {
    AllPageObjects element = new AllPageObjects();

    @Then("users click one of the radio buttons that Do you have an injury or illness caused by serving in the armed forces as {string}")
    public void usersClickOneOfTheRadioButtonsThatDoYouHaveAnInjuryOrIllnessCausedByServingInTheArmedForcesAs(String arg0) {
        if(arg0.equalsIgnoreCase("N")){
            click(element.iipo().noButton);

        }else {
            click(element.iipo().yesButton);
        }
    }
}
