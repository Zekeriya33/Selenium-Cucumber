Feature: US011 Class Work

  Scenario Outline: TC_01 Kullanici sutun basligi ile liste alabilmeli
    Given Kullanici "guruUrl" sayfasinda
    And "<Basliklar>" sutunundaki tum degerleri yazdirir
    Examples:
      | Basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |
    Scenario: Kullanıcı sayfayı kapatır
      Given Sayfayı kapatir