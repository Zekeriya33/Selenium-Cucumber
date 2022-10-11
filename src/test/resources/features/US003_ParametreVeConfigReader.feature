Feature: Parametre Kullanimi
  Scenario:TC01 Parametre kullaniminda ConfigReader Kullanimi

    Given Kullanici "faceUrl" sayfasina gider
    Then  Kullanici 3 saniye bekler
    When  Url'in "facebook" icerdigini test edelim
    And   Sayfayı kapatir

  Scenario:TC02 Parametre kullaniminda ConfigReader Kullanimi

    Given Kullanici "brcUrl" sayfasina gider
    Then  Kullanici 3 saniye bekler
    When  Url'in "blue" icerdigini test edelim
    And   Sayfayı kapatir

  Scenario:TC03 Parametre kullaniminda ConfigReader Kullanimi

    Given Kullanici "google" sayfasina gider
    Then  Kullanici 3 saniye bekler
    When  Url'in "google" icerdigini test edelim
    And   Sayfayı kapatir

