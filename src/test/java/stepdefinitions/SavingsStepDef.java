package stepdefinitions;

import cucumber.api.java.en.Then;
import pageObjects.AllPageObjects;
import utilities.BaseClass;

public class SavingsStepDef extends BaseClass {
    AllPageObjects element=new AllPageObjects();


    @Then("users click one of the radio buttons that Do you and your partner have more than  in savings, investments or property? as {string}")
    public void usersClickOneOfTheRadioButtonsThatDoYouAndYourPartnerHaveMoreThanInSavingsInvestmentsOrPropertyAs(String arg0) {
        if(arg0.equalsIgnoreCase("N")){
            click(element.spo().noButton);

        }else {
            click(element.spo().yesButton);
        }
    }
}
