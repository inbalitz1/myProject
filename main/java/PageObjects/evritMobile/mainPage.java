package PageObjects.evritMobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage
{
    @FindBy(how = How.ID, using = "edittext_check_email_email")
    public WebElement txt_email;

    @FindBy(how = How.ID, using = "button_check_email_registration_or_login")
    public WebElement btn_login;

    @FindBy (how = How.ID, using = "edittext_login_password")
    public WebElement txt_password;

    @FindBy (how = How.ID, using = "button_login_login")
    public WebElement btn_login2;
}
