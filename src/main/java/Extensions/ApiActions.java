package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class ApiActions extends CommonOps
{
    @Step("Get Data from Server")
    public static Response get(String ParamValues)
    {
        response = httpRequest.get(ParamValues);
        System.out.println(response.prettyPrint());
        return response;
    }

    @Step("Extract Values from Json Format")
    public static String ExtractJson(Response response, String Path)
    {
        jp = response.jsonPath();
        return jp.get(Path).toString();
    }

    @Step("Post Data to Server")
    public static void post(JSONObject Params, String Resource)
    {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(Params.toString());
        response = httpRequest.post(Resource);
        System.out.println(response.prettyPrint());
    }

    @Step("Update Data in Server")
    public static void put(JSONObject Params, String Resource)
    {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(Params.toString());
        response = httpRequest.put(Resource);
        System.out.println(response.prettyPrint());
    }

    @Step("Delete Data From Server")
    public static void delete(String id)
    {
        response = httpRequest.delete("/api/teams/" + id);
        System.out.println(response.prettyPrint());
    }
}
