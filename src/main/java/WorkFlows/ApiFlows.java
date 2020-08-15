package WorkFlows;

import Extensions.ApiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class ApiFlows extends CommonOps
{
    @Step("Get Admin's details from Server")
    public static String getAdminDetails(String JPath)
    {
        Response response = ApiActions.get("/api/users/search");
        return ApiActions.ExtractJson(response, JPath);
    }

    @Step("Get Team Data from Server")
    public static String getTeamData(String JPath)
    {
        Response response = ApiActions.get("/api/teams/search");
        return ApiActions.ExtractJson(response, JPath);
    }

    @Step("Create New Team in Grafana")
    public static void postTeam(String Name, String Email)
    {
        requestParams.put("name", Name);
        requestParams.put("email", Email);
        ApiActions.post(requestParams, "/api/teams/");
    }

    @Step("Update Team in Grafana")
    public static void updateTeam(String Name, String Email, String id)
    {
        requestParams.put("name", Name);
        requestParams.put("email", Email);
        ApiActions.put(requestParams, "/api/teams/" + id);
    }

    @Step("Delete Team from Grafana")
    public static void deleteTeam(String id)
    {
        ApiActions.delete(id);
    }
}
