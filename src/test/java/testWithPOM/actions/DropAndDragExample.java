package testWithPOM.actions;

import Utilitis.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.w3c.dom.Text;
import pages.DragAndDropPag;

public class DropAndDragExample {
    //Drag And Drop
    //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
    //2. Drag and drop the small circle to the bigger circle.
    //3. Assert:
    //-Text in the big circle changed to: “You did great!”

    DragAndDropPag dragAndDropPag =new DragAndDropPag();
    @BeforeClass
    public void setUp(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
    }
    @Test
    public void testDropAndDrug() {
        Actions action = new Actions(Driver.getDriver());
        // action.dragAndDrop(dragAndDropPag.smallCircle, dragAndDropPag.bigCircle).build().perform();
        action.moveToElement(dragAndDropPag.smallCircle).dragAndDrop(dragAndDropPag.smallCircle, dragAndDropPag.bigCircle)
                .clickAndHold().build().perform();
    }










}
