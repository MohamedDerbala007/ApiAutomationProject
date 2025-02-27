package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class CreateUserTest extends BaseTest {
    @Test
    public void testCreateUser() {
        Map<String, Object> user = new HashMap<>();
        user.put("name", "mohamed");
        user.put("job", "QA Engineer");

        Response response = given()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .extract().response();

        Assert.assertNotNull(response.jsonPath().getString("id"));
        Assert.assertEquals(response.jsonPath().getString("name"), "mohamed");
    }
}
