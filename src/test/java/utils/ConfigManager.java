package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
    private static Properties properties = new Properties();

    static {
        try (InputStream input = ConfigManager.class.getClassLoader().getResourceAsStream("data/config.properties")) {
            if (input == null) {
                throw new RuntimeException("config.properties file not found in resources");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load properties file: " + e.getMessage());
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
