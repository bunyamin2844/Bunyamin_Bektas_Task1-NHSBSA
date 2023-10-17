package stepdefinitions;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.AllPageObjects;
import utilities.BaseClass;

import java.util.List;

public class VerifyStepDef extends BaseClass {
    AllPageObjects element=new AllPageObjects();

    @Then("verify that users can see the result successfully")
    public void verifyThatUsersCanSeeTheResultSuccessfully() {
        List<WebElement> option1=driver.findElements(By.xpath("//div[@id='lis-advert']"));
        for(WebElement ele:option1){
            System.out.println("option1: "+ele.getText());
        }

    }
}
