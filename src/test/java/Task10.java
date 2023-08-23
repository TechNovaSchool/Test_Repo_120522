import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task10 {
    public static void main(String[] args) {

        //TC#10
       // Search Amazon
        //1. Open browser
       // 2. Go to https://amazon.com/
        //3. Enter any search term
       // 4. Click search button
       // 5. Verify title contains the search term
       // USE CSS SELECTOR TO LOCATE WEBELEMENT

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();

        driver.get("https://amazon.com/");
        driver.findElement(By.cssSelector("..nav-search-field>input")).sendKeys("phone cover");

        driver.findElement(By.cssSelector("input[type='submit']")).click();

        System.out.println(driver.getTitle().contains("phone cover"));


    }
}
