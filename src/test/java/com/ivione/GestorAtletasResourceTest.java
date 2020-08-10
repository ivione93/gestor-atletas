package com.ivione;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.h2.H2DatabaseTestResource;

@QuarkusTestResource(H2DatabaseTestResource.class)
@QuarkusTest
public class GestorAtletasResourceTest {

    @Test
    public void testAmbitosEndpoint() {
        given()
          .when().get("/gestorAtletas/ambitos")
          .then()
             .statusCode(200);
    }

}