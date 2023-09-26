package Homeworks;

import Utilitis.Config;
import Utilitis.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork2{
    ///Scenario: Verify the arithmetic calculations ( four test case in one)
    //TC1: Verify the arithmetic calculations for addition
    //        1. Navigate to https://testpages.herokuapp.com/styled/calculator
    //        2. In the fields, add two numbers (use the Faker library to generate random numbers)
    //        3. Select the arithmetic operation for addition
    //        4.Verify that the calculation result is correct using an assertion {
    //}
    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(Config.getProperty("heroUrl"));
    }
    @Test
    public void calculation(){
        Faker faker=new Faker();
        int  number1=faker.number().numberBetween(0,120);
        int number2=faker.number().numberBetween(0,120);
        String a1 =Integer.toString(number1);
        String a2= Integer.toString(number2);


        WebElement num1=Driver.getDriver().findElement(By.xpath("//input[@id=\"number1\"]"));
        WebElement num2=Driver.getDriver().findElement(By.xpath("//input[@id=\"number2\"]"));
        num1.sendKeys(a1);
        num2.sendKeys(a2);
        WebElement arithmeticDropDown= Driver.getDriver().findElement(By.xpath("//select[@id=\"function\"]"));
        Select select=new Select(arithmeticDropDown);
        select.selectByValue("plus");
        WebElement calculateBtn=Driver.getDriver().findElement(By.xpath("//input[@id=\"calculate\"]"));
        calculateBtn.click();

        WebElement result=Driver.getDriver().findElement(By.xpath("//div[@class=\"centered\"]//span"));

       Assert.assertTrue(result.isDisplayed(),"test passed");

    }
    @Test
    public void subtraction (){
        Faker faker=new Faker();
        int  number1=faker.number().numberBetween(0,120);
        int number2=faker.number().numberBetween(0,120);
        String a1 =Integer.toString(number1);
        String a2= Integer.toString(number2);

        WebElement num1=Driver.getDriver().findElement(By.xpath("//input[@id=\"number1\"]"));
        WebElement num2=Driver.getDriver().findElement(By.xpath("//input[@id=\"number2\"]"));
        num1.sendKeys(a1);
        num2.sendKeys(a2);
        WebElement arithmeticDropDown= Driver.getDriver().findElement(By.xpath("//select[@id=\"function\"]"));
        Select select=new Select(arithmeticDropDown);
        select.selectByValue("minus");
        WebElement calculateBtn=Driver.getDriver().findElement(By.xpath("//input[@id=\"calculate\"]"));
        calculateBtn.click();

        WebElement result=Driver.getDriver().findElement(By.xpath("//div[@class=\"centered\"]//span"));

        Assert.assertTrue(result.isDisplayed(),"test passed");
    }

    @Test
    public void multiplication(){
        Faker faker=new Faker();
        double number1=faker.number().numberBetween(0,1000);
        double number2=faker.number().numberBetween(0,1000);
        String a1 =Double.toString(number1);
        String a2= Double.toString(number2);

        WebElement num1=Driver.getDriver().findElement(By.xpath("//input[@id=\"number1\"]"));
        WebElement num2=Driver.getDriver().findElement(By.xpath("//input[@id=\"number2\"]"));
        num1.sendKeys(a1);
        num2.sendKeys(a2);
        WebElement arithmeticDropDown= Driver.getDriver().findElement(By.xpath("//select[@id=\"function\"]"));
        Select select=new Select(arithmeticDropDown);
        select.selectByValue("times");
        WebElement calculateBtn=Driver.getDriver().findElement(By.xpath("//input[@id=\"calculate\"]"));
        calculateBtn.click();

        WebElement result=Driver.getDriver().findElement(By.xpath("//div[@class=\"centered\"]//span"));

        Assert.assertTrue(result.isDisplayed(),"test passed");

    }
    @Test
    public void division(){
        Faker faker=new Faker();
        double number1=faker.number().numberBetween(0,1000);
        double number2=faker.number().numberBetween(0,1000);
        String a1 =Double.toString(number1);
        String a2= Double.toString(number2);

        WebElement num1=Driver.getDriver().findElement(By.xpath("//input[@id=\"number1\"]"));
        WebElement num2=Driver.getDriver().findElement(By.xpath("//input[@id=\"number2\"]"));
        num1.sendKeys(a1);
        num2.sendKeys(a2);
        WebElement arithmeticDropDown= Driver.getDriver().findElement(By.xpath("//select[@id=\"function\"]"));
        Select select=new Select(arithmeticDropDown);
        select.selectByValue("divide");
        WebElement calculateBtn=Driver.getDriver().findElement(By.xpath("//input[@id=\"calculate\"]"));
        calculateBtn.click();

        WebElement result=Driver.getDriver().findElement(By.xpath("//div[@class=\"centered\"]//span"));

        Assert.assertTrue(result.isDisplayed(),"test passed");

    }




}