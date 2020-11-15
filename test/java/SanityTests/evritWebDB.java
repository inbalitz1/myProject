package SanityTests;

import Extensions.Verifications;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utilities.commonOps;

import java.sql.SQLException;


@Listeners(Utilities.listeners.class)
public class evritWebDB extends commonOps {

    @Test(description = "test01: login to Evrit")
    @Description("Test Description: login to Evrit web application")
    public void test01_loginDB() throws SQLException {



        driver.findElement(By.name("myAccount")).click();
        webFlows.loginDB();


        Verifications.textInElement(evritMain.txt_mainHeading,"קוראים ממליצים");

    }
}
