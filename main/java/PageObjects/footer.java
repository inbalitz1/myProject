package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class footer {
    @FindBy (how = How.LINK_TEXT, using = "ספרים בחינם")
    public WebElement freeBooks;

    @FindBy (how = How.XPATH, using = "/html/body/div[5]/div[3]/div/div[2]/div[1]/div[3]/div/div/div[1]/a/img")
    public WebElement bookClick;

    @FindBy (how = How.XPATH, using="/html/body/div[5]/div[4]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div[1]/div[1]/div")
    public WebElement buyClick;

    @FindBy (how= How.XPATH, using = "/html/body/div[5]/div[3]/div/div/div[2]/div[6]/div[1]/label")
    public WebElement termsAndConditions;

    @FindBy(how = How.XPATH, using = "/html/body/div[5]/div[3]/div/div/div[2]/a")
    public WebElement submitPurchase;

    @FindBy (how = How.XPATH, using="/html/body/div[2]/div/div[3]/div[4]/a/i")
    public WebElement goToPurchase;

}
