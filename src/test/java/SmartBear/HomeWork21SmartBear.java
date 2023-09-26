package SmartBear;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork21SmartBear {
    public static void main(String[] args) {

        //Preconditions:
        //Add two more addtional methods for SmartBear Task, similar to what we did for login method
        //Navigate to : http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        //Login (use existing method)
        //
        //TC#4: Method: verifyOrder
        //1. Create a method named verifyOrder that takes WebDriver object and String(name).
        //2. This method should verify if given name exists in orders.
        //--------------------------
        //TC #5: Method: printNamesAndCities
        //1. Create a method named printNamesAndCities that takes WebDriver object.
        //2. This method should simply print all the names in the List of All Orders.
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        Task18DropDowns2.loginToSmartBear(driver);
        verifyOrder(driver, "Bob Feathermm");
        printNamesAndCities(driver);


    }


    public static void verifyOrder(WebDriver driver, String givenName) {

        List<WebElement> nameList = driver.findElements(By.xpath("//table[@class=\"SampleTable\"]/tbody/tr/td[2]"));
        for (WebElement name : nameList) {
            if (name.getText().equals(givenName)) {
                System.out.println(givenName + " exist in the list ");
                return;
            }
        }
            System.out.println("The name is not in the list");
    }




        public static void printNamesAndCities (WebDriver driver){
         List<WebElement> allNames =driver.findElements(By.xpath("//table[@class=\"SampleTable\"]/tbody/tr/td[2]"));

         List<WebElement> cityNames =driver.findElements(By.xpath("//table[@class=\"SampleTable\"]/tbody/tr/td[7]"));

         for (int i=0;i<cityNames.size();i++){
             System.out.println(allNames.get(i).getText()+ " Lives in "+ cityNames.get(i).getText());
         }







        }
}

