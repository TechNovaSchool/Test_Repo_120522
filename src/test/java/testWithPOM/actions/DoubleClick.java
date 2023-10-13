package testWithPOM.actions;

import Utilitis.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DoubleClickWlassPage;

import javax.swing.*;
import java.awt.dnd.DragGestureEvent;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class DoubleClick {
    //DoubleClickTest
    //// 1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
    //// 2. Switch to iframe.
    //// 3. Double-click on the text “Double-click me to change my text color.”
    //// 4. Assert: Text’s “style” attribute value contains “red”.

    DoubleClickWlassPage doubleClickWlassPage = new DoubleClickWlassPage();
    Actions action = new Actions(Driver.getDriver());


    @Test
    public void doubleClick(){
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        Driver.getDriver().switchTo().frame(doubleClickWlassPage.iframe);
        action.doubleClick(doubleClickWlassPage.myText).perform();
       // action.doubleClick(doubleClickWlassPage.myText).build().perform(); // it was old version

        Assert.assertTrue(doubleClickWlassPage.myText.getAttribute("style").contains("red"));
    }
    //    1. Go to https://the-internet.herokuapp.com/hovers
//            2. Hover over to first image
//3. Assert: “name: user1” is displayed
//4. Hover over to second image
//5. Assert:  “name: user2” is displayed
//6. Hover over to third image
//7. Confirm: “name: user3” is displayed















}
