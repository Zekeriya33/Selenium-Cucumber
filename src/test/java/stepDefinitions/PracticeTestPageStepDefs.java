package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.PracticeTestPage;
import utilities.Driver;

import java.util.List;

public class PracticeTestPageStepDefs {
    PracticeTestPage practiceTestPage = new PracticeTestPage();
    Actions actions = new Actions(Driver.getDriver());
    int down32toplam;
    int clickTextToplam;
    int sonuc;

    @Given("{string} adresine gidin")
    public void adresineGidin(String url) {
        Driver.getDriver().get(url);
    }

    @And("{int} defa click me ye tiklayin")
    public void defaClickMeYeTiklayin(int int1) {
        for (int i = 0; i <int1 ; i++) {
            practiceTestPage.clickMe.click();
        }

    }

    @And("{int} defa Space dugmesine basin")
    public void defaSpaceDugmesineBasin(int int1) {
        for (int i = 0; i <int1 ; i++) {
           actions.sendKeys(Keys.SPACE).perform();
        }

    }
    @And("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void downYazisindakiIkiBasamakliSayilarinHepsiniToplayin() {
      List<WebElement> down32 = practiceTestPage.down32;
        for (WebElement w:down32  ) {

          down32toplam+= Integer.parseInt(w.getText().replaceAll("[^0-9]",""));
        }
        System.out.println("down32 toplam :"+ down32toplam);
    }

    @Then("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tumClickMetinlerininUzunlugununToplaminiOncekiToplamdanCikarin() {

        List<WebElement> clikText = practiceTestPage.clikText;
        for (WebElement w: clikText     ) {

          clickTextToplam += w.getText().length();




        }
        sonuc = down32toplam-clickTextToplam;
        System.out.println("sonuc = " + sonuc);
    }

    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucunOldugunuDogrulayin(int istenenSonuc) {
        Assert.assertEquals("Sonuc esit degil",istenenSonuc,sonuc);

    }
}
