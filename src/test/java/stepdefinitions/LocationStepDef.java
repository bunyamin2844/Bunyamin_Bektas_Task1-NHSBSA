package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.AllPageObjects;
import utilities.BaseClass;

public class LocationStepDef extends BaseClass {
    AllPageObjects element = new AllPageObjects();

    @Then("users click one of the radio buttons that Which country you live in as {string}")
    public void usersClickOneOfTheRadioButtonsThatWhichCountryYouLiveInAs(String arg0) {
        switch (arg0) {
            case "England":
                click(element.lpo().england);
                break;
            case "Scotland":
                click(element.lpo().scotland);
                break;
            case "Wales":
                click(element.lpo().wales);
                break;
            case "North Ireland":
                click(element.lpo().northIreland);
                break;
        }


    }

    @And("users click on the Next button")
    public void usersClickOnTheNextButton() {
        click(element.lpo().nextButton);
    }



}

