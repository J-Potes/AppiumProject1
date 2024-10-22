package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class AppiumBasics extends BaseTest{
    @Test
    public void wifiSettingsName() throws MalformedURLException, URISyntaxException {
        // Actual automation
        // Xpath, id, accesibilityId, classname, androidUIAutomator

        // Tap on Preference button
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

        // Tap on 3. Preference dependencies
        //driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();

        // Tap on checkbox
        driver.findElement(By.id("android:id/checkbox")).click();

        // Tap on Wifi Settings option
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();

        // Verify that the modal title is correct
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");

        // Tap on Wifi text field and send text
        driver.findElement(By.id("android:id/edit")).click();
        driver.findElement(By.id("android:id/edit")).sendKeys("JJ Wifi");

        // Tap on the OK button
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
    }
}
