package pageObjects;

import org.openqa.selenium.By;

public class DateOfBirthPageObjects {

    public By day=By.xpath("//input[@id='dob-day']");
    public By month=By.xpath("//input[@id='dob-month']");
    public By year=By.xpath("//input[@id='dob-year']");
    public By nextButton=By.xpath("//input[@id='next-button']");

}
