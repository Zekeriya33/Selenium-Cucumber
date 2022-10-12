package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@PracticeAmazon",
        dryRun = false
)



public class Runner {
    /*
    Runner claass ı TestNG deki XML mantıgı ile calisir calistirmak istedigimiz senaryolara tag belirtiriz
   ve belirttigimiz tag ları calistirir. XML deki istedigimiz testleri calistirma icin kullaniriz
   Runner class body si bostur ve Runnrt class ını ekleyecegimiz notasyonlar aktive eder.
    Bu class da kullanacagımız 2 adet notasyon vardır
    - @runWith(Cucumber.class) notasyonu Runner class ına calisma ozelligi ekler.
    Bu notasyon oldugu icin cucumber frameworkumuzde Junit kullanmayı tercih ederiz
    -@CucumberOptiıns notasyonu icinde
    features : Runner dosyasının feature dosyasını nereden bulacagını tarif eder
    glue     : StepDefinitions yolunu belirtiriz
    tags     : Hangi tag i calistirirmak istiyorsak onu belli eder

    dryRun : İki secenek vardır
    dryRun = true ; dersek testimizi calistirmadan eksik adimlari bize veriri
    dryRun = false: testlerimizi driver ile calistirir


   */

}
