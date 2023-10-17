package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Hooks extends BaseClass {


    private static ExtentTest test;
    private static int count = 1;
    private String screenCapPath;

    public Hooks() {

        try (FileInputStream fis = new FileInputStream("config.properties")) {
            prop = new Properties();
            prop.load(fis);
            System.out.println("config file open");
        } catch (FileNotFoundException e) {
            System.out.println("config properties file not found");
        } catch (IOException e) {
            System.out.println("Problem reading config properties file");
        }
    }

    @Before
    public void setup(Scenario scenario) throws Throwable {

        openBrowser(prop.getProperty("browser"));
        System.out.println("open browser");
        openURL(prop.getProperty("url"));

        System.out.println("open URL");


    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            screenCapPath = takeScreenShotReturnPath();
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
            test.log(Status.FAIL, MarkupHelper.createLabel(" FAILED ", ExtentColor.RED));
            test.addScreenCaptureFromPath(screenCapPath);
        }

        driver.quit();

    }

}


