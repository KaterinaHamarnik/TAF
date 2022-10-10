package pages;

import baseEntitities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopMenuPage extends BasePage {
    // Блок описания селекторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//div[contains(text(), 'All Projects')]");

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }


    @Override
    protected By getPageIndentifier() {
        return null;
    }

    // Блок инициализации страницы

    // Блок атомарных методов
    public WebElement getHeaderTitleLabel(){ return driver.findElement(headerTitleLabelLocator);}

    public boolean isHeaderTitleLabelDisplayed(){return getHeaderTitleLabel().isDisplayed();}


}
