package com.example.ControllerDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.util.Base64;

public class ExtentReportWithBase64Screenshot {
    public static void main(String[] args) throws IOException {
        // Set up WebDriver
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();  // Use EdgeDriver, you can switch to ChromeDriver if needed
        driver.get("https://www.google.com");

        // Set up Extent Report
        String reportPath = "ExtentRepo/Report/extentReport.html";
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // Start a test
        ExtentTest test = extent.createTest("Example Test", "Test to capture screenshot in Base64");

        // Capture screenshot in Base64 format
        String base64Screenshot = captureScreenshotAsBase64(driver);

        // Add screenshot in Base64 format to the report using HTML img tag
        test.info("<img src='data:image/png;base64," + base64Screenshot + "' height='200' width='200'/>");

        // Pass the test
        test.pass("Test passed with Base64 screenshot.");

        // End the test and flush the report
        extent.flush();

        // Close WebDriver
        driver.quit();
    }

    /**
     * Captures a screenshot and returns it as a Base64 encoded string
     * @param driver WebDriver instance
     * @return Base64 encoded screenshot
     */
    public static String captureScreenshotAsBase64(WebDriver driver) {
        // Capture screenshot as a Base64 string
        TakesScreenshot screenshotTaker = (TakesScreenshot) driver;
        String base64EncodedScreenshot = screenshotTaker.getScreenshotAs(OutputType.BASE64);

        return base64EncodedScreenshot;
    }
}
