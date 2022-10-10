package pages;

import baseEntitities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    // Блок описания селекторов для элементов
    private final By emailInputLocator = By.id("name");
    private final By pswInputLocator = By.id("password");
    private final By loginButtonLocator = By.id("button_primary");

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Блок инициализации страницы


    @Override
    protected By getPageIndentifier() {
        return null;
    }

    // Блок атомарных методов
    public WebElement getEmailInput() { return driver.findElement(emailInputLocator); }
    public WebElement getPswInput() { return driver.findElement(pswInputLocator); }
    public WebElement getLoginButton() { return driver.findElement(loginButtonLocator); }

    public void setEmail(String value) { getEmailInput().sendKeys(value); }
    public void setPsw(String value) { getPswInput().sendKeys(value); }
    public void clickLoginButton() { getLoginButton().click(); }
}
