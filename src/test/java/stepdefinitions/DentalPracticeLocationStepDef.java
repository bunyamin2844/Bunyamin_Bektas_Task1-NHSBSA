package stepdefinitions;

import cucumber.api.java.en.Then;
import pageObjects.AllPageObjects;
import utilities.BaseClass;

public class DentalPracticeLocationStepDef extends BaseClass {
    AllPageObjects element=new AllPageObjects();

    @Then("users click one of the radio buttons that Which country is your dental practice in as {string}")
    public void usersClickOneOfTheRadioButtonsThatWhichCountryIsYourDentalPracticeInAs(String arg0) {

        switch (arg0) {
            case "England":
                click(element.dplpo().england);
                break;
            case "Scotland":
                click(element.dplpo().scotland);
                break;
            case "Wales":
                click(element.dplpo().wales);
                break;
            case "North Ireland":
                click(element.dplpo().northIreland);
                break;
            case "I am not registered with a dental practice":
                click(element.dplpo().notRegistered);

        }
    }
}
