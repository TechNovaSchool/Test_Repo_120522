package testWithPOM.actions;

import Utilitis.Driver;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HoverOverPage;

public class HoverOverExample {
    HoverOverPage hoverOverPage = new HoverOverPage();

    @BeforeClass
    public void setUp(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/hovers");

    }

    @Test
    public void testHoverOver(){
        Actions actions = new Actions(Driver.getDriver());

         actions.moveToElement(hoverOverPage.photo1).perform();
        Assert.assertTrue(hoverOverPage.name1.isDisplayed());

        actions.moveToElement(hoverOverPage.photo2).perform();
        Assert.assertTrue(hoverOverPage.name2.isDisplayed());

        actions.moveToElement(hoverOverPage.photo3).perform();

        Assert.assertTrue(hoverOverPage.name3.isDisplayed());

    }

    @AfterClass
    public void tearDown(){
        Driver.quitDriver();
    }












}
