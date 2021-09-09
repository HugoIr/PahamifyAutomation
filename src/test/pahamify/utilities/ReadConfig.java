package test.pahamify.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties properties;

    public ReadConfig() {
        File src = new File("Configuration/config.properties");

        try {
            FileInputStream fileInputStream = new FileInputStream(src);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }
    }

    public String getUrl() {
        return properties.getProperty("url");
    }

    public String getDeviceName() {
        return properties.getProperty("deviceName");
    }

    public String getPlatformName() {
        return properties.getProperty("platformName");
    }

    public String getAppPackage() {
        return properties.getProperty("appPackage");
    }

    public String getAppActivity() {
        return properties.getProperty("appActivity");
    }

    public boolean isNoReset() {
        return Boolean.parseBoolean(properties.getProperty("noReset"));
    }

    public String getEmail() {
        return properties.getProperty("email");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }
}
