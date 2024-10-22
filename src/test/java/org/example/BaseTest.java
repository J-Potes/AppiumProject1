package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class BaseTest {
    public AndroidDriver driver;
    public AppiumDriverLocalService service;
    @BeforeClass
    public void configureAppium() throws URISyntaxException, MalformedURLException {
        String ipAdressAppium = "127.0.0.1";

        // Code to start the server
        service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//juan.potes//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
                .withIPAddress(ipAdressAppium).usingPort(4723).build();

        service.start();

        // Specify capabilities
        UiAutomator2Options options = new UiAutomator2Options();

        // Device
        //options.setDeviceName("emulator-5554"); //Emulator
        options.setDeviceName("ccb76178"); //Device physical

        // PERSONAL C
        //options.setApp("D:\\Users\\ASUS\\Desktop\\Cursos\\3_Appium Mobile Automation\\AppiumProject1\\src\\test\\java\\resources\\ApiDemos-debug.apk");

        // WORK C
        //String apkPath = "C:\\Users\\juan.potes\\Documents\\Courses\\Appium_MobileTesting\\AppiumProject1\\src\\test\\resources\\ApiDemos-debug.apk";
        String apkPath = Paths.get("src", "test", "resources", "ApiDemos-debug.apk").toAbsolutePath().toString();
        options.setApp(apkPath);
        System.out.println("PATH: " + apkPath);

        options.setAutomationName("UiAutomator2");

        // First create the object for Android Driver or iOS Driver
        // In this case Android Driver UiAutomator2
        // Appium code -> Appium Server -> Mobile
        // Parameters: ...new AndroidDriver( Appium server URL, Capabilities )

        // PERSONAL C
        // AndroidDriver driver = new AndroidDriver(new URI("http://192.168.0.11:4723/").toURL(), options);

        // WORK C
        String unifiedURL = "http://" + ipAdressAppium + ":4723";
        System.out.println("Unified URL: " + unifiedURL);
        driver = new AndroidDriver(new URL(unifiedURL), options);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();

        // Stop server
        service.stop();
    }
}
