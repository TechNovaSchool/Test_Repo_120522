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
import org.testng.annotations.TestInstance;

public class HomeWork2{
    ///Scenario: Verify the arithmetic calculations ( four test case in one)
    //TC1: Verify the arithmetic calculations for addition
    //        1. Navigate to https://testpages.herokuapp.com/styled/calculator
    //        2. In the fields, add two numbers (use the Faker library to generate random numbers)
    //        3. Select the arithmetic operation for addition
    //        4.Verify that the calculation result is correct using an assertion {
    //}

    private WebElement num1;
    private WebElement num2;
    private WebElement arithmeticDropDown;
    private WebElement calculateBtn;
    private WebElement result;

    @BeforeClass
    public void setUp(){

        Driver.getDriver().get(Config.getProperty("heroUrl"));
        num1=Driver.getDriver().findElement(By.xpath("//input[@id=\"number1\"]"));
        num2=Driver.getDriver().findElement(By.xpath("//input[@id=\"number2\"]"));
        arithmeticDropDown= Driver.getDriver().findElement(By.xpath("//select[@id=\"function\"]"));
        calculateBtn = Driver.getDriver().findElement(By.xpath("//select[@id=\"function\"]"));
       result = Driver.getDriver().findElement(By.xpath("//div[@class=\"centered\"]//span"));





    }

    @Test
    public void testArithmeticOperation(String operation){
        Faker faker = new Faker();
        double number1=faker.number().numberBetween(0,1000);
        double number2=faker.number().numberBetween(0,1000);

        num1.sendKeys(Double.toString(number1));
        num2.sendKeys(Double.toString(number2));

        Select select = new Select(arithmeticDropDown);
        select.selectByValue(operation);
        calculateBtn.click();
        Assert.assertTrue(result.isDisplayed(),"test passed for operation"+operation);

    }

    @Test
    public void addition (){
        testArithmeticOperation("plus");





    }

    @Test
    public void subtraction (){
        testArithmeticOperation("minus");


    }

    @Test
    public void multiplication(){
        testArithmeticOperation("times");


    }
    @Test
    public void division(){
        testArithmeticOperation("divide");


    }




}