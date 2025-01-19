import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Simple {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name=\"UserFirstName\"]")).sendKeys("standard_");
        driver.findElement(By.name("UserLastName")).sendKeys("user");
        driver.findElement(By.name("UserEmail")).sendKeys("mail2fareena94@gmail.com");
        WebElement jobTitle = driver.findElement(By.xpath("//*[@name=\"UserTitle\"]"));
        Select se1 = new Select(jobTitle);
        se1.selectByVisibleText("Student / Job Seeker / Personal Interest");
        driver.findElement(By.xpath("//input[@name=\"CompanyName\"]")).sendKeys("Student");
        driver.findElement(By.name("UserLastName")).sendKeys("user");

        Date dt=new Date();
        String fileName= dt.toString().replace(" ","_").replace(":","_");
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + fileName + ".png"));
        WebElement empCount = driver.findElement(By.xpath("//*[@name=\"CompanyEmployees\"]"));
        Select se2 = new Select(empCount);
        se2.selectByIndex(1);
        driver.findElement(By.name("UserPhone")).sendKeys("9874894754");

        WebElement country = driver.findElement(By.xpath("//*[@name=\"CompanyCountry\"]"));
        Select se3 = new Select(country);
        se3.selectByVisibleText("India");

        driver.findElement(By.xpath("//*[contains(@id,\"signup_form\")]/div[5]/div/div/div[1]")).click();
        driver.findElement(By.name("start my free trial")).click();
       // driver.quit();
    }
}
