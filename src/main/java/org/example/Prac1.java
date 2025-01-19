package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.*;
class Elements {
    public WebElement path(String model) {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","");
        WebDriver driver=new ChromeDriver();
        WebElement ele =driver.findElement(By.xpath("//*[text()="+model+"]/parent::a/parent::h2/parent::div//following-sibling::div[@class=\"puisg-row\"]/descendant::span[@class=\"a-price-whole\"]"));
        return ele;
    }
}

public class Prac1 {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.goibibo.com/");
//        driver.findElement(By.xpath("//input[@id =\"twotabsearchtextbox\"]")).sendKeys("iphone");
//        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[2]/div[1]/div/div/p")).click();
        WebDriverWait wait=new WebDriverWait(driver,100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[2]/div[1]/div/div/p")));

        driver.manage().window().maximize();
        Date dt=new Date();
        String fileName=dt.toString().replace(" ","-").replace(":","-");
        File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile,new File(".//screenshot"+screenshotFile+".png"));
//        String optionToSel ="Bengaluru";
        int count=0;
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[2]/div[1]/div/div/p")).sendKeys("Ben");
        List<WebElement> list=driver.findElements(By.xpath("//ul[@id=\"autoSuggest-list\"]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) list));

        for(WebElement we:list)
        {
            String curr=we.getText();
            if(curr.equals(curr)){
                count++;
                we.click();
            }
        }
        if(count!=0){
         //   System.out.println(optionToSel+ " is present");
        }
else
            System.out.println("optionToSel"+ " is not present");
    }
}






