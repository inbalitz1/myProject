package SanityTests;

import Extensions.Verifications;
import Utilities.commonOps;
import WorkFlows.electronFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import WorkFlows.calculatorFlows;

@Listeners(Utilities.listeners.class)
public class calculatorDesktop extends commonOps {
    @Test(description = "test01: verify calculator's result")
    @Description("Test Description: verify calculator's result")
    public void test01_verifyCalculatorResult()
    {
        calculatorFlows.calculate();
        Verifications.textInElement(calcMain.field_result,"10");

    }
}
