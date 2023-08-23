import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectors {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        // input login by using Css
        driver.findElement(By.cssSelector("#ctl00_MainContent_username")).sendKeys("Tester");// #id num

        driver.findElement(By.cssSelector(".button")).click();// .button





    }
}
