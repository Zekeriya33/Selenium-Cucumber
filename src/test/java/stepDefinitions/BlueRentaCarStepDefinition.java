package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;
import java.io.IOException;

public class BlueRentaCarStepDefinition {

    Actions actions = new Actions(Driver.getDriver());
    BrcPage brcPage =new BrcPage();
    @Given("kullanici bluerentacar ana sayfasinda")
    public void kullaniciBluerentacarAnaSayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brcPage.loginButonu.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        brcPage.eMail.sendKeys("gecersiz@gmail.com");
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys("12345").perform();
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {

        Assert.assertTrue(brcPage.login2Butonu.isDisplayed());

        try {
            ReusableMethods.getScreenshotWebElement("brcgirilemedi",brcPage.girilemediYazisi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @Given("kullanici {string} ana sayfasinda")
    public void kullaniciAnaSayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("gecersiz {string} girer")
    public void gecersizGirer(String istenenUserName ) {

       brcPage.eMail.sendKeys(istenenUserName);

    }


    @And("gecersiz {string} password girer")
    public void gecersizPasswordGirer(String istenenPassword) {
        actions.sendKeys(Keys.TAB).sendKeys(istenenPassword).perform();
    }
}

