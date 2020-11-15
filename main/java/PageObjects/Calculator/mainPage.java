package PageObjects.Calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage {
    @FindBy(how = How.NAME, using = "נקה")
    public WebElement btn_clear;
    @FindBy(how = How.NAME, using = "אחת")
    public WebElement btn_one;
    @FindBy(how = How.NAME, using = "תשע")
    public WebElement btn_nine;
    @FindBy(how = How.NAME, using = "ועוד")
    public WebElement btn_plus;
    @FindBy(how = How.NAME, using = "שווה")
    public WebElement btn_result;
    @FindBy(how = How.XPATH, using = "//*[@AutomationId='CalculatorResults']")
    public WebElement field_result;
}
