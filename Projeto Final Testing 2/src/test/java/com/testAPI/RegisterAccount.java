package com.testAPI;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterAccount {

    static final String URL = "https://parabank.parasoft.com/parabank/register.htm";

    @Test
    public void test() {

        String firstName = "8";
        String lastName =  "8";
        String street = "8";
        String city =  "8";
        String state = "8";
        String zipCode =  "8";
        String phoneNumber =  "8";
        String ssn = "8";
        String password = "8";
        String username = "486";

        Response response = given()
                .cookie("JSESSIONID", "4CB0EBFA092F9D33300CFB04DF606388")
                .contentType(ContentType.URLENC).
                formParam("custumer.firstName", firstName).
                formParam("custumer.lastName", lastName).
                formParam("custumer.address.street", street).
                formParam("custumer.address.city", city).
                formParam("custumer.address.state", state).
                formParam("custumer.address.zipCode", zipCode).
                formParam("custumer.phoneNumber", phoneNumber).
                formParam("custumer.ssn", ssn).
                formParam("custumer.username", username).
                formParam("custumer.password", password).
                formParam("repeatedPassword", password).
                post(URL).
                then()
                .extract().response();
        int statusCode = response.getStatusCode();
        System.out.println(response.getCookie("jsessionid"));
        System.out.println(statusCode);
        response.prettyPrint();
        assertEquals(response.getStatusCode(), 200);

    }




}
