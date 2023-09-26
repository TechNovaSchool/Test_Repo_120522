package SmartBear;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task9 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();

        //Task #9 HerokuApp Url verification
//        1. Open Chrome browser
//        2. Go to https://the-internet.herokuapp.com/forgot_password
//        3. Enter any email into input box
//        4. Click on Retrieve password
//        5. Verify URL contains Expected : -->  "Internal Server Error"

        driver.get("https://the-internet.herokuapp.com/forgot_password");

        driver.findElement(By.id("email")).sendKeys("Magicdanic@gmail.com");
        driver.findElement(By.id("form_submit")).click();

        String expectedURL="Internal Server Error";
        String actualURL=driver.findElement(By.tagName("h1")).getText();

        if (actualURL.equals(expectedURL)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }



    }
}
