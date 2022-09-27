package com.testAPI;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransferFunds {
    static final String URLTransferirFundos = "https://parabank.parasoft.com/parabank/services_proxy/bank/transfer?fromAccountId={fromAccountId}&toAccountId={toAccountId}&amount={amount}";

@Test
    public void TranferFunds() {
                Response response = given().with()
                .cookie("JSESSIONID", "1EF6EDDAA804F5FFDCBE386EF89417CF")
                .pathParam("fromAccountId", "14232")
                .pathParam("toAccountId", "14343")
                .pathParam("amount", "50")
                .when()
                .post(URLTransferirFundos)
                .then()
                .extract().response();
                int statusCode = response.getStatusCode();
                System.out.println(statusCode);
                System.out.println(response.prettyPrint());
                assertEquals(response.getStatusCode(), 200);

}

}
