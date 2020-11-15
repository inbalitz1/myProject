package Helpers;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class temp
{
    String url="http://localhost:3000/";
    RequestSpecification httpRequest;
    Response response;

    @Test
    public void testing()
    {
        JSONObject params=new JSONObject();
        params.put("name","yourTeam");
        params.put("email","yourTeam@gmail.com");

        RestAssured.baseURI=url;
        httpRequest=RestAssured.given().auth().preemptive().basic("admin","admin");

        httpRequest.header("content-type","application/json");
        httpRequest.body(params.toJSONString());
        response=httpRequest.delete("/api/teams/2");
        //response=httpRequest.put("/api/teams/2");
        //response= httpRequest.post("/api/teams");
        //response=httpRequest.get("/api/teams/search?perpage=50&page=1");
        //System.out.println(response.getBody().asString());
        System.out.println(response.prettyPeek());
    }
}
