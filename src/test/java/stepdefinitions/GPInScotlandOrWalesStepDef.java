package stepdefinitions;

import cucumber.api.java.en.Then;
import pageObjects.AllPageObjects;
import utilities.BaseClass;

public class GPInScotlandOrWalesStepDef extends BaseClass {
    AllPageObjects element=new AllPageObjects();

    @Then("users click one of the radio buttons that Is your GP practice in Scotland or Wales as {string}")
    public void usersClickOneOfTheRadioButtonsThatIsYourGPPracticeInScotlandOrWalesAs(String arg0) {
        if(arg0.equalsIgnoreCase("N")){
            click(element.gpswpo().noButton);

        }else {
            click(element.gpswpo().yesButton);
        }

    }

    }
