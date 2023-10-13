package testWithPOM;

import Utilitis.Config;
import Utilitis.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicElementPage;

public class ThreadSleepExample {

    @Test
    public void treadSleep() throws InterruptedException {

        DynamicElementPage dynamicElementPage = new DynamicElementPage();

        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");
        dynamicElementPage.startBnt.click();
        Thread.sleep(7000);

        String actualText=dynamicElementPage.helloText.getText();

        Assert.assertEquals(actualText,"Hello World!");


    }





}
