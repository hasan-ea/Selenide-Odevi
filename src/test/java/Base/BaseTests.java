package Base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseTests {

    @BeforeTest
    public void beforeTest(){
        System.out.println("=======Before Test=======");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("=======Before method======");
    }

}
