package testNG;

import SmartBear.Task18DropDowns2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task1 {
    WebDriver driver;
      @BeforeClass
    public void setUp(){
          WebDriverManager.firefoxdriver().setup();
          driver =new FirefoxDriver();
          driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

      }
      //Task DeleteAll
    //1. Open a chrome browser
    //2. Go to :http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3. Enter username : “Tester”
    //4. Enter password: “test”
    //5. Click on logon button
    //6. Click checkAll
    //7. Click “Delete Selected”
    //8. Assert “List of orders is empty. In order to add new order use  this link.” text is displayed
      @Test
    public void deleteAllEntries(){
          Task18DropDowns2.loginToSmartBear(driver);//// login method

          WebElement checkAllBt=driver.findElement(By.cssSelector("a[href *=\"Check\"]"));
          checkAllBt.click();

          WebElement delete=driver.findElement(By.cssSelector("input[id=\"ctl00_MainContent_btnDelete\"]"));
          delete.click();

          WebElement message=driver.findElement(By.cssSelector("#ctl00_MainContent_orderMessage"));

          Assert.assertTrue(message.isDisplayed());
      }
      @AfterClass
    public void tearDown(){
          driver.quit();
      }






}
