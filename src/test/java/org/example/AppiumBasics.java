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
        options.setDeviceName("emulator-5554"); //Emulator
        options.setApp("D:\\Users\\ASUS\\Desktop\\Cursos\\3_Appium Mobile Automation\\AppiumProject1\\src\\test\\java\\resources\\ApiDemos-debug.apk");

        // First create the object for Android Driver or iOS Driver
        // In this case Android Driver UiAutomator2
        // Appium code -> Appium Server -> Mobile
        // Parameters: ...new AndroidDriver( Appium server URL, Capabilities )
        AndroidDriver driver = new AndroidDriver(new URI("http://192.168.0.11:4723/").toURL(), options);
    }
}
