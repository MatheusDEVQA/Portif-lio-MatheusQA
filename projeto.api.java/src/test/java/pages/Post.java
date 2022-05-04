package pages;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import io.restassured.http.ContentType;

public class Post {
	
	
	
	public void metodoPostCreate(String rota, int status) {

		given().contentType(ContentType.JSON)
				.body("{\r\n" + "    \"name\": \"Matheus\",\r\n" + "    \"job\": \"QA\"\r\n" + "}").when()
				.post("https://reqres.in"+ rota)
				.then()
				.statusCode(status).assertThat()
				.body("name", equalTo("Matheus"));

	}
	public void metodoPath(String rota, int status) {
		given().contentType(ContentType.JSON)
		.body("{\r\n" + "    \"name\": \"Matheus\",\r\n" + "    \"job\": \"QA\"\r\n" + "}").when()
		.patch("https://reqres.in"+ rota)
		.then()
		.statusCode(status).assertThat()
		.body("name", equalTo("Matheus"));
	}
}
