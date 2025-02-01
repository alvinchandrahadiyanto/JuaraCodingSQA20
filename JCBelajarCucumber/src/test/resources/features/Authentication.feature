Feature: Authentication feature

  Scenario: Pendaftaran berhasil dengan data valid
    Given saya mengisi field nama dengan "John Doe"
    And saya mengisi field nomor telepon dengan "08123456789"
    And saya mengisi field nama bisnis dengan "Toko ABC"
    And saya memilih tipe bisnis "Retail"
    And saya mengisi field email dengan "john@example.com"
    And saya mengisi field kata sandi dengan "password123"
    And saya mengisi field konfirmasi kata sandi dengan "password123"
    And saya mencentang checkbox setuju
    Then button Daftar harus aktif
    When saya menekan button Daftar
    Then saya berhasil mendaftar dan mendapatkan pesan "Pendaftaran berhasil"

  Scenario: Button Daftar tidak aktif jika ada field wajib yang kosong
    Given saya tidak mengisi salah satu field wajib
    Then button Daftar harus tidak aktif

  Scenario: Button Daftar tidak aktif jika kata sandi tidak cocok
    Given saya mengisi field kata sandi dengan "password123"
    And saya mengisi field konfirmasi kata sandi dengan "password456"
    Then muncul pesan kesalahan "Belum sesuai dengan kata sandi."

  Scenario: Button Daftar tidak aktif jika format email tidak valid
    Given saya mengisi field email dengan "johnexample.com"
    Then muncul pesan kesalahan "Harap isi dengan format yang benar."

  Scenario: Button Daftar tidak aktif jika checkbox setuju tidak dicentang
    Given saya mengisi semua field dengan data yang valid kecuali checkbox setuju
    Then button Daftar harus tidak aktif
