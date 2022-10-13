package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {

    GuruPage guruPage = new GuruPage();
    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String baslik) {
        int index =0;
        for (int i = 0; i <guruPage.basliklar.size() ; i++) {
            if (guruPage.basliklar.get(i).getText().equals(baslik)){ // Featureden gelen string degeri i degerine esitledik
                System.out.println(guruPage.basliklar.get(i).getText()); // Feature dan gelen baslıgı yazdırdık
                index=i+1; // Feature den gelen ve i degerine esitledigimiz string i aynı degere sahip sutunlarıda yazdırabilmek icin
                // bos bir konteyner olusturup ona atadık. Index listte index 0(sıfır) dan basladıgı icin ve WebTable locate imiz 1 den
                // basladıgı icin i degerini bir arttırdık
                List<WebElement> sutunElement =
                        Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+index+"]"));
                // Sonrasında Webtable daki body i locate edip esitledigimiz index i baslık altındaki sutunu getirebilmesi icin bu liste

                sutunElement.forEach(t->System.out.println(t.getText()));
                // lambda ile son sutunu yazdırdık

            }

        }
    }
}
