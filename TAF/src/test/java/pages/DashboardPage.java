package pages;

import baseEntitities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {
    // Блок описания селекторов для элементов
    private final String pagePath = "index.php?/dashboard";
    private final By headerTitleLabelLocator = By.xpath("//div[contains(text(), 'All Projects')]");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }


    @Override
    protected By getPageIndentifier() {
        return null;
    }

    // Блок инициализации страницы

    // Блок атомарных методов
    public void openPageByUrl(String pagePath){
        super.openPageByUrs(pagePath);
    }
    public WebElement getHeaderTitleLabel(){ return driver.findElement(headerTitleLabelLocator);}

    public boolean isHeaderTitleLabelDisplayed(){return getHeaderTitleLabel().isDisplayed();}


}
