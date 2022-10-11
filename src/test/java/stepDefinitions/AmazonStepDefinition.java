package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class AmazonStepDefinition {
    AmazonPage amazonPage =new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
    }

    @Then("Kullanici nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {

        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

    }

    @And("Sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String actualSonuc = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualSonuc.contains("Nutella"));
    }

    @And("Sayfayı kapatir")
    public void sayfayıKapatir() {
        Driver.closeDriver();
    }

    @Then("Kullanici Selenium icin arama yapar")
    public void kullaniciSeleniumIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Selenium", Keys.ENTER);
    }

    @And("Sonuclarin Selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        String actualSonuc = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualSonuc.contains("Selenium"));
    }

    @Then("Kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @And("Sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String actualSonuc = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualSonuc.contains("iphone"));

    }

    @Then("Kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime,Keys.ENTER);
    }

    @And("Sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String actualSonuc = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualSonuc.contains(arananKelime));

    }

    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @When("Url'in {string} icerdigini test edelim")
    public void urlInIcerdiginiTestEdelim(String arananKelime) {
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(arananKelime));

    }

    @Then("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSure) {
        try {
            Thread.sleep(istenenSure*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}