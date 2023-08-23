import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();

        // HOMEWORK TASK 2

//        Task #7 --> Zero Bank header verification
//        1. Open a Chrome browser
//        2. Go to http://zero.webappsecurity.com/login.html
//        3. Check header textExpected --> "Log in to ZeroBank"
        // 4.CLose the session

        driver.get("http://zero.webappsecurity.com/login.html");

        String textExpected="Log in to ZeroBank";
       String actualHeader= driver.findElement(By.tagName("h3")).getText();


        if (actualHeader.equals(textExpected)){
            System.out.println("Test passed");
        } else {
            System.out.println("test failed");
        }
        driver.close();







    }
}
