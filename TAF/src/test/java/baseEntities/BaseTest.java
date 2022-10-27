package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import services.BrowsersService;
import steps.LoginStep;
import utils.Listener;

@Listeners(Listener.class)
public class BaseTest {
    protected WebDriver driver;
    protected LoginStep loginStep;

    @BeforeMethod
    public void setUp(ITestContext iTestContext) {
        driver = new BrowsersService().getDriver();
        this.setDriverToContexst(iTestContext, driver);

        driver.get(ReadProperties.getUrl());

        loginStep = new LoginStep(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public static void setDriverToContexst(ITestContext iTestContext, WebDriver driver){
        iTestContext.setAttribute("WebDriver", driver);
    }

}
