@Zekeriya
Feature:US009 Class Work

  Scenario Outline:TC01 Kullanici adresine gider

And Kullanici 2 saniye bekler
When kullanici datatable adresine gider
Then new butonuna basar
And isim bolumune "<firstname>" girer
And Kullanici 2 saniye bekler
And soyisim bolumune "<last name>" girer
And Kullanici 2 saniye bekler
And position bolumune"<position>" girer
And Kullanici 2 saniye bekler
And office bolumune"<office>" girer
And Kullanici 2 saniye bekler
And extension bolumune"<extension>" girer
And Kullanici 2 saniye bekler
And startdate bolumune"<startdate>" girer
And Kullanici 2 saniye bekler
And salary bolumune"<salary>" girer
And Kullanici 2 saniye bekler
And  Create tusuna basar
When kullanici "<firstname>" ile arama yapar
Then isim bolumunün "<firstname>" oldugunu dogrular
    Examples:
      | firstname  | last name  | position  | office    | extension    | startdate     | salary |
      | Ali        | Veli      | Qa       | Google   | Senior         | 2022-6-2      | 15000  |
      | Ahmet      | Mehmet    | Qa       | Google   | Junior         | 2021-10-10    | 10500  |
      | Hasan      | Duman     | Dev      | Amazon   | Junior         | 2020-11-12    | 25000  |
      | Akin       | Alkan     | Dev      | Amazon   | Senior         | 2009-12-5     | 50000  |
      | Orhan      | Duman     | PO       | WallMart | Senior         | 2006-6-6      | 30000  |

