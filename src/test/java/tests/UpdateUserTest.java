package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class UpdateUserTest extends BaseTest {
    @Test
    public void testUpdateUser() {
        int userId = 2;
        Map<String, Object> updatedData = new HashMap<>();
        updatedData.put("name", "derbala");
        updatedData.put("job", "Senior QA Engineer");

        Response response = given()
                .contentType(ContentType.JSON)
                .body(updatedData)
                .when()
                .put("/api/users/" + userId)
                .then()
                .statusCode(200)
                .extract().response();

        Assert.assertEquals(response.jsonPath().getString("name"), "derbala");
    }
}
