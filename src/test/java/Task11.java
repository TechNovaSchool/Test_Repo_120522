import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task11 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();


        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx");

        //using here cssSelector
        driver.findElement(By.cssSelector("input[name*=\"username\"]")).sendKeys("Tester");
        driver.findElement(By.cssSelector("div>input[type=\"password\"]")).sendKeys("test");
        driver.findElement(By.cssSelector("input[class=\"button\"]")).click();
    }
}
