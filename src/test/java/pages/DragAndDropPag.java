package pages;

import Utilitis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPag {
    public DragAndDropPag(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@id=\"draggable\"]")
    public WebElement smallCircle;

    @FindBy(xpath = "//div[@id=\"droptarget\"]")
    public WebElement bigCircle;


}
