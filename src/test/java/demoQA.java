import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

public class demoQA {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"item-3\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();

        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Sample");
        driver.findElement(By.id("lastName")).sendKeys("Syed");
        driver.findElement(By.id("userEmail")).sendKeys("syed123@gmail.com");
        driver.findElement(By.id("age")).sendKeys("29");
        driver.findElement(By.id("salary")).sendKeys("3500000");
        driver.findElement(By.id("department")).sendKeys("IT");
        driver.findElement(By.id("submit")).click();

        driver.findElement(By.xpath("//*[@id=\"item-5\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"simpleLink\"]")).click();
        Set <String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        Iterator<String> itr = windowHandles.iterator();
        String parentWindow = itr.next();
        String childWindow = itr.next();

        driver.switchTo().window(childWindow);
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentWindow);

//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[3]/span/div/div[1]"));
//        jse.executeScript("arguments[0].scrollIntoView()",element);
          driver.findElement(By.xpath("//*[@id=\"app\"]/header/a")).click();

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"item-1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
        Thread.sleep(5000);
        alert.accept();
        driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
        alert.dismiss();
        driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
        alert.sendKeys("yes");
        Thread.sleep(2000);
        alert.accept();

    }
}
