package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage
{
    @FindBy(how = How.NAME, using = "email")
    public WebElement txt_userName;

    @FindBy(how = How.NAME, using = "password")
    public WebElement txt_password;

    @FindBy(how = How.XPATH, using = "//html/body/div[6]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/form/div[3]/button")
    public WebElement btn_Login;


}
