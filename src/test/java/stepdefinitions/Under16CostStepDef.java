package stepdefinitions;

import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utilities.BaseClass.driver;

public class Under16CostStepDef {

    @Then("Child should get free options as follows:")
    public void you_get_free(io.cucumber.datatable.DataTable dataTable) {
        List<String> expectedTexts = dataTable.asList(String.class);

        for (String expectedText : expectedTexts) {

            WebElement element = driver.findElement(By.xpath("//li[normalize-space(), '" + expectedText + "')]"));

            Assert.assertTrue(element.isDisplayed());
        }
    }

    @Then("Child should get money off as follows:")
    public void you_get_money_off(io.cucumber.datatable.DataTable dataTable) {
        List<String> expectedTexts = dataTable.asList(String.class);

        for (String expectedText : expectedTexts) {
            WebElement element = driver.findElement(By.xpath("//li[normalize-space(), '" + expectedText + "')]"));
            Assert.assertTrue(element.isDisplayed());
        }
    }

    @Then("Child don't automatically get help towards the cost of:")
    public void you_don_t_automatically_get_help_towards_the_cost_of(io.cucumber.datatable.DataTable dataTable) {
        List<String> expectedTexts = dataTable.asList(String.class);

        for (String expectedText : expectedTexts) {

            WebElement element = driver.findElement(By.xpath("//li[normalize-space(), '" + expectedText + "')]"));

            if (element.isDisplayed()) {
                System.out.println("'" + expectedText + "' is displayed on the page.");
            } else {
                System.out.println("'" + expectedText + "' is NOT displayed on the page.");
            }
        }
    }

}

