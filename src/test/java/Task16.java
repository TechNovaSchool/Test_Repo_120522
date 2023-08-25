import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Task16 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();

        //        Task #14 - Check all link on the page
//        Open Chrome browser
//        Go to https://www.technovaschool.com/
//        Count the number of the links on the web-page (expected 41)
//        Print out all the texts of the links on the page


        driver.get(" https://www.technovaschool.com/");

        driver.manage().window().maximize();

        List<WebElement>links=driver.findElements(By.xpath("//body//a"));

        int expected=30;
        int actual=links.size();

        System.out.println(actual);
        if (expected==actual){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

        //Count the number of the links that doesn’t have text (expected 19)

        int LinkWithoutText=0;

        for (WebElement link:links){
            System.out.println(link.getText());
            if (link.getText().isEmpty()){
                LinkWithoutText++;
            }

        }
        System.out.println(LinkWithoutText);

        if (LinkWithoutText==17){
            System.out.println("Test 2 passed");
        }else {
            System.out.println("Test 2 failed");
        }
















    }
}
