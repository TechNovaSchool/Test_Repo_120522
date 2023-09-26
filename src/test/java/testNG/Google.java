package testNG;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Google {
    WebDriver driver;
    Faker faker=new Faker();

    @BeforeClass
    public void setUp(){
/*

        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
*/
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("intl.accept_languages", "en-ae");
       FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);
        driver = new FirefoxDriver(options);
        driver.get("https://www.google.com/");

    }
    @Test
    public void verifyTitle(){
        String searchValue = faker.lorem().word();
        WebElement searchBar = driver.findElement(By.cssSelector("input[name='q']"));

        searchBar.sendKeys(searchValue, Keys.ENTER);
        String actualTile = driver.getTitle();
        String expectedTitle = searchValue;

        Assert.assertTrue(actualTile.contains(expectedTitle), "Title is wrong");

    }

    @Ignore
    @Test

    public void verifyTitle2(){
        String searchValue=faker.lorem().word();

        WebElement searchBar=driver.findElement(By.cssSelector("textarea[name='q']"));

        searchBar.sendKeys(searchValue, Keys.ENTER);

        String actualTitle=driver.getTitle();

        String expectedTitle="fail";

        Assert.assertTrue(actualTitle.contains(expectedTitle),"Title is wrong");

    }




}
