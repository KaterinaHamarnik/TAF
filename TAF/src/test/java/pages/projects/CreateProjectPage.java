package pages.projects;

import elements.CheckBox;
import elements.DropDownMenu;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateProjectPage extends BaseProjectPage {
    private final By showAnnouncementLocator = By.id("show_announcement");
    private final By radioButtonLocator = By.id("show_announcement");
    private final By dropDownMenuLocator = By.id("navigation-menu");

    public CreateProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }


    public CheckBox getShowAnnouncement() {
        return new CheckBox(driver, showAnnouncementLocator);
    }
    public RadioButton getRadioButton() {
        return new RadioButton(driver, waitsService.waitForVisibilityBy(radioButtonLocator));
    }
    public DropDownMenu getDropDownMenu() {
        return new DropDownMenu(driver, waitsService.waitForVisibilityBy(dropDownMenuLocator));
    }
}
