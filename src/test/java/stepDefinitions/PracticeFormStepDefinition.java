package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.PracticeFormPage;
import utilities.Driver;

import java.util.Random;

public class PracticeFormStepDefinition {
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    @Given("Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {
        Driver.getDriver().get(url);

    }

    @When("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void usernamePasswordVeTextareaKisimlariniDoldurur(String username, String password, String textarea) {

        username = Faker.instance().name().username();
        password = Faker.instance().internet().password();
        textarea = Faker.instance().animal().name();

        practiceFormPage.username.sendKeys(username);
        practiceFormPage.password.sendKeys(password);
        practiceFormPage.textArea.clear();
        practiceFormPage.textArea.sendKeys(textarea);


    }

    @And("bir dosya yukler")
    public void birDosyaYukler() {

        practiceFormPage.chooseFile.sendKeys("C:\\Users\\asus\\OneDrive\\Masaüstü\\text.txt");



   //  String homeDirectory= System.getProperty("user.home");
   //  String filePath =homeDirectory+"/Masaüstü/text.txt";
   //  practiceFormPage.chooseFile.sendKeys(filePath);

    }

    @And("checkbox1 i secer")
    public void checkboxISecer() {
        if (!practiceFormPage.checkbox1.isSelected()){
            practiceFormPage.checkbox1.click();

        }
        if (practiceFormPage.checkbox2.isSelected()){
            practiceFormPage.checkbox2.click();
        }
        if (practiceFormPage.checkbox3.isSelected()){
            practiceFormPage.checkbox3.click();
        }

    }

    @And("radio2 yi secer")
    public void radioYiSecer() {
        practiceFormPage.radio2Button.click();

    }

    @And("selection item3 secer")
    public void selectionItemSecer() {
        practiceFormPage.selectItem3.click();

    }

    @And("dropdown itmem4 secer")
    public void dropdownItmemSecer() {
        Select select = new Select(practiceFormPage.dropdown);
        Random random = new Random();
       int rasgele = random.nextInt(select.getOptions().size()-1);
        select.selectByIndex(rasgele);
    }

    @And("submite tiklar")
    public void submiteTiklar() {

        practiceFormPage.submitButton.click();

    }

    @And("dosyanin yuklendigini dogrular")
    public void dosyaninYuklendiginiDogrular() {

        Assert.assertTrue(practiceFormPage.fileName.isDisplayed());
    }
}
