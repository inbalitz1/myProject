package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class myAccountMenu
{
    @FindBy (how = How.NAME, using = "myAccount")
    public WebElement btn_myAccountMenu;
}
