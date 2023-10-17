package stepdefinitions;

import cucumber.api.java.en.Then;
import pageObjects.AllPageObjects;
import utilities.BaseClass;

public class BenefitOrTaxStepDef extends BaseClass {
    AllPageObjects element = new AllPageObjects();

    @Then("users click one of the radio buttons that Do you or your partner claim any benefits or tax credits as {string}")
    public void usersClickOneOfTheRadioButtonsThatDoYouOrYourPartnerClaimAnyBenefitsOrTaxCreditsAs(String arg0) {
        if(arg0.equalsIgnoreCase("N")){
            click(element.btpo().noButton);

        }else {
            click(element.btpo().yesButton);
        }
    }
}
