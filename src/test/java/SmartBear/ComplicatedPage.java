package SmartBear;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ComplicatedPage {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();
        driver.get("https://ultimateqa.com/complicated-page");

        //Create a test to input : name, email, message, sum of 2 numbers from the page and click on submit button.
        //Navigate to https://ultimateqa.com/complicated-page
        // Go to section Section of Random Stuff
        //Input Name (use Random value)
        //Input email
        //Input any messages
        //Add a logic to calculate sum of the 2 numbers(no hard coding please)
        //Input the value of sum
        //Click on submit button

        WebElement name = driver.findElement(By.xpath("//input[@id=\"et_pb_contact_name_0\"]"));

        WebElement emailAddress = driver.findElement(By.xpath("//input[@id=\"et_pb_contact_email_0\"]"));

        WebElement messageBox = driver.findElement(By.xpath("//textarea[@id=\"et_pb_contact_message_0\"]"));

        WebElement textOfNumbers = driver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_0\"]//span[@class=\"et_pb_contact_captcha_question\"]"));

        WebElement sumOfTwoNumbers = driver.findElement(By.xpath("(//input[@class=\"input et_pb_contact_captcha\"])[1]"));

        WebElement submitButton=driver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_0\"]//button[@type=\"submit\"]"));

        name.sendKeys("Gulzhamal");
        emailAddress.sendKeys("gulkenzh@gmail.com");
        messageBox.sendKeys("Hello everyone and my message");

        String textValueOfNumbers=textOfNumbers.getText();
        System.out.println(textValueOfNumbers);

        // indexOf();

        int plussign=textValueOfNumbers.indexOf("+");
        String num1=textValueOfNumbers.substring(0,plussign-1);
        String num2=textValueOfNumbers.substring(plussign+2);

        int one=Integer.parseInt(num1);
        int two=Integer.parseInt(num1);
        int sum=one+two;
        String totalAmount=Integer.toString(sum);
        //String.valueOf();
        sumOfTwoNumbers.sendKeys(totalAmount);
        submitButton.click();













    }
}
