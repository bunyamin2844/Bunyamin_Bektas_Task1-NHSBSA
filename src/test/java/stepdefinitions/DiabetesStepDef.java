package stepdefinitions;

import cucumber.api.java.en.Then;
import pageObjects.AllPageObjects;
import utilities.BaseClass;

public class DiabetesStepDef extends BaseClass {
    AllPageObjects element = new AllPageObjects();

    @Then("users click one of the radio buttons that Do you have diabetes as {string}")
    public void usersClickOneOfTheRadioButtonsThatDoYouHaveDiabetesAs(String arg0) {
        if(arg0.equalsIgnoreCase("N")){
            click(element.dpo().noButton);

        }else {
            click(element.dpo().yesButton);
        }
    }
}
