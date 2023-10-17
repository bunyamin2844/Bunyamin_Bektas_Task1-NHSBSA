package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AllPageObjects;
import utilities.BaseClass;

public class MainStepDef extends BaseClass {
    AllPageObjects element=new AllPageObjects();

    @When("users click on the Start now button on the Costs Checker page")
    public void users_click_on_the_Start_now_button_on_the_Costs_Checker_page() throws InterruptedException {
        click(element.mpo().acceptCookies);
        Thread.sleep(2000);
        scrollDown(element.mpo().startButton);
        click(element.mpo().startButton);

    }



}
