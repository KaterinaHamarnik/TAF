package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;
import services.SimpleDriver;

public class SmokeTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        BrowsersService browsersService = new BrowsersService();
        driver = browsersService.getDriver();
    }

    @Test
    public void validateElectricFloorHeatingCalculatorTest() throws InterruptedException {
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");
        WebElement weight = driver.findElement(By.id("el_f_width"));
        WebElement height = driver.findElement(By.id("el_f_lenght"));
        WebElement heatLoss = driver.findElement(By.id("el_f_losses"));
        WebElement button = driver.findElement(By.name("button"));
        WebElement selectWebElement = driver.findElement(By.id("room_type"));
        Select selectRoomType = new Select(selectWebElement);
        WebElement selectWebElement1 = driver.findElement(By.id("heating_type"));
        Select selectHeatingType = new Select(selectWebElement1);


        weight.sendKeys("6");
        height.sendKeys("6");
        selectRoomType.selectByValue("2");
        selectHeatingType.selectByValue("3");
        heatLoss.sendKeys("41");

        button.click();
        Thread.sleep(2000);

        WebElement resultCablePower = driver.findElement(By.id("floor_cable_power"));
        Assert.assertEquals(resultCablePower.getAttribute("value"), "23");
        WebElement resultSpecCablePower = driver.findElement(By.id("spec_floor_cable_power"));
        Assert.assertEquals(resultSpecCablePower.getAttribute("value"), "1");
    }

    @Test
    public void validateSKF() throws InterruptedException {
        driver.get("https://calc.by/building-calculators/laminate.html");
        WebElement heightRoom = driver.findElement(By.id("ln_room_id"));
        WebElement weightRoom = driver.findElement(By.id("wd_room_id"));
        WebElement heightLaminate = driver.findElement(By.id("ln_lam_id"));
        WebElement weightLaminate = driver.findElement(By.id("wd_lam_id"));
        WebElement button = driver.findElement(By.className("calc-btn"));
        WebElement radio = driver.findElement(By.id("direction-laminate-id1"));



        heightRoom.clear();
        heightRoom.sendKeys("500");
        weightRoom.clear();
        weightRoom.sendKeys("400");
        heightLaminate.clear();
        heightLaminate.sendKeys("2000");
        weightLaminate.clear();
        weightLaminate.sendKeys("200");
        radio.click();

        button.click();
        Thread.sleep(2000);

        Assert.assertEquals(driver.findElement(By.cssSelector(".calc-result>div:nth-child(1)>span")).getText(), "53");
        Assert.assertEquals(driver.findElement(By.cssSelector(".calc-result>div:nth-child(2)>span")).getText(), "7");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
