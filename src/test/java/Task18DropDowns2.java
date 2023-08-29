import com.github.dockerjava.api.model.Link;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Task18DropDowns2 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();

        //TC    #1: Smartbear   software    link    verification
        //        1.Open   browser
        //        2.Go to  website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        // 3.Enter username: "Tester"
        //  4.Enter password: "test"
        //  5.Click to Login button
        //  6. Print out count of all the links on landing page
        //  7.Print out each link text on this page
        //
        // Mini-Task:
        //  1. Create a method called loginToSmartBear
        //   2. This method simply logs in to SmartBear when you call it
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        /*driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$username\"]")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$password\"]")).sendKeys("test");
        driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$login_button\"]")).click();

*/      loginToSmartBear(driver); /// <<--- this separate method for login and password
        List <WebElement> links= driver.findElements(By.xpath("//body//a"));
        System.out.println(links.size());
        for (WebElement link : links){
            System.out.println(link.getText());
        }
    }

    /// new method
    public static void loginToSmartBear(WebDriver driver){
        WebElement userName=driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$username\"]"));
        WebElement password=driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$password\"]"));
        WebElement loginButton=driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$login_button\"]"));
        userName.sendKeys("Tester");
        password.sendKeys("test");
        loginButton.click();

    }
}
