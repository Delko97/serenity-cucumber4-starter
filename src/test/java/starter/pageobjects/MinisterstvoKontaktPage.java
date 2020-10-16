package starter.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class MinisterstvoKontaktPage extends PageObject {

    @FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div")
    private WebElementFacade ministerstvo;

    @FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/p")
    private WebElementFacade ministerAdresa;

    @FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/a[1]")
    private WebElementFacade ministerEmail;

    @FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/a[2]")
    private WebElementFacade ministerTelefon;

    public boolean isMinisterstvoVisible() {
        return ministerstvo.isVisible();
    }

    public String getMinisterstvo() {
        return ministerstvo.getText();
    }

    public boolean isMinisterAdresaVisible() {
        return ministerAdresa.isVisible();
    }

    public String getMinisterAdresa() {
        return ministerAdresa.getText();
    }

    public boolean isMinisterEmailVisible() {
        return ministerEmail.isVisible();
    }

    public String getMinisterEmail() {
        return ministerEmail.getText();
    }

    public boolean isMinisterTelefonVisible() {
        return ministerTelefon.isVisible();
    }

    public String getMinisterTelefon() {
        return ministerTelefon.getText();
    }
}
