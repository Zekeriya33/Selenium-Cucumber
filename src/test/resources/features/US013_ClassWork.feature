@Web
Feature: US013 Class Work
  Scenario: Kullanici ve Url Testi
    Given Kullanici "webUrl" sayfasinda
    Then kullanici Login Portala kadar asagi iner
    And kullanici Login Portala tiklar
    And Kullanici 3 saniye bekler
    And kullanici diger windowa gecer
    And Kullanici 3 saniye bekler
    And kullanici "username" kutusuna bilgileri girer
    And kullanici "password" bolumune bilgileri girer
    And Kullanici 3 saniye bekler
    And kullanici login butonuna basar
    And Kullanici 3 saniye bekler
    And kullanici Popup'ta cikan yazinin validation failed oldugunu test eder
    And Kullanici 3 saniye bekler
    And kullanici Ok diyerek Popup'i kapatir
    And Kullanici 3 saniye bekler
    And kullanici ilk sayfaya geri doner
    And Kullanici 3 saniye bekler
    And kullanici ilk sayfaya donuldugunu test eder
    And Sayfayı kapatir
