package pages;

import Utilitis.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicElementPage {
    public DynamicElementPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//div[@id=\"start\"]/button")
    public WebElement startBnt;
    @FindBy(xpath = "//h4[.=\"Hello World!\"]")
    public WebElement helloText;




































}


