package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.junit.Assert;
import org.junit.Test;

public class SampleAPITests {
	
	/**
	 * Below are hard coded examples using REST assured
	 * 
	 */

	// @Test
	public void getAllJobTitles() {

		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODYzMjA4MjEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4NjQzNjAyMSwidXNlcklkIjoiMTIyIn0.CelCSbz03KwymvH4X3siVmqaA7AdBiRpKZT5ANeULXI")
				.when().get("http://166.62.36.207/syntaxapi/jobTitle.php");

		response.prettyPrint();
		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);

	}

	// @Test
	public void getOneEmployee() {

		Response response = RestAssured.given().param("employee_id", "4355").contentType("application/json").header(
				"Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODYzMjA4MjEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4NjQzNjAyMSwidXNlcklkIjoiMTIyIn0.CelCSbz03KwymvH4X3siVmqaA7AdBiRpKZT5ANeULXI")
				.when().get("http://166.62.36.207/syntaxapi/api/getOneEmployee.php");

		response.prettyPrint();

	}

	/*
	 * TASK: getAllEmployeeStatuses Pretty print print status code
	 * 
	 */

	// @Test
	public void getALLEmployeeStatuses() {

		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODYzMjA4MjEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4NjQzNjAyMSwidXNlcklkIjoiMTIyIn0.CelCSbz03KwymvH4X3siVmqaA7AdBiRpKZT5ANeULXI")
				.when().get("http://166.62.36.207/syntaxapi/api/employeeStatus.php");
		response.prettyPrint();
		int actualStatusCode = response.getStatusCode();

		System.out.println(actualStatusCode);
	}

	@Test
	public void createEmployee() {

		Response response = RestAssured.given().urlEncodingEnabled(true).header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODYzMjA4MjEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4NjQzNjAyMSwidXNlcklkIjoiMTIyIn0.CelCSbz03KwymvH4X3siVmqaA7AdBiRpKZT5ANeULXI")

		.param("emp_firstname", "Gulje")
		.param("emp_lastname", "Atayeva")
		.param("emp_middle_name", "Gunje")
		.param("emp_gender", "2")
		.param("emp_birthday", "1999-04-04")
		.param("emp_status", "Full time Contractor")
		.param("emp_job_title", "IT Analyst")
		.contentType("application/json")
				.when().post("http://166.62.36.207/syntaxapi/api/createEmployee.php");

		response.prettyPrint();
		int actualStatusCode = response.getStatusCode();
		Assert.assertEquals(200, actualStatusCode);

	}

}
