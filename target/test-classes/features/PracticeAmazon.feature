@PracticeAmazon
Feature: Amazon Practice

  Scenario: Amazon Sing in Test
    Given kullanici Amazon web sitesine gider
    When  sign in butonuna tiklar
    And   faker kullanarak e-posta gonderir
    And   Kullanici 2 saniye bekler
    And   gonderdigi e-postanin ekran goruntusunu alir
    And   Kullanici 2 saniye bekler
    And   continiue'a tiklar
    And   Kullanici 2 saniye bekler
    And   There was a problem mesajini dogrular
    And   Kullanici 2 saniye bekler
    And   Need help e tiklar
    And   Kullanici 2 saniye bekler
    And   forgot your password e tiklar
    Then  Password assistance metnini dogrular
    And   Geri gider
    And   Create your account butonuna tiklar
    And   Create account metnini dogrular
    And   websayfasini kapatir