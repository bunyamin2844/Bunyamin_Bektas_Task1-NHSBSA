package stepdefinitions;

import cucumber.api.java.en.Then;
import pageObjects.AllPageObjects;
import utilities.BaseClass;

public class PartnerStepDef extends BaseClass {
    AllPageObjects element = new AllPageObjects();

    @Then("users click one of the radio buttons that Do you live with a partner as {string}")
    public void usersClickOneOfTheRadioButtonsThatDoYouLiveWithAPartnerAs(String arg0) {
        if(arg0.equalsIgnoreCase("N")){
            click(element.partnerpo().noButton);

        }else {
            click(element.partnerpo().yesButton);
        }

    }
}
