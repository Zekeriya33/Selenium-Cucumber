package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.PracticeMedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class PracticeMedunnaStepDefinition {
    PracticeMedunnaPage practiceMedunnaPage = new PracticeMedunnaPage();
    @When("login olmak icin signin e tiklar")
    public void loginOlmakIcinSigninETiklar() {
        practiceMedunnaPage.signinSembol.click();
        practiceMedunnaPage.signinButton.click();
    }

    @And("username icin {string} kullanici adini gonderir")
    public void usernameIcinKullaniciAdiniGonderir(String username) {

        username = Faker.instance().name().username();
        practiceMedunnaPage.username.sendKeys(username);
    }

    @And("password icin {string} parolasini gonderir")
    public void passwordIcinParolasiniGonderir(String password) {

         password = Faker.instance().internet().password();
        practiceMedunnaPage.password.sendKeys(password);
    }

    @And("signine tiklar")
    public void signineTiklar() {
        practiceMedunnaPage.signin2.click();
    }

    @Then("Authentication information not correct uyarisini dogrular")
    public void authenticationInformationNotCorrectUyarisiniDogrular() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(practiceMedunnaPage.kaybolanyazi);
        String actualUyariYazisi = practiceMedunnaPage.kaybolanyazi.getText();
        System.out.println(actualUyariYazisi);
        String expectedUyariYazisi = "Authentication information not correct.";

        Assert.assertEquals(expectedUyariYazisi,actualUyariYazisi);
    }
}
