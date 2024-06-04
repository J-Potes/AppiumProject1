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

        // PERSONAL C
        //options.setDeviceName("emulator-5554"); //Emulator
        //options.setApp("D:\\Users\\ASUS\\Desktop\\Cursos\\3_Appium Mobile Automation\\AppiumProject1\\src\\test\\java\\resources\\ApiDemos-debug.apk");

        // WORK C
        options.setDeviceName("adb-ccb76178-Fhy4eo._adb-tls-connect._tcp"); //Device physical
        options.setApp("C:\\Users\\juan.potes\\Documents\\Cursos\\Appium\\AppiumProject1\\src\\test\\java\\resources\\ApiDemos-debug.apk");

        // First create the object for Android Driver or iOS Driver
        // In this case Android Driver UiAutomator2
        // Appium code -> Appium Server -> Mobile
        // Parameters: ...new AndroidDriver( Appium server URL, Capabilities )

        // PERSONAL C
        // AndroidDriver driver = new AndroidDriver(new URI("http://192.168.0.11:4723/").toURL(), options);

        // WORK C
        AndroidDriver driver = new AndroidDriver(new URI("http://192.168.0.14:4723/").toURL(), options);
    }
}
