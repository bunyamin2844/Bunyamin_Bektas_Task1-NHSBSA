package stepdefinitions;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pageObjects.SecurityMessagePageObjects;

public class SecurityMessageStepDef {
    SecurityMessagePageObjects element= new SecurityMessagePageObjects();
    @Then("if user do not perform any action for certain  period should see the message {string}")
    public void ifUserDoNotPerformAnyActionForCertainPeriodShouldSeeTheMessage(String message) {

        Assert.assertTrue(element.securityMessage.isDisplayed());

    }
}
