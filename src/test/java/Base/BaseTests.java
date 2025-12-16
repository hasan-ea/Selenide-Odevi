package Base;

import org.testng.annotations.*;


public class BaseTests {

    @BeforeTest
    public void beforeTest(){
        System.out.println("=======Before Test=======");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("=======Before method======");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("=======After method======");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("=======After test======");
    }
}
