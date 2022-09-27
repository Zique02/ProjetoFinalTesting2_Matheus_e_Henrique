package com.testAPI;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OverviewAccountAll {

    static final String URLActivityAccount = "https://parabank.parasoft.com/parabank/overview.htm";
    @Test
    public void TestActivityAccount() {
        Response response = given()
                .cookie("JSESSIONID", "1EF6EDDAA804F5FFDCBE386EF89417CF")
                .when()
                .get(URLActivityAccount)
                .then()
                .extract().response();
        response.prettyPrint();
        System.out.println(response.getStatusCode());
        assertEquals(response.getStatusCode(), 200);
    }

}
