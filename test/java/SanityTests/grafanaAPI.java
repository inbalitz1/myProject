package SanityTests;

import Extensions.Verifications;
import Utilities.commonOps;
import WorkFlows.apiFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class grafanaAPI extends commonOps
{
//    @Test (description = "Test01: Get team from Grafana")
//    @Description ("Test Description: login to Grafana and get team")
//    public void test01_GetTeam()
//    {
//        Verifications.text (apiFlows.getTeamProperty("teams[0].name"),"myTeam");
//
//    }

    @Test (description = "Test01: Add team and verify")
    @Description ("Test Description: Add team to Grafana and verify it")
    public void test01_addTeamAndVerify()
    {
        apiFlows.postTeam("mitzy", "mitzy@mitz.com");
        Verifications.text (apiFlows.getTeamProperty("teams[0].name"),"mitzy");
    }

//    @Test (description = "Test02: Update team and verify")
//    @Description ("Test Description: Update team in Grafana and verify it")
//    public void test02_addTeamAndVerify()
//    {
//        apiFlows.updateTeam("kippyBenkipod", "mitzy@mitz.com", "6");
//        Verifications.text (apiFlows.getTeamProperty("teams[0].name"),"kippyBenkipod");
//    }
//
//    @Test (description = "Test03: delete team and verify")
//    @Description ("Test Description: delete team in Grafana and verify it")
//    public void test03_deleteTeamAndVerify()
//    {
//        apiFlows.deleteTeam("6");
//        Verifications.text (apiFlows.getTeamProperty("totalCount"),"1");
//    }
}
