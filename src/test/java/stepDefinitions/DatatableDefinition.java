package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DataTablePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DatatableDefinition {
    DataTablePage dataTablePage = new DataTablePage();
    Actions actions = new Actions(Driver.getDriver());

    @When("kullanici datatable adresine gider")
    public void kullaniciDatatableAdresineGider() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @Then("new butonuna basar")
    public void newButonunaBasar() {

        dataTablePage.newButton.click();
    }

    @And("isim bolumune {string} girer")
    public void isimBolumuneGirer(String firstName) {
        dataTablePage.firstName.sendKeys(firstName);
    }

    @And("soyisim bolumune {string} girer")
    public void soyisimBolumuneGirer(String lastName) {
        actions.sendKeys(Keys.TAB).sendKeys(lastName).perform();

    }

    @And("position bolumune{string} girer")
    public void positionBolumuneGirer(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
    }

    @And("office bolumune{string} girer")
    public void officeBolumuneGirer(String office) {
        actions.sendKeys(Keys.TAB).sendKeys(office).perform();
    }

    @And("extension bolumune{string} girer")
    public void extensionBolumuneGirer(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
    }

    @And("startdate bolumune{string} girer")
    public void startdateBolumuneGirer(String startdate) {
        actions.sendKeys(Keys.TAB).sendKeys(startdate).perform();
    }

    @And("salary bolumune{string} girer")
    public void salaryBolumuneGirer(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
    }



    @And("Create tusuna basar")
    public void createTusunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dataTablePage.search.sendKeys(firstname);

    }

    @Then("isim bolumunün {string} oldugunu dogrular")
    public void isimBolumunünOldugunuDogrular(String isim) {
        Assert.assertTrue(dataTablePage.isimVar.getText().contains(isim));
    }





}
