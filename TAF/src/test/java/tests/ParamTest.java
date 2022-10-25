package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;

public class ParamTest extends BaseTest {

    @Test
    public void paramTest(){
        System.out.println(System.getProperty("testProp"));
    }
}
