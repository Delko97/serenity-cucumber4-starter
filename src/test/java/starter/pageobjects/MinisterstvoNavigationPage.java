package starter.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.mirri.gov.sk/")
public class MinisterstvoNavigationPage extends PageObject {


    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div/div[1]/nav/ul/li[1]")
    private WebElementFacade aktuality;

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div/div[1]/nav/ul/li[2]")
    private WebElementFacade minister;

    // ..... dalsie linky

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div/div[1]/nav/ul/li[6]")
    private WebElementFacade kontakt;

    public void isKontaktVisible() {
        kontakt.isVisible();
    }

    public void clickOnKontakt() {
        kontakt.click();
    }
}
