package utilities;

import java.awt.AWTException;
import org.apache.commons.io.FileUtils;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;
import java.util.*;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public static WebDriver driver;
    public static Properties prop;
    public static WebDriverWait wait;

    public void openBrowser(String browserName) throws AWTException {

        if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.setHeadless(false);
            // options.addArguments("--start-maximized");
            options.addArguments("--window-size=1920,1080");
            // options.addArguments("disable-gpu");

            //Change download file path
            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            chromePrefs.put("download.default_directory", System.getProperty("user.dir") + File.separator + "Downloads");

            options.setExperimentalOption("prefs", chromePrefs);

            driver = new ChromeDriver(options);


        } else if (browserName.equalsIgnoreCase("headless")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(new ChromeOptions().setHeadless(true));

        }

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    public void openURL(String url) {
        driver.get(url);

    }

    public String takeScreenShotReturnPath() throws Exception {
        String screenShotFolder = System.getProperty("user.dir") + "//src//test//resources//ScreenShot//";
        Date date = new Date();
        Long time = date.getTime();
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String imagePath = screenShotFolder + time + ".png";
        FileUtils.copyFile(scrFile, new File(imagePath));
        return imagePath;
    }

    public void enterText(By loc, String data) {
        driver.findElement(loc).clear();
        driver.findElement(loc).sendKeys(data);
    }

    public void click(By webElement) {
        driver.findElement(webElement).click();
    }

    public void switchToTab(int tab) {
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(tab));
    }

    public boolean isElementActive(By loc, boolean flag) {
        return driver.findElement(loc).isEnabled();

    }

    public void Actionclick(By loc) {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(loc);
        actions.moveToElement(element).click().build().perform();
    }

    public void selectByText(By locator, String data) {
        new Select(driver.findElement(locator)).selectByVisibleText(data);
    }

    public void selectByIndex(By locator, int no) throws Exception {
        new Select(driver.findElement(locator)).selectByIndex(no);
    }

    public void selectByValue(By locator, String data) throws Exception {
        new Select(driver.findElement(locator)).selectByValue(data);
    }

    public void jsClick(By loc) {
        WebElement element = driver.findElement(loc);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
    public void scrollDown(By ele) {
        WebElement element = driver.findElement(ele);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void jsType(By loc, String data) {
        WebElement location = driver.findElement(loc);
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='" + data + "'", location);
    }

    public void waitForElement(By locator, int timer) throws Exception {

        for (int i = 0; i < timer; i++) {
            try {
                driver.findElement(locator).isDisplayed();
                break;
            } catch (RuntimeException localRuntimeException) {

                Thread.sleep(1000);
            }
        }

    }

    public boolean verifyField(String loc) {
        return driver.findElement(By.xpath(loc)).isDisplayed();
    }

    public String getAlertMessageText() {
        String str1 = null;
        str1 = driver.switchTo().alert().getText();
        return str1;
    }

    public void alertaction(String action) // you can pass ok or cancel
    {

        if (action.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (action.equals("create pack")) {

            driver.switchTo().alert().accept();
        } else if (action.equals("cancel")) {
            driver.switchTo().alert().dismiss();
        }

    }


    public String getElementText(By locator) {
        String text = driver.findElement(locator).getText();
        return text;
    }

    public String getElementValue(By loc) {
        return driver.findElement(loc).getAttribute("value");

    }

    public String getElementinnerText(By loc) {
        return driver.findElement(loc).getAttribute("innerText");

    }

    public void pressEnterKey() throws Exception {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

    }

    public void AjaxDrpDown(By locator, String data) {

        List<WebElement> ele = driver.findElements(locator);
        for (WebElement ele1 : ele) {
            if (ele1.getText().equalsIgnoreCase(data)) {
                ele1.click();
                break;

            }

        }
    }

    public String getDropdownSelectText(By loc) {
        WebElement selectedele = new Select(driver.findElement(loc)).getFirstSelectedOption();
        return selectedele.getText();
    }

    public String getDropdownSelectValue(By loc) {
        WebElement selectedele = new Select(driver.findElement(loc)).getFirstSelectedOption();
        return selectedele.getAttribute("value");
    }




}

