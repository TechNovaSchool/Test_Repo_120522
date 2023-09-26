package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowsPractice2 {

    WebDriver driver;

    //1.Navigate to https://webdriveruniversity.com/IFrame/index.html
    //2.Assert that GREAT SERVICE! text is displayed
    //3.Assert that header WebdriverUniversity.com (IFrame) on the top is displayed
    @BeforeClass
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://webdriveruniversity.com/IFrame/index.html");
    }
    @Test
    public void test1(){

        WebElement iframe=driver.findElement(By.xpath("#frame"));
        driver.switchTo().frame(iframe);

        WebElement paragraph=driver.findElement(By.xpath("//p[.=\"GREAT SERVICE!\"]"));
        Assert.assertTrue(paragraph.isDisplayed());
        driver.switchTo().defaultContent();

        WebElement header=driver.findElement(By.xpath("//div[@class=\"navbar-header\"]"));
        Assert.assertTrue(header.isDisplayed());


    }

}
