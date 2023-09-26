package SmartBear;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();


        // Task #6 -- Etsy Title Verification
//        1. Open a Chrome browser
//        2. Go to https://www.etsy.com/
        driver.get("https://www.etsy.com");

//        3. Search for gift box
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("Gift box", Keys.ENTER);

//        4. Verify title --> expected Gift box | Etsy
        System.out.println(driver.getTitle());
        System.out.println(driver.getTitle().contains("Etsy United Arab Emirates"));

    }
}
