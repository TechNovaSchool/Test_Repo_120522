
package testWithPOM;

import Utilitis.Config;
import Utilitis.Driver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPageSmartBearPage;

public class TestLogin {
    LoginPageSmartBearPage loginPageSmartBearPage =new LoginPageSmartBearPage();

    @BeforeClass
    public void setUp(){

        Driver.getDriver().get(Config.getProperty("urlSmartBear"));
    }
    @Test
    public void loginTest(){
       loginPageSmartBearPage.username.sendKeys(Config.getProperty("login"));
        loginPageSmartBearPage.password.sendKeys(Config.getProperty("pass"));
        loginPageSmartBearPage.loginBtn.click();


    }
}
