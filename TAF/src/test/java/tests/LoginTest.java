package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.projects.CreateProjectPage;
import steps.ProjectsStep;

public class LoginTest extends BaseTest {


    @Test
    public void successLoginTest1() {
        ProjectsStep projectsStep = new ProjectsStep(driver);

        loginStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());
        projectsStep.addNewProject();

        projectsStep.setCheckBox();
        projectsStep.removeCheckBox();

        projectsStep.chooseRadioButtonForNumber(2);

        projectsStep.dropDownMenu();
    }

}