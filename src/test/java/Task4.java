import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();

        //TASK
        //1. Open Chrome browser
        //2. Go to google.com
        //3. Write "apple" in search box
        //4. Click google search button
        //5. Verify title it should contain a word "apple

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("apple", Keys.ENTER);
       String expectedTitle="apple";
       String actualTitle=driver.getTitle();

       if (expectedTitle.equals(actualTitle)){
           System.out.println("Test passed");
       }else {
           System.out.println("Test fail");
       }





    }
}
