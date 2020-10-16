package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pageobjects.MinisterstvoNavigationPage;

public class MinisterstvoNavigationSteps {

    private MinisterstvoNavigationPage navigationPage;

    @Step
    public void openMinisterstvoPage() {
        navigationPage.open();
    }

    @Step
    public void clickKontakty() {
        navigationPage.clickOnKontakt();
    }

}
