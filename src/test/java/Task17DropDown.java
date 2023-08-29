import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task17DropDown {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver =new FirefoxDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WebElement dropDowns=driver.findElement(By.xpath("//select[@class=\"dropdown-menu-lists\"]"));

        Select select = new Select(dropDowns);

        //select.selectByValue("python");

        //select.selectByVisibleText("C#");

      // select.selectByIndex(2);

      // WebElement firstOption= select.getFirstSelectedOption();
        //System.out.println(firstOption.getText());

        //getOptions(); method

       List<WebElement> dropDownOptions= select.getOptions();




    }
}
