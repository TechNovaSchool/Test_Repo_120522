import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;

public class Java14 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver= new FirefoxDriver();

        //driver.switchTo().alert().dismiss();
        //driver.manage().window().maximize();

        driver.get("https://demoqa.com/radio-button");
        driver.findElement(By.xpath("//li[@id=\"item-1\"]")).click();

        driver.findElement(By.xpath("(//button[@title=\"Toggle\"])[1]")).click();

        driver.findElement(By.xpath("(//span[@class=\"rct-checkbox\"])[1]")).click();

        if (driver.findElement(By.xpath("(//div[@id=\"result\"])")).isDisplayed()){
            System.out.println("Test passed");
        }else {
            System.out.println("Test Failed");
        }







    }
}
