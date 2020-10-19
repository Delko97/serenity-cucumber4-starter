package starter.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import starter.pageobjects.MinisterstvoKontaktPage;

public class MinisterstvoKontaktySteps {

    private MinisterstvoKontaktPage kontaktPage;

    @Step
    public void checkMinisterKontakt(String ministerstvo,String email,String telefon) {
        checkMinisterstvo(ministerstvo);
        checkMinisterEmail(email);
        checkMinisterTelefon(telefon);
    }

    @Step
    public void checkMinisterstvo(String ministerstvo) {
        Assert.assertTrue("Ministerstvo nie je zobrazene",kontaktPage.isMinisterstvoVisible());
        Assert.assertEquals("Ministerstva sa nezhoduju",ministerstvo,kontaktPage.getMinisterstvo());
    }

    @Step
    public void checkMinisterEmail(String email) {
        Assert.assertTrue("Emailova adresa ministra nie je zobrazena",kontaktPage.isMinisterEmailVisible());
        Assert.assertEquals("Emailove adresy ministra sa nezhoduju",email,kontaktPage.getMinisterEmail());
    }

    @Step
    public void checkMinisterTelefon(String telefon) {
        Assert.assertTrue("Telefon ministra nie je zobrazeny", kontaktPage.isMinisterTelefonVisible());
        Assert.assertEquals("Telefony ministra sa nezhoduju",telefon,kontaktPage.getMinisterTelefon());
    }

}
