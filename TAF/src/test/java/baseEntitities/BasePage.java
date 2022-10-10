package baseEntitities;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    protected abstract By getPageIndentifier();

    public boolean isPAgeOpened(){
        return driver.findElement(getPageIndentifier()).isDisplayed();
    }

    public void openPageByUrs(String pagePath){
        driver.get(ReadProperties.getUrl() + pagePath);
    }
}
