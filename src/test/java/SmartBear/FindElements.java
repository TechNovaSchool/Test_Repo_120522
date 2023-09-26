package SmartBear;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();

        driver.get("https://www.google.com/");
        List<WebElement>list=driver.findElements(By.xpath("//body//a"));

        int expectedValue=21;
        int actualSize=list.size();
        System.out.println(actualSize);

        if (expectedValue==actualSize){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

    }
}
