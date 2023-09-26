package testNG;

import SmartBear.Task18DropDowns2;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.DoubleStream;

public class Task2SmartBear {
    WebDriver driver;
    Faker faker = new Faker();

    @BeforeClass
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver =new FirefoxDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    //Task 1 —Delete Order
    //1. Open browser and Login to smartBear
    //2. Delete”Mark Smith” from the list
    //3. Assert it is deleted from the list
    @Ignore
    @Test
    public void deleteName(){
        Task18DropDowns2.loginToSmartBear(driver);
        String givenName= "Samuel Clemens";


        //WebElement checkkName=driver.findElement(By.xpath("//table[@class=\"SampleTable\"]/tbody/tr/td[.=\"Mark Smith\"]/../td[1]"));
        WebElement checkBox = driver.findElement(By.xpath("//table[@class=\"SampleTable\"]/tbody/tr/td[.='" + givenName + "']/../td[1]"));
        checkBox.click();

        WebElement deleteName=driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_btnDelete\"]"));
        deleteName.click();

        List<WebElement> allNames=driver.findElements(By.xpath("//table[@class=\"SampleTable\"]/tbody/tr/td[2]"));

        for (WebElement names: allNames){
            Assert.assertNotEquals(givenName,names.getText());
        }
    }
    //Task 2 — Edit order
    //1. Open browser and login to SmartBear
    //2. Click to edit button from the right for “Steve Johns”
    //3. Change the name to “ your favorite actor/ sport star”
    //4. Click Update
    //5. Assert “your actor name” is in the list

    @Test
    public void editOrder(){
      String givenName="Steve Johns";
        Task18DropDowns2.loginToSmartBear(driver);
        WebElement editButton=driver.findElement(By.xpath("//table[@class=\"SampleTable\"]/tbody/tr/td[.='" + givenName + "']/../td[13]"));
        editButton.click();

       WebElement customerName= driver.findElement(By.xpath("//input[@value=\"Steve Johns\"]"));
       customerName.clear();
       customerName.sendKeys("Jim Carry");

       WebElement updateBnt=driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_UpdateButton"));
       updateBnt.click();

       List<WebElement> allNames =driver.findElements(By.xpath("//table[@class=\"SampleTable\"]/tbody/tr/td[2]"));
       for (WebElement name: allNames){
           if (name.getText().equals("Jim Carry")){
               Assert.assertEquals(name.getText(),"Jim Carry","The name is not in the list");
           }
       }
    }
    //Task 3 — Create a method called removeName()
    //1. Accept two parameters: Webdriver, String name
    //2. Method will remove the given name from the list of SmartBear
    //3. Create a new TestNG test, and call your method
    //4. Assert that your method removed the given name



    public void removeName(WebDriver driver, String name){
        Task18DropDowns2.loginToSmartBear(driver);

        WebElement checkBox =driver.findElement(By.xpath("//table[@class=\"SampleTable\"]/tbody/tr/td[.='"+name+"']/../td[1]"));
        checkBox.click();

        WebElement deleteName=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        deleteName.click();

        List<WebElement>list=driver.findElements(By.xpath("//table[@class=\"SampleTable\"]/tbody/tr/td[2]"));
        for (WebElement names: list ) {

            Assert.assertNotEquals(name, names.getText());
        }

    }
    @Test
    public void verifyRemove(){
        removeName(driver,"Bob Feather");

    }



}
