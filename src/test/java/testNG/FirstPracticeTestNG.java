package testNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class FirstPracticeTestNG {

    @BeforeClass
    public void setUp(){
        System.out.println("This is Before class running");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before method");
    }

    @Test

    public void b_firstTest(){
        System.out.println("The first test is running ");
    }

    @Test
    public void a_secondTest(){
        System.out.println("THe second Test is running");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("This is After Method running");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This is after class is running");
    }
    @Test
    public void c_thirdTest(){
        System.out.println("THe third Test is running");

        /*if ("winter".equals("winter")){
            System.out.println("Test PAss");
        }
        else {
            System.out.println("Test Failed");
        }*/
        Assert.assertEquals("one","one","String comparison failed");
        Assert.assertEquals(1,1);
        Assert.assertTrue(true);
    }



}
