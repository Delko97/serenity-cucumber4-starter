package starter.tests;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.steps.MinisterstvoKontaktySteps;
import starter.steps.MinisterstvoNavigationSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("testdata/MinisterstvoKontakt.csv")
public class MinisterstvoKontaktTest {

    @Steps
    private MinisterstvoNavigationSteps navigationSteps;

    @Steps
    private MinisterstvoKontaktySteps kontaktySteps;

    private String ministerstvo;
    private String adresaMinisterstva;
    private String emailMinister;
    private String telefonMinister;

    @Test
    public void ministerKontaktTest() {
        navigationSteps.openMinisterstvoPage();
        navigationSteps.clickKontakty();
        kontaktySteps.checkMinisterKontakt();
    }
}
