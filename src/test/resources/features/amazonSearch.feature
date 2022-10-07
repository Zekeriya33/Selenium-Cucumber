Feature: Amazon Search

  Scenario: TC01 Kullanıcı Amazon da nutella aratır

    Given Kullanici amazon sayfasina gider
    Then  Kullanici nutella icin arama yapar
    And   Sonuclarin nutella icerdigini test eder
    And   Sayfayı kapatir