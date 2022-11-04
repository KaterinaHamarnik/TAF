package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import services.WaitsService;

import java.time.Duration;
import java.util.List;

public class DropDownMenu {
    private UIElement uiElement;
    private WebDriver driver;


    public DropDownMenu(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.driver = driver;
    }


    public DropDownMenu(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
        this.driver = driver;
    }

    public void helpDropdownIsVisible(){
        driver.findElement(By.id("navigation-menu")).click();
        driver.findElement(By.xpath("//div/ul/li/a[@href=\"https://www.gurock.com/testrail/docs/user-guide/getting-started\"]")).click();
    }
}
