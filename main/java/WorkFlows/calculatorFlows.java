package WorkFlows;

import Extensions.apiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import Extensions.uiActions;

public class calculatorFlows extends commonOps
{
    @Step("calculate")
    public static void calculate ()
    {
      uiActions.click(calcMain.btn_clear);
      uiActions.click(calcMain.btn_one);
      uiActions.click(calcMain.btn_plus);
      uiActions.click(calcMain.btn_nine);
      uiActions.click(calcMain.btn_result);
    }
}
