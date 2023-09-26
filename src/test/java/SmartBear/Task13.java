package SmartBear;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task13 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();

        //1. Open a Chrome browser
        //2. Go to https://the-internet.herokuapp.com/checkboxes
        //3. Verify Checkbox 2 is Checked
        //4. Click on check-box 1
        //5. Verify CheckboxOne is Checked

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        if (driver.findElement(By.xpath("(//input[2])")).isSelected()){
            System.out.println("Test1 pass");

        }else {
            System.out.println("Test 1 failed");
        }


        driver.findElement(By.xpath("(//input[1])")).click();


        if (driver.findElement(By.xpath("(//input[1])")).isSelected()){
            System.out.println("Test 2 pass");

        }else {
            System.out.println("Test 2 failed");
        }

    }
}
