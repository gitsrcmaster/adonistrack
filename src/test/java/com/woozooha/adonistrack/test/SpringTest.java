package com.woozooha.adonistrack.test;

import static com.jayway.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import com.woozooha.adonistrack.test.spring.Application;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT, classes = { Application.class })
public class SpringTest {

    String baseUri = "http://localhost:8080";

    @Test
    public void greetingWithText() {
        String name = "world";
        String content = greeting(name);
        assertEquals("Hello, " + name + "!", content);
    }

    @Test(expected = IllegalArgumentException.class)
    public void greetingWithNull() {

        greeting(null);
    }

    private String greeting(String name) {
        Response response = request().post("/greeting?name={name}", name);
        JsonPath jsonPath = response.jsonPath();
        String content = jsonPath.get("content");

        return content;
    }

    private RequestSpecification request() {
        RequestSpecification spec = new RequestSpecBuilder().setBaseUri(baseUri).build();
        RequestSpecification request = given().spec(spec).log().all().contentType(MediaType.APPLICATION_JSON_VALUE);

        return request;
    }

}
