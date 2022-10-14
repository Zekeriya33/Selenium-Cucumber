Feature: US002 Parametre Kullanimi
  Background: Ortak adim
    Given Kullanici amazon sayfasina gider


  Scenario: TC01 Kullanici Amazonda parametreli arama yapar

    Then  Kullanici "nutella" icin arama yapar
    And   Sonuclarin "nutella" icerdigini test eder
    And   Sayfayı kapatir
@gp2
  Scenario: TC02 Kullanici Amazonda parametreli arama yapar

    Then  Kullanici "selenium" icin arama yapar
    And   Sonuclarin "selenium" icerdigini test eder
    And   Sayfayı kapatir

    # Feature dosyasında parametreli arama yaptığımızda ""(tırnak) içine aldığımız string değeri stepDefinitionda
#Bir kere parametreli method oluşturur ve yeni bir arama yapmak istediğimizde
#Tekrar method oluşturmadan feature dosyasından ""(tırnak) içinde belirttiğimiz string ifadeyi değiştirmemiz
#yeterli olucaktır. Böylece kodlarımız dinamik olucaktır

  Scenario: TC03 Kullanici Amazonda parametreli arama yapar

    Then  Kullanici "java" icin arama yapar
    And   Sonuclarin "java" icerdigini test eder
    And   Sayfayı kapatir

  Scenario: TC04 Kullanici Amazonda parametreli arama yapar

    Then  Kullanici "SQL" icin arama yapar
    And   Sonuclarin "SQL" icerdigini test eder
    And   Sayfayı kapatir