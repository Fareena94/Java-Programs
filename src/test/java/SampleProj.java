import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleProj {

    WebDriver driver;
    ExtentReports extent;
    public static ExtentTest test;
@BeforeMethod
public void running(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
    if (extent == null) {
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReports/Report.html");
        extent.attachReporter(spark);
    }
}
@Test
public void execute(){
driver.findElement(By.xpath("//input[@id= 'twotabsearchtextbox']")).sendKeys("Iphone under 70000");
}
  public  String screenshotCapture(ITestResult result){
      TakesScreenshot screenshot = (TakesScreenshot)driver;
      String picture = screenshot.getScreenshotAs(OutputType.BASE64);
      return picture;
  }
  @AfterMethod
    public void report(ITestResult result){
      test = extent.createTest("SampleTest", "Sample Description");
      ExtentTest extentLogger = test.createNode(result.getName());

      // Capture the screenshot and embed it in the report
      String screenshot = screenshotCapture(result);

      if (result.getStatus() == ITestResult.SUCCESS) {
          extentLogger.info("<img src='data:image/png;base64," + screenshot + "' height='200' width='200'/>");
          test.info("Test Passed").log(Status.PASS, MarkupHelper.createLabel("Test Passed", ExtentColor.GREEN));
      } else if (result.getStatus() == ITestResult.FAILURE) {
          extentLogger.info("<img src='data:image/png;base64," + screenshot + "' height='200' width='200'/>");
          test.fail("Test case failed");
          // Only call getMessage() if getThrowable() is not null
          if (result.getThrowable() != null) {
              extentLogger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable().getMessage(), ExtentColor.RED));
          }
      }

        extent.flush();
        driver.quit();
    }
}
