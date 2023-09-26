package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultiWindowsHandls {
    WebDriver driver;

       //   1. Create a new class called : WindowHandlePractice
      //   2. Create new test and create setUps
      //   3. Go to https://the-internet.herokuapp.com/windows
     //    4. Assert title is “The Internet”
    //     5. Click on “Click Here” text
    //     6. Switch to the new Window
    //     7. Assert:Title is “New Window”


    @BeforeClass
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
}

    @Test
    public void windowHandle(){

        String mainWindow=driver.getWindowHandle();
         System.out.println(mainWindow);

        String actualTitle=driver.getTitle();
        String expectedTitle="The Internet";
        Assert.assertEquals(actualTitle,expectedTitle,"The Title is incorrect");

         WebElement clickBtn=driver.findElement(By.xpath("//a[.=\"Click Here\"]"));
         clickBtn.click();

    //System.out.println(driver.getTitle());

    for (String window: driver.getWindowHandles()) {
        if (!window.equals(mainWindow)) {
            driver.switchTo().window(window);

        }
    }
        Assert.assertEquals(driver.getTitle(),"New Window");

       System.out.println(driver.getTitle());

}

}
