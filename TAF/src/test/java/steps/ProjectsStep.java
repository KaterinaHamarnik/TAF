package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.projects.CreateProjectPage;

public class ProjectsStep extends BaseStep {
    CreateProjectPage createProjectPage;
    DashboardPage dashboardPage;


    public ProjectsStep(WebDriver driver) {
        super(driver);
        createProjectPage = new CreateProjectPage(driver);
        dashboardPage = new DashboardPage(driver);
    }

    public void addNewProject(){
        dashboardPage.getAddProjectButton().click();
    }

    public void setCheckBox(){
        createProjectPage.getShowAnnouncement().set();
    }

    public void removeCheckBox(){
        createProjectPage.getShowAnnouncement().remove();
    }

    public void chooseRadioButtonForNumber(int number){
        createProjectPage.getRadioButton().selectRadioButtonByIndex(number);
    }

    public void dropDownMenu(){
        createProjectPage.getDropDownMenu().helpDropdownIsVisible();
    }


}
