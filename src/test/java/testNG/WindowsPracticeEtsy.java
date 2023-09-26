package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowsPracticeEtsy {
    WebDriver driver;

   //1. Navigate to etsy.com
    //2. Verify the title of the current window
    //3. Search for a product "wooden gift box"
    //4. Click on the product any product
    //5. Switch the driver focus to new tab
    //7. Get the name of the product in printout
    @BeforeClass

    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.etsy.com");
    }



    @Test
    public void etsyWebSite(){

        //Assert.assertTrue(driver.getTitle().contains("etsy"));

        WebElement inputBtn=driver.findElement(By.xpath("//input[@id=\"global-enhancements-search-query\"]"));
        inputBtn.sendKeys("wooden gift box",Keys.ENTER);

       WebElement firstItem=driver.findElement(By.xpath("//div[@class=\"height-placeholder\"]"));
       firstItem.click();
       driver.switchTo().frame(firstItem);
       WebElement productName=driver.findElement(By.xpath("//div[@class=\"wt-mb-xs-1\"]/h1"));
       System.out.println(productName.getText());

    }








}
