package Homeworks;

import Utilitis.Config;
import Utilitis.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork1 {
    //These are the homeworks 2 tasks:
    //Scenario: Upload a file using Selenium
    //1. Navigate to https://webdriveruniversity.com/File-Upload/index.html
    //2. Click on the "Choose File" button and select a .pdf file (e.g. a picture of a document, but do not upload any sensitive information)
    //3. Click on the "Submit" button
    //4. Accept the alert that appears
    //No assetion needed for this exercise.

    @BeforeClass
    public void testDriver(){
        Driver.getDriver().get(Config.getProperty("urlUniversity"));
    }

    @Test
    public void testConfig(){
        WebElement chooseFile= Driver.getDriver().findElement(By.xpath("//input[@id=\"myFile\"]"));
        chooseFile.sendKeys("C:\\Users\\Gul\\OneDrive\\Desktop\\gul photo.png");

        WebElement submit=Driver.getDriver().findElement(By.xpath("//input[@id=\"submit-button\"]"));
        submit.click();
        System.out.println("File successfully uploaded ");
        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();

    }
    @AfterClass
    public void tearDown(){
        Driver.quitDriver();
    }



}
