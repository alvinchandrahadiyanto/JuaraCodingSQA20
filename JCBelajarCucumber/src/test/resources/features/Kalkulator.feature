Feature: Kalkulator App

  Scenario: Menjumlahkan dua angka positif
    Given saya memiliki angka 5
    And saya memiliki angka kedua 3
    When saya menjumlahkan kedua angka tersebut
    Then hasil penjumlahan harus 8

  Scenario: Menjumlahkan dua angka negatif
    Given saya memiliki angka -4
    And saya memiliki angka kedua -6
    When saya menjumlahkan kedua angka tersebut
    Then hasil penjumlahan harus -10

  Scenario: Menjumlahkan angka positif dan negatif
    Given saya memiliki angka 7
    And saya memiliki angka kedua -2
    When saya menjumlahkan kedua angka tersebut
    Then hasil penjumlahan harus 5

    Given saya memiliki angka 5 untuk pengurangan
    And saya memiliki angka kedua 3 untuk pengurangan
    When saya mengurangi kedua angka tersebut
    Then hasil pengurangan harus 2