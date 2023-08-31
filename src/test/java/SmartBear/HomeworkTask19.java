package SmartBear;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HomeworkTask19  {
    public static void main(String[] args) {
        //TC#3
        // 1. Open browser and login to smartbear software
        // 2. Click on view all orders
        // 3. Verify Susan McLaren has order on date “01/05/2010”


        //TC#2: Smartbear software order placing
        // 1.Open   browser
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //2.Go to  website:    http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        //  3.Enter username: "Tester"
        //   4.Enter password: "test"
        //    5.Click on Login button
        Task18DropDowns2.loginToSmartBear(driver);

        //    6.Click on Order
      WebElement orderButton=driver.findElement(By.xpath("//a[.=\"Order\"]"));
      orderButton.click();

      //    7.Select familyAlbum from product, set quantity to 2
        WebElement dropDown=driver.findElement(By.xpath("//select[@name=\"ctl00$MainContent$fmwOrder$ddlProduct\"]"));
        Select select= new Select(dropDown);
        select.selectByIndex(1);
        WebElement quantityBox =driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"));
        //quantityBox.clear();
        quantityBox.sendKeys(Keys.BACK_SPACE,"2");

        //    8.Click to "Calculate"button
        WebElement calculationButton= driver.findElement(By.xpath("//input[@class=\"btn_dark\"]"));
        calculationButton.click();

        //    9.Fill address Info with JavaFaker
        Faker faker = new Faker();
        String cusName=faker.name().fullName();
        String address=faker.address().streetAddress();
        String city=faker.address().city();
        String state=faker.address().state();
        String zipCode=faker.address().zipCode().substring(0,5);

        // Identify webElements: name, street, city, state, zip code
        WebElement fullName= driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$fmwOrder$txtName\"]"));
       WebElement streetInput= driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$fmwOrder$TextBox2\"]"));
       WebElement cityInput= driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$fmwOrder$TextBox3\"]"));
       WebElement stateInput= driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$fmwOrder$TextBox4\"]"));
       WebElement zipCodeInput= driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$fmwOrder$TextBox5\"]"));

       fullName.sendKeys(cusName);
       streetInput.sendKeys(address);
       cityInput.sendKeys(city);
       stateInput.sendKeys(state);
       zipCodeInput.sendKeys(zipCode);
       //  10.Click on "visa" radio button
       WebElement visaButton= driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_fmwOrder_cardList_0\"]"));
       visaButton.click();

       //11.Generate card number using JavaFaker and date
        WebElement cardNumber=driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$fmwOrder$TextBox6\"]"));
        cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));
        // 1234-1234-1234-543.replaceAll("-","")
       WebElement date= driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$fmwOrder$TextBox1\"]"));
       date.sendKeys("12/12");


        // 12.Click on "Process"

        WebElement processBtn=driver.findElement(By.xpath("//a[.=\"Process\"]"));
        processBtn.click();

        //  13.Verify success message "New order has been successfully added."
        WebElement display=driver.findElement(By.xpath("//div[@class=\"buttons_process\"]/strong"));


        if (display.isDisplayed()){
            System.out.println("Test passed");
        }
        else {
            System.out.println("test failed");
        }















    }
}
