package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class electronFlows extends commonOps
{
    @Step("Get screen info resolution")

    public static void getScreenInfo ()
    {
        uiActions.click(electronMain.btn_windows);

        uiActions.click(electronMain.btn_info);

        //uiActions.click(electronMain.btn_demo_toggle);
        uiActions.click(electronMain.btn_screenInfo);

    }
}
