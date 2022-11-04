package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import services.WaitsService;

import java.time.Duration;

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
        //Select menu = new Select(driver.findElement(By.xpath((".//a[contains(@onclick, 'this.blur(); App.Help.showAbout(); return false;')]"))));
       // menu.selectByVisibleText("                About TestRail            ");

        driver.findElement(By.xpath("//a[text()='Gurock Blog']")).isDisplayed();
        driver.findElement(By.xpath("//a[text()='Gurock Blog]")).click();

        //button.click();

//        WebElement webElement = driver.findElement(By.cssSelector("[href='javascript:void(0)']"));
//        Actions actions = new Actions(driver);
//        actions
//                .click(driver.findElement(By.id("navigation-menu")))
//                .moveToElement(webElement)
//                .click(webElement)
//                .build()
//                .perform();
//        driver.findElement(By.className("dialog-logo")).isDisplayed();
    }
}
