Feature: US001 Background Kullanimi

  Background: Ortak adimlar
    Given Kullanici amazon sayfasina gider

  Scenario: TC01 Kullanıcı Amazon da nutella aratır


    Then  Kullanici nutella icin arama yapar
    And   Sonuclarin nutella icerdigini test eder

  Scenario: TC02 Kullanıcı Amazon da Selenium aratır


    Then  Kullanici Selenium icin arama yapar
    And   Sonuclarin Selenium icerdigini test eder

  Scenario: TC03 Kullanıcı Amazon da iphone aratır


    Then  Kullanici iphone icin arama yapar
    And   Sonuclarin iphone icerdigini test eder
    And   Sayfayı kapatir