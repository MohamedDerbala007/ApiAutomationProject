package tests;

import io.restassured.RestAssured;
import utils.ConfigManager;

import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = ConfigManager.getProperty("base.url");
    }
}
