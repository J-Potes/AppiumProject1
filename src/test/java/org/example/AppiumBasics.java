package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Capabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class AppiumBasics {
    @Test
    public void appiumTest() throws MalformedURLException, URISyntaxException {

        // Specify capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 4a API 33"); //Emulator

        // First create the object for Android Driver or iOS Driver
        // In this case Android Driver UiAutomator2
        // Appium code -> Appium Server -> Mobile
        // Parameters: ...new AndroidDriver( Appium server URL, Capabilities )
        AndroidDriver driver = new AndroidDriver(new URI("https://127.0.0.1:4723").toURL(), options);
    }
}
