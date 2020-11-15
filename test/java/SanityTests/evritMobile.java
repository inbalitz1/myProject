package SanityTests;

import Extensions.Verifications;
import Utilities.commonOps;
import WorkFlows.mobileFlows;
import WorkFlows.webFlows;
import io.appium.java_client.android.AndroidElement;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class evritMobile extends commonOps {

    @Test(description = "test01: login to Evrit")
    @Description("Test Description: login to Evrit web application")
    public void test01_login()
    {

        mobileFlows.loginMobile(getData("user"));

    }

    @Test(description = "test02: login to Evrit")
    @Description("Test Description: login to Evrit web application2")
    public void test02_login2()
    {
        mobileFlows.loginMobile2(getData("pass"));
    }

}
