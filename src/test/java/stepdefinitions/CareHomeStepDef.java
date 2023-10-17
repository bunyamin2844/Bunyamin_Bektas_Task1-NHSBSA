package stepdefinitions;

import cucumber.api.java.en.Then;
import pageObjects.AllPageObjects;
import utilities.BaseClass;

public class CareHomeStepDef extends BaseClass {
    AllPageObjects element=new AllPageObjects();

    @Then("users click one of the radio buttons that Do you or your partner live permanently in a care home? as {string}")
    public void usersClickOneOfTheRadioButtonsThatDoYouOrYourPartnerLivePermanentlyInACareHomeAs(String arg0) {
        if(arg0.equalsIgnoreCase("N")){
            click(element.chpo().noButton);

        }else {
            click(element.chpo().yesButton);
        }
    }
}
