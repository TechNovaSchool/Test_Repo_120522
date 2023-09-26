package SmartBear;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task5 {
    public static void main(String[] args)  {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();
        //        Task #5 -- Basic login authentication
//        1. Open a Chrome browser
//        2. Go to : http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//        3. Verify title equals -->expected "Web orders Login"
//        4. Enter username : Tester
//        5. Enter Password: test
//        6. Click "Sign In" button
//        7. Verify title equals --> expected Web Orders

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
         driver.getTitle().contains("Web orders Login");
         driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
         driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        // Thread.sleep(5000); it will help to hold for some second
         driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String expectedTitle="Web orders";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }





    }
}
