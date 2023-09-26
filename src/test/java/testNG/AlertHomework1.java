package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AlertHomework1 {
    WebDriver driver;

    //    Navigate to https://webdriveruniversity.com/Popup-Alerts/index.html
     //  "Click Me" on JavaScript Alert
     //"Click Me" on Modal Popup
       //"CLICK ME!" JavaScript Confirm Box and dismiss alert
       //    Assert that text "You pressed Cancel!" is displayed
    @BeforeClass
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");


    }
    @Ignore
    @Test

    public void javaSAlert(){
        //WebElement javaSAlert=driver.findElement(By.xpath("//div[@class=\"thumbnail\"]/h2"));
        WebElement clickBTN=driver.findElement(By.xpath("//div[@class=\"thumbnail\"]//div/span[.=\"CLICK ME!\"]"));
        clickBTN.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

    }
    @Ignore
    @Test
    public void modalPopUp(){

        WebElement clickBtn=driver.findElement(By.xpath("//span[@id=\"button2\"]"));
        clickBtn.click();
        WebElement alertClick=driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]"));
        alertClick.click();
    }
    @Test
    public void confirmationBox(){
        WebElement clickBTN=driver.findElement(By.xpath("//span[@id=\"button4\"]"));
        clickBTN.click();
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        String expectedValue="You pressed Cancel!";
        WebElement messageResult=driver.findElement(By.xpath("//p[@id=\"confirm-alert-text\"]"));
        Assert.assertEquals(messageResult.getText(),expectedValue);


    }

















}
