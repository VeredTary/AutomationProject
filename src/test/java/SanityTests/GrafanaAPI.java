package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.ApiFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class GrafanaAPI extends CommonOps
{
    @Test(description = "Test01: Get Admin's Details from Grafana Server")
    @Description("Test Description: Login to Grafana and Get Admin's Details")
    public void Test01_GetAdminDetails()
    {
        Verifications.Text(ApiFlows.getAdminDetails("users[0].email"), "admin@localhost");
    }

    @Test(description = "Test02: Add and Verify a New Team")
    @Description("Test Description: Add and Verify a New Team to Grafana")
    public void Test02_AddTeamandVerify()
    {
        ApiFlows.postTeam("TeamVered", "Vered@test.com");
        Verifications.Text(ApiFlows.getTeamData("teams[0].name"), "TeamVered");
    }

    @Test(description = "Test03: Update and Verify Existing Team")
    @Description("Test Description: Update and Verify an Existing Team in Grafana")
    public void Test03_UpdateTeamandVerify()
    {
        ApiFlows.updateTeam("VeredsTeam", "Vered@test.com", "16");
        Verifications.Text(ApiFlows.getTeamData("teams[0].name"), "VeredsTeam");
    }

    @Test(description = "Test04: Delete and Verify Team")
    @Description("Test Description: Delete and Verify Team from Grafana")
    public void Test04_DeleteTeamandVerify()
    {
        ApiFlows.deleteTeam("16");
        Verifications.Text(ApiFlows.getTeamData("totalCount"), "0");
    }
}
