package jiraAPIS;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReusableMethods {
public static String getSessionID()
{
	RestAssured.baseURI="http://localhost:8080";
	Response res=
	given().
	body("{\"username\": \"ankit.bans90\", \"password\": \"summo2612\" }").
	header("Content-Type","application/json").
	when().post("/rest/auth/1/session").
	then().assertThat().
	statusCode(200).
	extract().response();
	JsonPath js=new JsonPath(res.asString());
	return js.getString("session.value");
}
}
