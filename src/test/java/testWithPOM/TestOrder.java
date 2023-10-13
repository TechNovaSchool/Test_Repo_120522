package testWithPOM;

import Utilitis.Config;
import Utilitis.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.OrderPageSmartBearPage;

public class TestOrder {
    Faker faker = new Faker();
    OrderPageSmartBearPage orderPageSmartBearPage = new OrderPageSmartBearPage();
    TestLogin testLogin = new TestLogin();

    @BeforeClass
    public void setUp() {
        Driver.getDriver().get(Config.getProperty("urlSmartBear"));

    }
    @Test
    public void OrderTest(){
        testLogin.loginTest();


        String cosName=faker.name().fullName();
        String address=faker.address().streetAddress();
        String city1=faker.address().city();
        String state1=faker.address().state();
        String zipCode1=faker.address().zipCode().substring(0,5);

        orderPageSmartBearPage.orderBtn.click();

        Select select = new Select(orderPageSmartBearPage.dropDown);
        select.selectByIndex(1);
        orderPageSmartBearPage.quantityBox.sendKeys(Keys.BACK_SPACE,"2");
        orderPageSmartBearPage.calculationBtn.click();

        orderPageSmartBearPage.fullName.sendKeys(cosName);
        orderPageSmartBearPage.street.sendKeys(address);
        orderPageSmartBearPage.city.sendKeys(city1);
        orderPageSmartBearPage.state.sendKeys(state1);
        orderPageSmartBearPage.zipCode.sendKeys(zipCode1);
        orderPageSmartBearPage.visaBtn.click();
        orderPageSmartBearPage.cardBtn.sendKeys(faker.finance().creditCard().replaceAll("-",""));
        orderPageSmartBearPage.dateE.sendKeys("12/12");
        orderPageSmartBearPage.processBtn.click();


    }






















}
