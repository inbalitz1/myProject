package WorkFlows;
import Extensions.dbActions;
import Utilities.commonOps;
import Extensions.uiActions;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class webFlows extends commonOps
{
    @Step("login evrit")

    public static void login (String user, String pass)
    {
        uiActions.updateText(evritLogin.txt_userName, user);
        uiActions.updateText(evritLogin.txt_password, pass);

        uiActions.click(evritLogin.btn_Login);

    }

    @Step("login evrit with DB credentials")

    public static void loginDB ()
    {


        uiActions.updateText(evritLogin.txt_userName, dbActions.getCredentials("select username, password FROM Credentials WHERE id = '2'").get(0));
        uiActions.updateText(evritLogin.txt_password, dbActions.getCredentials("select username, password FROM Credentials WHERE id = '2'").get(1));

       uiActions.click(evritLogin.btn_Login);

    }

    @Step ("buy a free book")
    public static void buyFreeBooks()
    {
        uiActions.click(evritFooter.freeBooks);
        uiActions.click(evritFooter.bookClick);
        uiActions.click(evritFooter.buyClick);
        uiActions.click(evritFooter.goToPurchase);

        //uiActions.click(evritFooter.buyClick);
        wait = new WebDriverWait(driver,10);
        uiActions.click(evritFooter.termsAndConditions);
        wait = new WebDriverWait(driver,10);
        uiActions.click(evritFooter.submitPurchase);


    }



}
