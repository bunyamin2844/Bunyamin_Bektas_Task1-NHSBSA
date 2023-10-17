package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecurityMessagePageObjects {

    @FindBy(xpath = "//h1[@id='dialog-title']")
    public WebElement securityMessage;
}
