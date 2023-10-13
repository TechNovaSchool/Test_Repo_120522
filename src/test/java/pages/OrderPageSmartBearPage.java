package pages;

import Utilitis.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPageSmartBearPage {


    public OrderPageSmartBearPage (){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath="//a[.=\"Order\"]")
    public WebElement orderBtn;

    @FindBy(xpath="//select[@name=\"ctl00$MainContent$fmwOrder$ddlProduct\"]")
    public WebElement dropDown;

    @FindBy (xpath="//input[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")
    public WebElement quantityBox;
    @FindBy(xpath="//input[@class=\"btn_dark\"]")
    public WebElement calculationBtn;

    @FindBy (xpath="//input[@name=\"ctl00$MainContent$fmwOrder$txtName\"]")
    public WebElement fullName;

    @FindBy(xpath="//input[@name=\"ctl00$MainContent$fmwOrder$TextBox2\"]")
    public WebElement street;

    @FindBy(xpath="//input[@name=\"ctl00$MainContent$fmwOrder$TextBox3\"]")
    public WebElement city;


    @FindBy (xpath="//input[@name=\"ctl00$MainContent$fmwOrder$TextBox4\"]")
    public WebElement state;

    @FindBy (xpath="//input[@name=\"ctl00$MainContent$fmwOrder$TextBox5\"]")
    public WebElement zipCode;
    @FindBy(xpath="//input[@id=\"ctl00_MainContent_fmwOrder_cardList_0\"]")
    public WebElement visaBtn;

    @FindBy(xpath="//input[@name=\"ctl00$MainContent$fmwOrder$TextBox6\"]")
    public WebElement cardBtn;

    @FindBy(xpath="//input[@name=\"ctl00$MainContent$fmwOrder$TextBox1\"]")
    public WebElement dateE;

    @FindBy(xpath="//a[.=\"Process\"]")
    public WebElement processBtn;













}
