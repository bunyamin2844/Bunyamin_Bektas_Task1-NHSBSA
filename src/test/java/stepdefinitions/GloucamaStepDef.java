package stepdefinitions;

import cucumber.api.java.en.Then;
import pageObjects.AllPageObjects;
import utilities.BaseClass;

public class GloucamaStepDef extends BaseClass {
    AllPageObjects element=new AllPageObjects();

    @Then("users click one of the radio buttons that Do you or a family member have glaucoma? as {string}")
    public void usersClickOneOfTheRadioButtonsThatDoYouOrAFamilyMemberHaveGlaucomaAs(String arg0) {
        if(arg0.equalsIgnoreCase("N")){
            click(element.gpo().noButton);

        }else {
            click(element.gpo().yesButton);
        }
    }

}
