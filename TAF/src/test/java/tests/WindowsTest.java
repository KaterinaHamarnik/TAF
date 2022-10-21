package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowsTest extends BaseTest {

    @Test
    public void windowsTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        String originalWindow = driver.getWindowHandle();
        System.out.println(originalWindow);

        driver.findElement(By.linkText("Click Here")).click();

        List<String> windowHandlesList = new ArrayList<>(driver.getWindowHandles());

        System.out.println(windowHandlesList.get(windowHandlesList.size() - 1));
        driver.switchTo().window(windowHandlesList.get(windowHandlesList.size() - 1));

        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "New Window");

        driver.close();

        driver.switchTo().window(originalWindow);
        Thread.sleep(2000);
        driver.findElement(By.linkText("Click Here")).click();
    }
}
