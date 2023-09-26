package SmartBear;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Task15 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();
        driver.get("https://demoqa.com/radio-button");

        driver.findElement(By.xpath("//label[@for=\"impressiveRadio\"]")).click();

        System.out.println(driver.findElement(By.xpath("//p[@class=\"mt-3\"]/span")).isDisplayed());

        WebElement noRadio=driver.findElement(By.xpath("//label[@for=\"noRadio\"]"));
        if (noRadio.isSelected()){
            System.out.println("tess passed");
        }else {
            System.out.println("test fail");
        }



    }
}
