package tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class GetUserErrorTest extends BaseTest {

    @Test
    public void testGetNonExistentUser() {
        int invalidUserId = 99999;

        Response response = given()
                .when()
                .get("/api/users/" + invalidUserId)
                .then()
                .extract().response();

        int actualStatusCode = response.getStatusCode();
        System.out.println("Response Body (Non-Existent User): " + response.asString());

        Assert.assertEquals(actualStatusCode, 404, "Expected a 404 Not Found for a non-existent user.");
    }
}
