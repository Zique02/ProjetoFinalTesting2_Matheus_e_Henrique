package com.testAPI;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActivityAccount {

    static final String URLActivityAccount = "https://parabank.parasoft.com/parabank/services_proxy/bank/accounts/{accountId}/transactions/month/All/type/All";
    @Test
    public void TestActivityAccount() {
        Response response = given()
                .cookie("JSESSIONID", "78408D39D7C55776274209F0D959274E")
                .pathParam("accountId", "22002")
                .when()
                .get(URLActivityAccount)
                .then()
                .extract().response();
        response.prettyPrint();
        System.out.println(response.getStatusCode());
        assertEquals(response.getStatusCode(), 200);
    }

}
