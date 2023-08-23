import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleLocatorPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();


      //ChromeOptions options = new ChromeOptions();
      // options.addArguments("--remote-allow-origins=*");
        // driver.get("https://www.google.com");


      // driver.findElement(By.linkText("Today's Deals")).click();
      // driver.navigate().back();

       //driver.findElement(By.name("field-keywords")).sendKeys("face toner");

        //driver.findElement(By.className("pHiOh")).click();

        driver.get("https://www.etsy.com/");
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("Lights", Keys.ENTER);
        driver.findElement(By.tagName("h3"));

    }
}
