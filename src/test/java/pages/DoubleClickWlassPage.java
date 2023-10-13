package pages;

import Utilitis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoubleClickWlassPage {

    public DoubleClickWlassPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//iframe[@id=\"iframeResult\"]")
    public WebElement iframe;
    @FindBy(xpath = "//p[@id=\"demo\"]")
    public WebElement myText;



}
