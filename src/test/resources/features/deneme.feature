@tech
Feature: Techpro Title Test
  Scenario: TC_01_sayfa_baslik_test
    Given techpro anasayfasina gidilir
    When sayfa basligi yazdirilir
    Then sayfa basliginda Bootcamp yazisi oldugu test edilir
    And sayfa kapatilir