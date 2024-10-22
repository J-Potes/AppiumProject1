package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.time.Duration;

public class LongPress extends BaseTest{
    @Test
    public void longPressGesture() throws MalformedURLException, URISyntaxException{
        // Given the user taps the "Views" option
        // And the user taps the "Expandable Lists" option
        // And the user taps the "1. Custom Adapter" option
        // When the user does a long press on the "People Names" option
        // Then the "Sample menu" modal opens
    }
}
