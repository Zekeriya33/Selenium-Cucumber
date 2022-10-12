Feature: US007 Scenario Outline Kullanimi

  Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi
    Given Kullanici "<arananUrl>" sayfasina gider
    Then Kullanici 3 saniye bekler
    When Url'in "<arananKelime>" icerdigini test edelim
    And Sayfayı kapatir
    Examples:
      | arananUrl   | arananKelime       |
      | amznUrl     | amazon             |
      | faceUrl     | facebook           |
      | google      | google             |
      | wuniversity | webdriveruniversit |
      | brcUrl      | blue               |