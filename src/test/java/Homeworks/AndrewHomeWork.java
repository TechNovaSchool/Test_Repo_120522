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

public class AndrewHomeWork {

    private Faker faker = new Faker();

        @BeforeClass
        public void setUp() {
            Driver.getDriver().get(Config.getProperty("heroUrl"));
        }

        @Test
        public void verifyCalculation(ArithmeticOperation operation) {
            double number1 = faker.number().numberBetween(0, 1000);
            double number2 = faker.number().numberBetween(0, 1000);

            enterNumbers(number1, number2);
            selectOperation(operation);
            clickCalculateButton();

            verifyResult(number1, number2, operation);
        }

        private void enterNumbers(double number1, double number2) {
            WebElement num1Field = Driver.getDriver().findElement(By.xpath("/input[@id=\"number1\"]"));
            num1Field.sendKeys(Double.toString(number1));

            WebElement num2Field = Driver.getDriver().findElement(By.xpath("//input[@id=\"number2\"]"));
            num2Field.sendKeys(Double.toString(number2));
        }

        private void selectOperation(ArithmeticOperation operation) {
            WebElement operationDropdown = Driver.getDriver().findElement(By.xpath("//select[@id=\"function\"]"));
            Select select = new Select(operationDropdown);
            select.selectByValue(operation.getValue());
        }

        private void clickCalculateButton() {
            WebElement calculateButton = Driver.getDriver().findElement(By.xpath("//select[@id=\"function\"]"));
            calculateButton.click();
        }
        private void verifyResult(double number1, double number2, ArithmeticOperation operation) {
            double expectedResult = performOperation(number1, number2, operation);

            WebElement resultField = Driver.getDriver().findElement(By.xpath("//div[@class=\"centered\"]//span"));
            String actualResult = resultField.getText();

            Assert.assertEquals(actualResult, Double.toString(expectedResult), "The calculation result is not correct.");
        }

        private double performOperation(double number1, double number2, ArithmeticOperation operation) {
            switch (operation) {
                case ADDITION:
                    return number1 + number2;
                case SUBTRACTION:
                    return number1 - number2;
                case MULTIPLICATION:
                    return number1 * number2;
                case DIVISION:
                    return number1 / number2;
                default:
                    throw new IllegalArgumentException("Unsupported arithmetic operation: " + operation);
            }
        }

        enum ArithmeticOperation {
            ADDITION ("plus"),
            SUBTRACTION("minus"),
            MULTIPLICATION("times"),
            DIVISION("divide");

            private String value;

            ArithmeticOperation(String value) {
                this.value = value;
            }

            public String getValue() {
                return value;
            }
        }
    }





