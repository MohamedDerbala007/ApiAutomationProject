package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class UpdateUserErrorTest extends BaseTest {

    @Test
    public void testUpdateNonExistentUser() {
        int invalidUserId = 99999;

        String requestBody = "{ \"name\": \"Updated Name\", \"job\": \"Updated Job\" }";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .put("/api/users/" + invalidUserId)
                .then()
                .extract().response();

        int actualStatusCode = response.getStatusCode();
        System.out.println("Response Body (Update Non-Existent User): " + response.asString());

        Assert.assertNotEquals(actualStatusCode, 201, "Expected no new user creation on updating a non-existent user.");
    }
}
