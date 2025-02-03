Feature: Menghitung Luas Segitiga
  Sebagai pengguna aplikasi kalkulator,
  Saya ingin dapat menghitung luas segitiga,
  Agar saya bisa mendapatkan hasil perhitungan
  dengan cepat dan akurat.

  Scenario: Menghitung luas segitiga dengan alas dan tinggi yang valid
    Given saya memiliki alas segitiga 10
    And saya memiliki tinggi segitiga 5
    When saya menghitung luas segitiga
    Then hasil hitung luas segitiga harus 25

  Scenario: Menghitung luas segitiga ke dua dengan alas dan tinggi yang valid
    Given saya memiliki alas segitiga 10
    And saya memiliki tinggi segitiga -5
    When saya menghitung luas segitiga
    Then hasil hitung luas segitiga harus -25