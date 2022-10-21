package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest {

    @Test
    public void frameTest(){
        driver.get("http://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        driver.findElement(By.xpath("//p[. = 'Your content goes here.']")).isDisplayed();
    }
}
