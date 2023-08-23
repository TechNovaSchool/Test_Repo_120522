import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task12 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();


        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx");

        //using here Xpath
        driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$username\"]")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$password\"]")).sendKeys("test");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
    }
    }

