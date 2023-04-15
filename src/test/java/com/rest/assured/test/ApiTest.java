package com.rest.assured.test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class ApiTest {

	int id;

	@Test
	public void verifygetallUsers() {
		given()

				.when().get("https://reqres.in/api/users?page=2")

				.then().statusCode(200).body("page", equalTo(2)).log().all();

	}

	@Test
	public void verifycreateuser() {
		HashMap data = new HashMap();
		data.put("name", "Sourabh");
		data.put("job", "QA");

		id = given().contentType("application/json").body(data)

				.when().post("https://reqres.in/api/users").jsonPath().getInt("id");

	}

	@Test(dependsOnMethods = { "createuser" })
	public void verifyupdateUser() {
		HashMap data = new HashMap();
		data.put("name", "Sourabh");
		data.put("job", "QA");

		given().contentType("application/json").body(data)

				.when().post("https://reqres.in/api/users/" + id).then().statusCode(201).log().all();

	}

	@Test
	public void verifydeleteuser() {
		given().when().delete("https://reqres.in/api/users/" + id).then().statusCode(204).log().all();

	}

	// POST request body using Hashmap
	@Test
	public void verifytestPostusingHahmap() {
		HashMap data = new HashMap();
		data.put("email", "janet.weaver@reqres.in");
		data.put("first_name", "Janet");
		data.put("last_name", "Weaver");
		given().contentType("application/json;charset=utf-8").body(data)

				.when().post("https://reqres.in/api/users/2")

				.then().statusCode(201).body("email", equalTo("janet.weaver@reqres.in"))
				.body("first_name", equalTo("Janet")).body("last_name", equalTo("Weaver"))
				.header("Content-Type", "application/json; charset=utf-8").log().all();
	}

	@Test
	public void verifytestCookies() {
		given().when().get("https://www.google.com")

				.then().cookie("AEC", "afsgjwwwr4hhjmmnnddsa") // cookies value always change every time new value and
																// test case fail means test case pass
				.log().all();
	}

	@Test
	public void verifytestlogs() {
		given().when()

				.get("https://reqres.in/api/users?page=2&id=5").then()

				// .log().body();
				// .log().cookies();
				// .log().headers();
				.log().all();
	}
}
