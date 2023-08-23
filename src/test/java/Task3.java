import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task3 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();
        driver.get("https://google.com");
        driver.findElement(By.linkText("Gmail")).click();
        System.out.println(driver.getTitle().contains("Gmail"));

        driver.navigate().back();
        System.out.println(driver.getTitle().contains("Google"));
        driver.navigate().forward();
        System.out.println(driver.getTitle().contains("Gmail"));

    }
}
