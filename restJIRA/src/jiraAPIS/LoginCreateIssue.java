package jiraAPIS;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class LoginCreateIssue {

	@Test(invocationCount = 2)
	public void createIssue()
	{
		RestAssured.baseURI="http://localhost:8080";
		System.out.println(ReusableMethods.getSessionID());
		given().
		header("Content-Type", "application/json").
		header("Cookie","JSESSIONID="+ReusableMethods.getSessionID()+"").
        body("{\"fields\":{\"project\":{\"key\":\"TES\"},\"summary\":\"REST ye merrfffffy gentlemen.\",\"description\":\"Creating of an issue using project keys and issue type names using the REST API\",\"issuetype\":{\"name\":\"Bug\"}}}").
       when().
       post("/rest/api/2/issue/").
       then().assertThat().statusCode(201).contentType(ContentType.JSON);
	   
		
	}
}
