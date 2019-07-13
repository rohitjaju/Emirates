package steps;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class assignment2_apiTest {
	 
	 public void GetWeatherDetails()
	 {   
	 // base URL to the RESTful web service
	 RestAssured.baseURI = "https://itunes.apple.com";
	 
	 // Get the RequestSpecification 
	 RequestSpecification httpRequest = RestAssured.given();
	 
	 // request to the server by specifying the method Type and the method URL.
	 // This will return the Response from the server
	 Response response = httpRequest.request(Method.GET, "/search?term=jack+johnson&entity=musicVideo");
	 
	 // we have recieved from the server
	 String responseBody = response.getBody().asString();
	 System.out.println("Response Body is =>  " + responseBody);
	 
	 int statusCode = response.getStatusCode();
	 Assert.assertEquals(statusCode, 200, "Correct status code returned");
	 }
	 
	 
	 //JSON Schema validations
//Need to get precise text
	public void givenUrl_whenJsonResponseConformsToSchema_thenCorrect() {
	   // get("/events?id=390").then().assertThat().body(matchesJsonSchemaInClasspath("event_0.json"));
	}

	 
	 }

