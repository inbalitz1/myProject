package SanityTests;
import Extensions.Verifications;
import WorkFlows.electronFlows;
import org.testng.annotations.Test;
import Utilities.commonOps;
import io.qameta.allure.Description;

import org.testng.annotations.Listeners;

@Listeners (Utilities.listeners.class)
public class electronDemo extends commonOps
{
    @Test(description = "test01: verify screen resolution")
    @Description("Test Description: getting the resolution from app and verify it")
    public void test01_login()
    {
        electronFlows.getScreenInfo();
        Verifications.textInElement(electronMain.field_screen_info,"Your screen is: 1280px x 720px");

    }
}
