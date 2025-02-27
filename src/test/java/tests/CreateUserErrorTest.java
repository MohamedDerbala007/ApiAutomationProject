package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class CreateUserErrorTest extends BaseTest {

    @Test
    public void testInvalidUserCreation() {
        Response response = given()
                .contentType(ContentType.JSON)
                .body("{}") // Sending empty JSON
                .when()
                .post("/api/users")
                .then()
                .extract().response();

        int actualStatusCode = response.getStatusCode();
        System.out.println("Response Body: " + response.asString());

        Assert.assertNotEquals(actualStatusCode, 400, "Reqres API does not return 400 for an empty JSON request.");
    }

    @Test
    public void testInvalidUserCreationWithMalformedJSON() {
        Response response = given()
                .contentType(ContentType.JSON)
                .body("{ invalidJson: }") // Malformed JSON
                .when()
                .post("/api/users")
                .then()
                .extract().response();

        int actualStatusCode = response.getStatusCode();
        System.out.println("Response Body (Malformed JSON): " + response.asString());

        // If Reqres API handles malformed JSON correctly, it should return 400
        Assert.assertEquals(actualStatusCode, 400, "Expected a 400 Bad Request for malformed JSON.");
    }
}
