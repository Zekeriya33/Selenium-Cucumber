@medunna
Feature: Meduna login negative test

  Scenario Outline: Negative login test
    Given Kullanici "medunnaUrl" sayfasina gider
    When   login olmak icin signin e tiklar
    And    Kullanici 3 saniye bekler
    And    username icin "<username>" kullanici adini gonderir
    And    Kullanici 3 saniye bekler
    And    password icin "<password>" parolasini gonderir
    And    Kullanici 3 saniye bekler
    And    signine tiklar
    And    Kullanici 8 saniye bekler
    Then   Authentication information not correct uyarisini dogrular
    Examples:
      | username | password |
      | username | password |