import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


public class ReportingExample {
    public static void main(String[] args) {
        Logger logger=  LogManager.getLogger(ReportingExample.class);
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extent1.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        ExtentTest test = extent.createTest("My First Test", "Sample description");
        test.pass("Test passed");

        WebDriverManager.chromedriver().setup();
          logger.info("logger info");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

       extent.flush(); // Writes everything to the log file
    }
}
