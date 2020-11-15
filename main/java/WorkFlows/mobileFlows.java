package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class mobileFlows extends commonOps
{
    @Step("login evrit application")
    public static void loginMobile (String user)
    {

        uiActions.updateText(firstPage.txt_email, getData("user"));


        uiActions.click(firstPage.btn_login);

    }

    @Step("second login page")
    public static void loginMobile2(String password)
    {
        uiActions.updateText(firstPage.txt_password, getData("pass"));
        uiActions.click(firstPage.btn_login2);
    }



}
