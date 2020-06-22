package restAPIPrac;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GETAPi {

	@Test
	public void getAPICall()
	{
		RestAssured.baseURI="https://maps.googleapis.com";
        given().
        param("location", "-33.8670522,151.1957362").        
        param("radius", "500").
        param("key","AIzaSyA505vnFt-P0dhYu0SYv9x_HviVAbsMC-Y").
        when().
        get("/maps/api/place/nearbysearch/json").
        then().assertThat()
        .statusCode(200).contentType(ContentType.JSON).body("results[0].name", equalTo("Sydney"));
	}
}
