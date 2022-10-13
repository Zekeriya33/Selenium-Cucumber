Feature: US004 Parametre Kullanimi

  Scenario: TC01 Parametre Kullanimi
    Given Kullanici "hepsiUrl" sayfasinda
    Then  Kullanici 3 saniye bekler
    When  Url'in "amazon" icerdigini test edelim
    And   Sayfayı kapatir