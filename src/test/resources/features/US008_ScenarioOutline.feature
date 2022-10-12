@Zekeriya
Feature: TC11 Negatif Test

Scenario Outline: TC11 kullanici gecerli bilgilerle giris yapar
Given kullanici "brcUrl" ana sayfasinda
Then Login yazisina tiklar
And  Kullanici 2 saniye bekler 
And gecersiz "<username>" girer
And Kullanici 2 saniye bekler 
And gecersiz "<password>" password girer
And Kullanici 2 saniye bekler 
And Login butonuna basar
Then sayfaya giris yapilamadigini kontrol eder
And kulllanici sayfayi kapatir



  Examples:
    | username           | password |
    | Manager5@gmail.com | Manager5! |
    | Manager6@gmail.com | Manager6! |
    | Manager7@gmail.com | Manager7! |
    | Manager8@gmail.com | Manager8! |
    | Manager9@gmail.com | Manager9! |










