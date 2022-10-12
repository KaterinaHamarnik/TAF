package tests;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class BasicLocatorsTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new BrowsersService().getDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void saucedemoTest() {
        driver.get(ReadProperties.getUrl());

        driver.findElement(By.cssSelector("#user-name")).sendKeys(ReadProperties.username());

        driver.findElement(By.id("password")).sendKeys(ReadProperties.password());

        driver.findElement(By.cssSelector("#login-button")).click();

        driver.findElement(By.xpath("//button[contains(@id, 'add-to-cart-sauce-labs-backpack')]")).click();

        driver.findElement(By.className("shopping_cart_link")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText(), "Sauce Labs Backpack");
        Assert.assertEquals(driver.findElement(By.cssSelector("div.inventory_item_price")).getText(), "$29.99");
    }
}
