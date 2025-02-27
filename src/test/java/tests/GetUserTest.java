package tests;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.*;

public class GetUserTest extends BaseTest {
    @Test
    public void testGetUser() {
        int userId = 2;
        Response response = given()
                .when()
                .get("/api/users/" + userId)
                .then()
                .statusCode(200)
                .extract().response();

        assertNotNull(response.jsonPath().getString("data"));
        assertEquals(response.jsonPath().getInt("data.id"), userId);
    }
}
