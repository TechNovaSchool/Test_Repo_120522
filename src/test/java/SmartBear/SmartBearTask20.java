package SmartBear;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmartBearTask20 {
    public static void main(String[] args) {

        //TC#3
        // 1. Open browser and login to smartbear software
        // 2. Click on view all orders
        // 3. Verify Susan McLaren has order on date “01/05/2010”

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.manage().window().maximize();
        Task18DropDowns2.loginToSmartBear(driver);

        WebElement susanDateInTable=driver.findElement(By.xpath("//td[.=\"Susan McLaren\"]/../td[5]"));
        String actualDate=susanDateInTable.getText();
        String expectedDate="01/05/2010";
        if (actualDate.equals(expectedDate)){
            System.out.println("Test Passed");
        }else {
            System.out.println("TEst Passed");
        }

        WebElement allColumn=driver.findElement(By.xpath("//*[@class=\"SampleTable\"]//tbody/tr/td[11]"));
        System.out.println(allColumn.getText());













    }
}
