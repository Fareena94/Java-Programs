package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration.hours;
import static org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration.seconds;

public class Automator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
      //  System.setProperties("webdriver.chrome.driver","");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']//ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']//child::span[text()='₹65,900']"));
        driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']")).click();


        Set<String> windows = driver.getWindowHandles();
        Iterator<String> itr= windows.iterator();
        String parent = itr.next();
        String child = itr.next();
        driver.switchTo().window(child);

        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text() ,'Apple iPhone 15')]")));

        FluentWait<WebDriver> wait1= new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5)).ignoring(ArithmeticException.class);

        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        Date dt=new Date();
        String fileName=dt.toString().replace(" ","_").replace(":","_");
        File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShot, new File(".//screenshot/" + fileName + ".png"));
        }
        catch(Exception e)
        {
            System.out.println("no file found"+e);
        }

       driver.switchTo().window(parent);

        driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("laptop under 35000");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        WebElement ele= driver.findElement(By.xpath("//*[text()='Intel Core i3']//preceding-sibling::div"));

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.backgroundColor = 'yellow';", ele);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[text()='Intel Core i3']//preceding-sibling::div")).click();

        File scrnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
        FileUtils.copyFile(scrnshot ,new File(".//screenhot/"+fileName+".png"));}
         catch(Exception e)
        {
            System.out.println("no file found"+e);
        }

       WebElement web= driver.findElement(By.xpath("//*[contains(text(),\"Dell 15 Thin & Light Laptop, Core i5-1235U Processor\")]/ancestor::div[contains(@class,\"a-section a-spacing-small\")]/descendant::span[text()=\"3.5 out of 5 stars\"]"));
        Actions act=new Actions(driver);
        act.contextClick(web).build().perform();


       WebElement we=  driver.findElement(By.xpath("//select[contains(@class, \"nav-search-dropdown searchSelect nav-progressive-attrubute\")]"));
        Select se= new Select(we);
        se.selectByVisibleText("Amazon Fashion");


        driver.navigate().to("https://demo.guru99.com/Agile_Project/Agi_V1/index.php");
        driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mail@gamil.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();

        driver.switchTo().alert().accept();

    }

}

