import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Set;

public class FirstAutomationPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver2=new ChromeDriver(options);

        // task1

         driver2.get("https://www.google.com");
        System.out.println(driver2.getTitle());

        // task2

       // driver2.get("http://www.technovaschool.com/");

        //System.out.println(driver2.getTitle());


        //----------------------------------------------------

        if (driver2.getTitle().equals("Google")){
            System.out.println(" successfully passed");
        }else {
            System.out.println("Test failed");
        }





    }
}
