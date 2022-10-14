Feature: Amazon Search
  @gp1
  Scenario: TC01 Kullanıcı Amazon da nutella aratır

    Given Kullanici amazon sayfasina gider
    Then  Kullanici nutella icin arama yapar
    And   Sonuclarin nutella icerdigini test eder


  Scenario: TC02 Kullanıcı Amazon da Selenium aratır

    Given Kullanici amazon sayfasina gider
    Then  Kullanici Selenium icin arama yapar
    And   Sonuclarin Selenium icerdigini test eder


  Scenario: TC03 Kullanıcı Amazon da iphone aratır

    Given Kullanici amazon sayfasina gider
    Then  Kullanici iphone icin arama yapar
    And   Sonuclarin iphone icerdigini test eder
    And   Sayfayı kapatir
