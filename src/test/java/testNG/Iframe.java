package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Iframe {
    WebDriver driver;
    //    1. Create a new class called IframePractice
//2. Create new test and create setUps
//3. Go to https://the-internet.herokuapp.com/iframe
//4. Assert : “Your content goes here. “Text is displayed”
//5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
    @BeforeClass
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");


}

@Test
    public void iframePractice(){
        WebElement iframe=driver.findElement(By.cssSelector("#mce_0_ifr"));
        driver.switchTo().frame(iframe);

        //Thread.sleep(2000);

        WebElement paragraph=driver.findElement(By.xpath("//body[.=\"Your content goes here.\"]"));
        Assert.assertTrue(paragraph.isDisplayed());
        driver.switchTo().parentFrame();

        WebElement headerText=driver.findElement(By.xpath("//div[@class=\"example\"]/h3"));
        Assert.assertTrue(headerText.isDisplayed());

}



}

