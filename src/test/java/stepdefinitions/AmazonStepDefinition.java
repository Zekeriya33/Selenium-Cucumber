package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage =new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
    }

    @Then("Kullanici nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {

       amazonPage.aramaKutusu.sendKeys("Nutella",Keys.ENTER);

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
}


