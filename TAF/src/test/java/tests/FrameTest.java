package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest {

    @Test
    public void frameTest(){
        driver.get("http://the-internet.herokuapp.com/iframe");

        driver.findElement(By.tagName("h3")).isDisplayed();

        //находим и переключаемся в frame
        //driver.switchTo().frame(driver.findElement(By.tagName("iframe"))); // по тэгу
        driver.switchTo().frame("mce_0_ifr"); // можно сразу по id
        //driver.switchTo().frame(0); // если нет тэга или других опознавательных эл, начинаются с 0

        driver.findElement(By.xpath("//p[. = 'Your content goes here.']")).isDisplayed();

        driver.switchTo().defaultContent(); //переключает в первоначальный документ, т.е котрый содержит все элименты
        //driver.switchTo().parentFrame(); //вернет на один уровень выше, т.е в родительский

        driver.findElement(By.tagName("h3")).isDisplayed();

    }
}
