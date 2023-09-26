package ConfigurationExamples;

import Utilitis.Config;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ConfigTest {
    @Test
    public void testConfig(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get(Config.getProperty("url"));


        WebElement userName=driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$username\"]"));
        WebElement password=driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$password\"]"));
        WebElement loginButton=driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$login_button\"]"));
        userName.sendKeys(Config.getProperty("login"));
        password.sendKeys(Config.getProperty("pass"));
        loginButton.click();

    }
}
