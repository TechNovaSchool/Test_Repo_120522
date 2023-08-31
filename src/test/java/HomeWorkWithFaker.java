import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWorkWithFaker {
    public static void main(String[] args) {

        Faker faker = new Faker();

        String firstName1=faker.name().firstName();

        String lastNAme1=faker.name().lastName();

        String number=faker.phoneNumber().cellPhone();

        String email=faker.expression(firstName1+lastNAme1+"@gmail.com");

        /////////---------------------------------------------///////////

        String address=faker.address().fullAddress();

        String city=faker.address().city();

        String state=faker.address().state();

        String postalCode=faker.address().zipCode().substring(0,5);

        ////////////////////////////////////////////////

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver =new FirefoxDriver();

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement firstName= driver.findElement(By.xpath("//input[@name=\"firstName\"]"));

        WebElement LastName= driver.findElement(By.xpath("//input[@name=\"lastName\"]"));

        WebElement phoneInput= driver.findElement(By.xpath("//input[@name=\"phone\"]"));

        WebElement emailInput=driver.findElement(By.xpath("//input[@id=\"userName\"]"));

        WebElement addressInput= driver.findElement(By.xpath("//input[@name=\"address1\"]"));

        WebElement cityInput=driver.findElement(By.xpath("//input[@name=\"city\"]"));

        WebElement stateInput=driver.findElement(By.xpath("//input[@name=\"state\"]"));

        WebElement zipCodeInput= driver.findElement(By.xpath("//input[@name=\"postalCode\"]"));


       firstName.sendKeys(firstName1);
       LastName.sendKeys(lastNAme1);
       phoneInput.sendKeys(number);
       emailInput.sendKeys(email);
       addressInput.sendKeys(address);
      cityInput.sendKeys(city);
      stateInput.sendKeys(state);
      zipCodeInput.sendKeys(postalCode);

      WebElement countryDropDown =driver.findElement(By.xpath("//select[@name=\"country\"]"));

      Select select = new Select(countryDropDown);
      // select.selectByVisibleText("AZERBAIJAN");
      //select.selectByIndex(10);
      select.selectByValue("CROATIA");



    }

}
