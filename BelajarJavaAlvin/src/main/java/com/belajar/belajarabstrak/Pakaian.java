package com.belajar.belajarabstrak;

public abstract class Pakaian  {
    private String merek;
    private int ukuran;
    private String warna;

    Pakaian(String merek, int ukuran, String warna) {
        this.merek = merek;
        this.ukuran = ukuran;
        this.warna = warna;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

//    public abstract void sablon(String teks);
}
