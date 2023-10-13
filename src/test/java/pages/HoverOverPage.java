package pages;

import Utilitis.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class HoverOverPage {
    public HoverOverPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//div[@class=\"example\"]/div)[1]")
    public WebElement photo1;

    @FindBy(xpath = "(//div[@class=\"example\"]/div)[2]")
    public WebElement photo2;

    @FindBy(xpath = "(//div[@class=\"example\"]/div)[3]")
    public WebElement photo3;

    @FindBy(xpath = "(//h5)[1]")
    public WebElement name1;
    @FindBy(xpath = "(//h5)[2]")
    public WebElement name2;
    @FindBy(xpath = "(//h5)[3]")
    public WebElement name3;













}
