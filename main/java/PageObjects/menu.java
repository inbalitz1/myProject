package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class menu
{
    @FindBy (how = How.NAME, using = "myAccount")
    public WebElement btn_myAccountMenu;
}
