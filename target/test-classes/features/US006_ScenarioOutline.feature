Feature: US006 Kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC01 Kullanici istedigi kelimeleri aratir

    Given Kullanici "amznUrl" sayfasina gider
    Then  Kullanici "<istenenKelime>" icin arama yapar
    And   Sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And   Sayfayı kapatir
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella       | nutella |
      | selenium      | selenium |
      | SQL           | SQL |

    # TestNG deki dataProvider kullanimindaki gibi Cucumberda da Scenario Outline kullaniriz.
    # Bu şekilde birden fazla kelimeyi tek seferde aratabiliriz.
     # Feature dosyasinda yazdığımız komutta eğer "" (Tırnak) kullanirsak stepDefinition da parametreli
 # bir method oluşturur. Ve artik stepDefinition'ı kullanmadan Feature dosyasında ""(tırnak) içindeki
 # string'i değiştirerek istediğim kelimeyi aratabilirim.
 # Scenario Outline da ise yine ""(Tırnak) içinde birden fazla kelime aratıcaksam "<>" şeklindeki kullanım ile
 # "<>" içine yazdığım herhangi bir kelimeyi Scenario Outline'ın aşağıda oluşturduğu Examples altında aratmak
 # istediğim kelimeleri yazar ve sırasıyla aratabiliriz