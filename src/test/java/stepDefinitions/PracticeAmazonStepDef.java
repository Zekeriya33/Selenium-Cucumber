package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;


public class PracticeAmazonStepDef {

    AmazonPage amazonPage = new AmazonPage();
    Faker faker =new Faker();



    @When("sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
     amazonPage.signinButonu.click();

    }
    @When("faker kullanarak e-posta gonderir")
    public void faker_kullanarak_e_posta_gonderir() {
        amazonPage.signinEMail.sendKeys(faker.internet().emailAddress());


    }
    @When("gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigi_e_postanin_ekran_goruntusunu_alir() {
        try {
            ReusableMethods.getScreenshotWebElement("amazonpageemail",amazonPage.signinEMail);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    @When("continiue'a tiklar")
    public void continiue_a_tiklar() {
        amazonPage.signinContiniue.click();


    }
    @When("There was a problem mesajini dogrular")
    public void there_was_a_problem_mesajini_dogrular() {
        Assert.assertTrue(amazonPage.problemMessage.isDisplayed());


    }
    @When("Need help e tiklar")
    public void need_help_e_tiklar() {
        amazonPage.needHelp.click();


    }
    @When("forgot your password e tiklar")
    public void forgot_your_password_e_tiklar() {
        amazonPage.forgotPassword.click();


    }
    @Then("Password assistance metnini dogrular")
    public void password_assistance_metnini_dogrular() {
        Assert.assertTrue(amazonPage.passwordAssistanceText.isDisplayed());


    }
    @Then("Geri gider")
    public void geri_gider() {
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

    }
    @Then("Create your account butonuna tiklar")
    public void create_your_account_butonuna_tiklar() {
        amazonPage.createYourAccountButton.click();


    }
    @Then("Create account metnini dogrular")
    public void create_account_metnini_dogrular() {
        Assert.assertTrue(amazonPage.createAccountText.isDisplayed());


    }
    @Then("websayfasini kapatir")
    public void websayfasini_kapatir() {
        Driver.closeDriver();


    }

    @When("kullanici https:\\/\\/editor.datatables.net\\/ adresine gider")
    public void kullaniciHttpsEditorDatatablesNetAdresineGider() {
    }
}
