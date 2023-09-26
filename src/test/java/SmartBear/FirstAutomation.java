package SmartBear;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstAutomation {
    public static void main(String[] args) {

        // this line will create connection between selenium and webdriver
        WebDriverManager.chromedriver().setup();

        // the below code it is the second way to reach the website
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // we create instance of chrome driver
        WebDriver driver1 = new ChromeDriver(options);

        // next line will navigate to google website
        driver1.get("https://www.google.com");

        System.out.println(driver1.getTitle());

        driver1.get("https://www.etsy.com");

        driver1.navigate().back();
        driver1.navigate().forward();
        System.out.println(driver1.getTitle());

        driver1.close();

    }




}
